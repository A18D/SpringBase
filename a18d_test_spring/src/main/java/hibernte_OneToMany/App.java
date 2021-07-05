package hibernte_OneToMany;

import hibernte_OneToMany.entity.Department;
import hibernte_OneToMany.entity.Employee;
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
        Department dep = new Department("Sales", 300, 30);
        Employee employee = new Employee("Ziama", "DEVELOPER", 160);
        Employee employee2 = new Employee("Zina", "DEVELOPER_1C", 160);
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
