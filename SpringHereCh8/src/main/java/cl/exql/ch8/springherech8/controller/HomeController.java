package cl.exql.ch8.springherech8.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.logging.Logger;

@Controller
public class HomeController {

    Logger logger = Logger.getLogger(HomeController.class.getName());

    @RequestMapping({ "/home"})
    public String home(@RequestParam(required = false) String username,
                       @RequestParam(required = false) String color,
                       Model model) {

        model.addAttribute("username", username);
        model.addAttribute("color", color);
        return "home.html";
    }


}
