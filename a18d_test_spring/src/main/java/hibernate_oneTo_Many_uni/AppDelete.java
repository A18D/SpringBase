package hibernate_oneTo_Many_uni;

import hibernate_oneTo_Many_uni.entity.Department;
import hibernate_oneTo_Many_uni.entity.Employee;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import java.io.File;

public class AppDelete {
    public static void main(String[] args) {

        File f = new File("resources/hibernate.cfg.xml");
        SessionFactory factory = new Configuration()
                .configure(f)
                .addAnnotatedClass(Employee.class)
                .addAnnotatedClass(Department.class)
                .buildSessionFactory();
        Session session = null;

        try {
            session = factory.getCurrentSession();
            session.beginTransaction();
            Department dep = session.get(Department.class, 2);
            System.out.println("dep = " + dep);
            System.out.println("emps = " + dep.getEmps());
            System.out.println("================");
            session.delete(dep);
            session.getTransaction().commit();
            System.out.println("OK !!!!");
        } finally {
            session.close();
            factory.close();
        }
    }

}
