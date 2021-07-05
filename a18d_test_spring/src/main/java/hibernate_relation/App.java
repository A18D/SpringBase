package hibernate_relation;


import hibernate_relation.entity.Detail;
import hibernate_relation.entity.Employee;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import java.io.File;
import java.util.Arrays;

public class App {
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
/*
            Employee emp = new Employee("A18D", "DEVELOPER", "IT", 160);
            Detail detail = new Detail("Ivanovo", "444", "a18d@bk.ru");
            emp.setDetail(detail);
*/
            session.beginTransaction();
            //session.save(emp);
            Employee emp = session.get(Employee.class, 1);
            session.delete(emp);
           // Detail detail = emp.getDetail();
            session.getTransaction().commit();
            //System.out.println("detail = " + detail);
            System.out.println("OK !!!!");
        } finally {
            session.close();
            factory.close();
        }
    }

}
