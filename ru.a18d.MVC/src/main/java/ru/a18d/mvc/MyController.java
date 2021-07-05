package ru.a18d.mvc;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import ru.a18d.mvc.objects.User;

@Controller
public class MyController {
    private static final Logger logger = LoggerFactory.getLogger(MyController.class);

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public ModelAndView showFirstView() {
        logger.debug("MyController.showFirstView");
        System.out.println("HW");
        return new ModelAndView("index", "user", new User());
    }

    @RequestMapping(value = "/checkUser", method = RequestMethod.POST)
    public ModelAndView checkUser1(@ModelAttribute("user") User user) {

        return new ModelAndView("main", "user", user);
    }

    @RequestMapping(value = "/failed", method = RequestMethod.GET)
    public ModelAndView failed() {
        return new ModelAndView("failed", "message", "Login failed!");
    }
}
