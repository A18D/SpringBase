package hibernate_ManyToMAny;

import hibernate_ManyToMAny.entity.Child;
import hibernate_ManyToMAny.entity.Section;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import java.io.File;

public class App {
    public static void main(String[] args) {

        File f = new File("resources/hibernate.cfg.xml");
        SessionFactory factory = new Configuration()
                .configure(f)
                .addAnnotatedClass(Child.class)
                .addAnnotatedClass(Section.class)
                .buildSessionFactory();
        Session session = null;
        Section section = new Section("Football");
        Child child1 = new Child("Ziama", 18);
        Child child2 = new Child("Gena", 19);
        Child child3 = new Child("Robert", 20);
        section.addChildToSection(child1);
        section.addChildToSection(child2);
        section.addChildToSection(child3);

        try {
            session = factory.getCurrentSession();
            session.beginTransaction();
            session.persist(section);
            session.getTransaction().commit();
            System.out.println("OK !!!!");
        } finally {
            session.close();
            factory.close();
        }
    }

}
