package com.a18d.spring.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;

@Controller
public class MyController {

    @RequestMapping("/")
    public String showFirstView(){
        return "first_view";
    }

    @RequestMapping("/askDetails")
    public String askEmployeeDetails(){
        return "ask-emp-details-view";
    }

    @RequestMapping("/showDetails")
    public String showEmployeeDetails(HttpServletRequest request, Model model){
        String empName = request.getParameter("employeeName");
        empName = "Mr " + empName;
        model.addAttribute("nameAttribute", empName);
        return "show-emp-details-view";
    }

    @RequestMapping("/showDetailsRequestParam")
    public String showEmployeeDetailsRequestParam(@RequestParam("employeeName") String empName, Model model){
        String pempName = "RequestParam: " + empName;
        model.addAttribute("nameAttributeRequestParam", pempName);
        return "show-emp-details-view";
    }

}
