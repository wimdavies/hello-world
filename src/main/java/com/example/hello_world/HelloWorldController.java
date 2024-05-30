package com.example.hello_world;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
public class HelloWorldController {

    @GetMapping("/")
    public ModelAndView index() {
        return new ModelAndView("home");
    }

    @GetMapping("/links")
    public  ModelAndView links() {
        return new ModelAndView("links");
    }
}
