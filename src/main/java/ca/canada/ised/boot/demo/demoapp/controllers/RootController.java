package ca.canada.ised.boot.demo.demoapp.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Root Controller.
 * 
 * @author Andrew Pitt
 * @since 1.0.0
 */
@Controller
@RequestMapping(value = "/")
public class RootController {

    /**
     * Get route.
     * 
     * @return <code>String</code>
     */
    @RequestMapping(method = RequestMethod.GET)
    public String getRoot() {
        return "redirect:/main";
    }

}
