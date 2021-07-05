package hibbernate_OneToOne;

import hibbernate_OneToOne.entity.Employee;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import java.io.File;
import java.util.List;

public class App_HQL {
    public static void main(String[] args) {
        File f = new File("resources/hibernate.cfg.xml");
        SessionFactory factory = new Configuration()
                .configure(f)
                .addAnnotatedClass(Employee.class)
                .buildSessionFactory();

        try {
            Session session = factory.getCurrentSession();
            session.beginTransaction();
            List<Employee> emps = session.createQuery("from Employee")
                    .getResultList();
            session.getTransaction().commit();

            for (Employee emp : emps) {
                System.out.println("emp = " + emp);
            }
            System.out.println("OK !!!!");
        } finally {
            factory.close();
        }
    }

}
