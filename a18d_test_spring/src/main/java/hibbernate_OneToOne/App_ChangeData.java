package hibbernate_OneToOne;

import hibbernate_OneToOne.entity.Employee;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import java.io.File;

public class App_ChangeData {
    public static void main(String[] args) {
        File f = new File("resources/hibernate.cfg.xml");
        SessionFactory factory = new Configuration()
                .configure(f)
                .addAnnotatedClass(Employee.class)
                .buildSessionFactory();

        try {
            Session session = factory.getCurrentSession();
            session.beginTransaction();
/*
            Employee emp = session.get(Employee.class, 1);
            emp.setSalary(1500);
*/
            session.createQuery("update Employee set salary = 1000"
                    + "where name = 'Elena'").executeUpdate();
            session.getTransaction().commit();

            System.out.println("OK !!!!");
        } finally {
            factory.close();
        }
    }

}
