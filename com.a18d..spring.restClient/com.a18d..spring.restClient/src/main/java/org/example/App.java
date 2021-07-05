package org.example;

import org.example.configuration.MyConfig;
import org.example.entity.Employee;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.Arrays;
import java.util.List;

public class App
{
    public static void main( String[] args ){
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(MyConfig.class);
        Communication communication = context.getBean("communication",
                Communication.class);
        System.out.println("--getAllEmployees:");
        List<Employee> allEmployees = communication.getAllEmployees();
        System.out.println(allEmployees);

        System.out.println("--getEmployee:");
        Employee emp = communication.getEmployee(4);
        System.out.println(emp);

        System.out.println("--saveEmployee:");
        Employee emp2 = new Employee("Zosia", "Sinitskaia", "IT", 2345);
        communication.saveEmployee(emp2);

        emp2.setId(17);
        emp2.setSalary(1700);
        communication.saveEmployee(emp2);

        System.out.println("--deleteEmployee:");
        communication.deleteEmployee(19);
        communication.deleteEmployee(20);
    }
}
