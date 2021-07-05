package com.a18d.spring.springboot.a18d_springboot.service;


import com.a18d.spring.springboot.a18d_springboot.entity.Employee;

import java.util.List;

public interface EmployeeService {
    public List<Employee> getAllEmployees();
    public void saveEmployee(Employee employee);
    public Employee getEmployee(int id);
    public void deleteEmployee(int id);

}