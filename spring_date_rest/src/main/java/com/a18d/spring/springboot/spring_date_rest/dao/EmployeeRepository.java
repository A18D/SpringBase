package com.a18d.spring.springboot.spring_date_rest.dao;


import com.a18d.spring.springboot.spring_date_rest.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {
    public List<Employee> findAllByName(String name);
}
