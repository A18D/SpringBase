package hibbernate_OneToOne;

import hibbernate_OneToOne.entity.Employee;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import java.io.File;

public class App {
    public static void main(String[] args) {
      /*  try {
            String url = "jdbc:sqlserver://localhost;databaseName=my_db;user=C1;password=18198812";
            //KHILAN is Host    and 1433 is port number
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            System.out.println("Driver Loaded");
            DriverManager.getConnection(url);
            System.out.println("Connected...");
        } catch(Exception e) {
            e.printStackTrace();
        }*/

        File f = new File("resources/hibernate.cfg.xml");
        SessionFactory factory = new Configuration()
                .configure(f)
                .addAnnotatedClass(Employee.class)
                .buildSessionFactory();

        try {
            Session session = factory.getCurrentSession();
            Employee emp = new Employee("A18D12", "DEVELOPER", "IT", 160);
            session.beginTransaction();
            session.save(emp);
            session.getTransaction().commit();
            System.out.println("emp = " + emp);

            System.out.println("OK !!!!");
        } finally {
            factory.close();
        }
    }
}
