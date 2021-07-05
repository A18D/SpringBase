package hibernate_ManyToMAny;

import hibernate_ManyToMAny.entity.Child;
import hibernate_ManyToMAny.entity.Section;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import java.io.File;

public class AppDel {
    public static void main(String[] args) {

        File f = new File("resources/hibernate.cfg.xml");
        SessionFactory factory = new Configuration()
                .configure(f)
                .addAnnotatedClass(Child.class)
                .addAnnotatedClass(Section.class)
                .buildSessionFactory();
        Session session = null;

        try {
            session = factory.getCurrentSession();
            session.beginTransaction();
            Section section = session.get(Section.class, 2);
            session.delete(section);
            session.getTransaction().commit();
            System.out.println("OK !!!!");
        } finally {
            session.close();
            factory.close();
        }
    }

}
