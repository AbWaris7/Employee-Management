package com.khan.code.Employee.Management.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class EmployeeController {

    @GetMapping("/home")
    public String index() {
        return "index";
    }


    @GetMapping("/leaders")
    public String showLeaders() {

        return "leaders";
    }

    @GetMapping("/systems")
    public String showSystems() {

        return "systems";
    }

}
