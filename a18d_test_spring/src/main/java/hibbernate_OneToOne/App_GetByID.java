package hibbernate_OneToOne;

import hibbernate_OneToOne.entity.Employee;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import java.io.File;

public class App_GetByID {
    public static void main(String[] args) {
        File f = new File("resources/hibernate.cfg.xml");
        SessionFactory factory = new Configuration()
                .configure(f)
                .addAnnotatedClass(Employee.class)
                .buildSessionFactory();

        try {
            Session session = factory.getCurrentSession();
            Employee emp = new Employee("Elena", "Petrova", "HR", 160);
            session.beginTransaction();
            session.save(emp);
            session.getTransaction().commit();
            int my_id = emp.getId();
            System.out.println("my_id = " + my_id);
            session = factory.getCurrentSession();
            session.beginTransaction();
            Employee emp2 = session.get(Employee.class, my_id);
            session.getTransaction().commit();
            System.out.println("emp2 = " + emp2);
            System.out.println("OK !!!!");
        } finally {
            factory.close();
        }
    }

}
