package co.develhope.swagger2.controllers;

import org.springframework.web.bind.annotation.RequestMapping;

public class WelcomeMexController {

    @RequestMapping("")
    public String welcomeMex() {
        return "Welcome !!! ";
    }
}
