package hibernate_ManyToMAny;

import hibernate_ManyToMAny.entity.Child;
import hibernate_ManyToMAny.entity.Section;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import java.io.File;
import java.util.Arrays;

public class AppGet {
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
            Section section = session.get(Section.class, 1);
            System.out.println("section = " + section);
            System.out.println("children = " + section.getChildren());
            System.out.println("===================================");
            Child child = session.get(Child.class, 4);
            System.out.println("children = " + child);
            System.out.println("sections = " + child.getSections());
            session.getTransaction().commit();
            System.out.println("OK !!!!");
        } finally {
            session.close();
            factory.close();
        }
    }

}
