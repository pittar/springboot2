package ca.canada.ised.boot.demo.demoapp.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Main Controller.
 * 
 * @author andrewpitt
 * @since 1.0.0
 */
@Controller
@RequestMapping(value = "/main")
public class MainController {

    /**
     * Show main.
     * 
     * @return <code>String</code>
     */
    @RequestMapping(method = RequestMethod.GET)
    public String showMain() {
        return "main";
    }

}
