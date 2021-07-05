package hibbernate_OneToOne;

import hibbernate_OneToOne.entity.Employee;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import java.io.File;

public class App_Delete {
    public static void main(String[] args) {
        File f = new File("resources/hibernate.cfg.xml");
        SessionFactory factory = new Configuration()
                .configure(f)
                .addAnnotatedClass(Employee.class)
                .buildSessionFactory();

        try {
            Session session = factory.getCurrentSession();
            session.beginTransaction();
//            Employee emp2 = session.get(Employee.class, 4);
//            session.delete(emp2);

            session.createQuery("delete from Employee where name like 'A18D%'")
                    .executeUpdate();

            session.getTransaction().commit();
           // System.out.println("emp2 = " + emp2);
            System.out.println("OK !!!!");
        } finally {
            factory.close();
        }
    }

}
