package ru.a18d.mvc;

import jakarta.validation.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;
import ru.a18d.mvc.objects.User;
import ru.a18d.mvc.objects.UserValidator;


@Controller
public class MyController {
    private static final Logger logger = LoggerFactory.getLogger(MyController.class);

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public ModelAndView showFirstView() {
        logger.debug("index is loading");
        return new ModelAndView("index", "user", new User());
    }

    //    @RequestMapping(value = "/checkUser", method = RequestMethod.POST)
//    public ModelAndView checkUser1(@ModelAttribute("user") User user) {
//
//        return new ModelAndView("main", "user", user);
//    }
    @RequestMapping(value = "/checkUser", method = RequestMethod.POST)
    public String checkUser(@Valid @ModelAttribute("user") User user,
                            BindingResult bindingResult,
                            Model model) {

        UserValidator userValidator = new UserValidator();
        userValidator.validate(user, bindingResult);

        if (bindingResult.hasErrors()) {
            return "index";
        }

        model.addAttribute("user", user);
        return "main";
    }

    @RequestMapping(value = "/failed", method = RequestMethod.GET)
    public ModelAndView failed() {
        return new ModelAndView("failed", "message", "Login failed!");
    }

    @RequestMapping(value = "/get-json-user/{name}", method = RequestMethod.GET, produces = "application/json")
    @ResponseBody
    public User getJsonUser(@PathVariable("name") String name) {
        logger.debug("rest param:" + name);
        User user = new User();
        user.setName(name);
        return user;
    }
}