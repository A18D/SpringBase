package hibernate_oneTo_Many_uni;

import hibernate_oneTo_Many_uni.entity.Department;
import hibernate_oneTo_Many_uni.entity.Employee;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import java.io.File;

public class App {
    public static void main(String[] args) {

        File f = new File("resources/hibernate.cfg.xml");
        SessionFactory factory = new Configuration()
                .configure(f)
                .addAnnotatedClass(Employee.class)
                .addAnnotatedClass(Department.class)
                .buildSessionFactory();
        Session session = null;
        Department dep = new Department("HR", 500, 80);
        Employee employee = new Employee("Юля", "HR", 234);
        Employee employee2 = new Employee("Маша", "HR", 546);
        dep.addEmployeeToDepartment(employee);
        dep.addEmployeeToDepartment(employee2);
        try {
            session = factory.getCurrentSession();
            session.beginTransaction();
            session.save(dep);
            session.getTransaction().commit();
            System.out.println("OK !!!!");
        } finally {
            session.close();
            factory.close();
        }
    }

}
