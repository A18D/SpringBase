package com.a18d.spring.mvc;


import jakarta.validation.Valid;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
@RequestMapping("/employee")
public class MyController2 {

    @RequestMapping("/")
    public String showFirstView(){
        return "first_view";
    }

    @RequestMapping("/askDetails")
    public String askEmployeeDetails(Model model){
        model.addAttribute("employee", new Employee());
        return "ask-emp-details-view2";
    }

    @RequestMapping("/showDetails")
    public String showEmployeeDetails(@Valid @ModelAttribute("employee") Employee emp,
                                      BindingResult bindingResult){

        if (bindingResult.hasErrors()) {
            return "ask-emp-details-view2";
        }else {
           /* String name = emp.getName();
            name = "Tov. " + name;
            emp.setName(name);*/
            return "show-emp-details-view2";
        }
    }
}
