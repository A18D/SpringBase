package hibernate_ManyToMAny;

import hibernate_ManyToMAny.entity.Child;
import hibernate_ManyToMAny.entity.Section;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import java.io.File;

public class AppSectionToChild {
    public static void main(String[] args) {

        File f = new File("resources/hibernate.cfg.xml");
        SessionFactory factory = new Configuration()
                .configure(f)
                .addAnnotatedClass(Child.class)
                .addAnnotatedClass(Section.class)
                .buildSessionFactory();
        Session session = null;
        Section section1 = new Section("Football");
        Section section2 = new Section("Chess");
        Section section3 = new Section("Hockey");
        Child child1 = new Child("Zina", 18);
        child1.addSectionToChild(section1);
        child1.addSectionToChild(section2);
        child1.addSectionToChild(section3);

        try {
            session = factory.getCurrentSession();
            session.beginTransaction();
            session.save(child1);
            session.getTransaction().commit();
            System.out.println("OK !!!!");
        } finally {
            session.close();
            factory.close();
        }
    }

}
