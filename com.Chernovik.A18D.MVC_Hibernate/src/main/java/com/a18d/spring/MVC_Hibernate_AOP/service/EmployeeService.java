package com.a18d.spring.MVC_Hibernate_AOP.service;

import com.a18d.spring.MVC_Hibernate_AOP.entity.Employee;
import java.util.List;

public interface EmployeeService {
    public List<Employee> getAllEmployees();
    public void saveEmployee(Employee employee);
    public Employee getEmployee(int id);
    public void deleteEmployee(int id);

}
