package com.longhoang.finalexammodule2.controllers;

import com.longhoang.finalexammodule2.models.Employee;
import com.longhoang.finalexammodule2.services.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class EmployeeController {
    @Autowired
    private EmployeeService employeeService;

    @GetMapping("/employees")
    public ModelAndView index() {
        return new ModelAndView("employee/list");
    }

    @GetMapping("/create-employee")
    public ModelAndView showCreateForm() {
        return new ModelAndView("employee/create", "employee", new Employee());
    }

    @PostMapping("/create-employee")
    public ModelAndView createEmployee(@ModelAttribute("employee") Employee employee) {
        employeeService.save(employee);
        ModelAndView modelAndView = new ModelAndView("employee/create", "employee", new Employee());
        modelAndView.addObject("message", "Created successfully");
        return modelAndView;
    }
}
