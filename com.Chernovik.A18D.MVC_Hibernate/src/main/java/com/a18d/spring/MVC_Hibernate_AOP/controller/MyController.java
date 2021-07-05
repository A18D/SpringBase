package com.a18d.spring.MVC_Hibernate_AOP.controller;

import com.a18d.spring.MVC_Hibernate_AOP.entity.Employee;
import com.a18d.spring.MVC_Hibernate_AOP.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
public class MyController {
    @Autowired
    private EmployeeService employeeSErvice;

    @RequestMapping("/")
    public String showAllEmployees(Model model){
        List<Employee> allEmployees = employeeSErvice.getAllEmployees();
        model.addAttribute("allEmps", allEmployees);
        return "all-employees";
    }

    @RequestMapping("/addNewEmployee")
    public String addNewEmployee(Model model){
        Employee emp = new Employee();
        model.addAttribute("employee", emp);
        return "employee-info";
    }

    @RequestMapping("/saveEmployee")
    public String saveEmployee(@ModelAttribute("employee") Employee employee){
        employeeSErvice.saveEmployee(employee);
        return "redirect:/";
    }
    @RequestMapping("/updateInfo")
    public String updateEmployee(@RequestParam("empId") int id, Model model){
        Employee emp = employeeSErvice.getEmployee(id);
        model.addAttribute("employee", emp);
        return "employee-info";
    }
    @RequestMapping("/deleteInfo")
    public String deleteEmployee(@RequestParam("empId") int id){
        employeeSErvice.deleteEmployee(id);
        return "redirect:/";
    }

}
