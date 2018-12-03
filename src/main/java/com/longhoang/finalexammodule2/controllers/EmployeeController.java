package com.longhoang.finalexammodule2.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/employee/")
public class EmployeeController {
    public ModelAndView index() {
        return new ModelAndView("list");
    }
}
