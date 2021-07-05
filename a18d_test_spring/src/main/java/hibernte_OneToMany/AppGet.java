package hibernte_OneToMany;

import hibernte_OneToMany.entity.Department;
import hibernte_OneToMany.entity.Employee;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import java.io.File;
import java.sql.SQLOutput;
import java.util.Arrays;

public class AppGet {
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
            Department dep = session.get(Department.class, 3);
            System.out.println("dep = " + dep);
            System.out.println("emps = " + dep.getEmps());
            System.out.println("================");
/*
            Employee emp = session.get(Employee.class, 1);
            System.out.println("emp = " + emp);
            System.out.println("dep = " + emp.getDepartment());
*/
            session.getTransaction().commit();
            System.out.println("OK !!!!");
        } finally {
            session.close();
            factory.close();
        }
    }

}
