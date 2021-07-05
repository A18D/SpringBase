package hibernate_relation;

import hibernate_relation.entity.Detail;
import hibernate_relation.entity.Employee;
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
                .addAnnotatedClass(Employee.class)
                .addAnnotatedClass(Detail.class)
                .buildSessionFactory();
        Session session = null;

        try {
            session = factory.getCurrentSession();
            session.beginTransaction();
            Detail detail = session.get(Detail.class, 4);
            Employee emp = detail.getEmployee();
            emp.setDetail(null);
            session.delete(detail);
            session.getTransaction().commit();
            System.out.println("emp = " + emp);
            System.out.println("OK !!!!");
        } finally {
            session.close();
            factory.close();
        }
    }

}
