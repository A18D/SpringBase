package hibernate_relation;

import hibernate_relation.entity.Detail;
import hibernate_relation.entity.Employee;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import java.io.File;

public class App2 {
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
            Employee emp = new Employee("Зяма", "Мясников", "мясной отдел", 1160);
            Detail detail = new Detail("Суздаль", "37", "Ziama@bk.ru");
            emp.setDetail(detail);
            detail.setEmployee(emp);
            session.save(detail);
            session.getTransaction().commit();
            System.out.println("OK !!!!");
        } finally {
            session.close();
            factory.close();
        }
    }

}
