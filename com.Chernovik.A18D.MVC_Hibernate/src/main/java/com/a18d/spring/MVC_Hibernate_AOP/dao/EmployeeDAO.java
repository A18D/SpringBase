package com.a18d.spring.MVC_Hibernate_AOP.dao;

import com.a18d.spring.MVC_Hibernate_AOP.entity.Employee;

import java.util.List;

public interface EmployeeDAO {
    public List<Employee> getAllEmployees();

    public void saveEmployee(Employee employee);

    public Employee getEmployee(int id);

    public void deleteEmployee(int id);

}
