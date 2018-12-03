package com.longhoang.finalexammodule2.controllers;

import com.longhoang.finalexammodule2.models.Employee;
import com.longhoang.finalexammodule2.services.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class EmployeeController {
    @Autowired
    private EmployeeService employeeService;

    @GetMapping("/employees")
    public ModelAndView listEmployee(Pageable pageable) {
        Page<Employee> employees = employeeService.findAll(pageable);
        return new ModelAndView("employee/list", "employees", employees);
    }

    @GetMapping("/create-employee")
    public ModelAndView showCreateForm() {
        return new ModelAndView("employee/create", "employee", new Employee());
    }

    @PostMapping("/create-employee")
    public ModelAndView createEmployee(@Validated @ModelAttribute("employee") Employee employee, BindingResult bindingResult) {
        if (bindingResult.hasErrors()) {
            return new ModelAndView("employee/create");
        } else {
            employeeService.save(employee);
            ModelAndView modelAndView = new ModelAndView("employee/create", "employee", new Employee());
            modelAndView.addObject("message", "Created successfully");
            return modelAndView;
        }
    }

    @GetMapping("/edit-employee/{id}")
    public ModelAndView showEditForm(@PathVariable("id") Integer id) {
        return new ModelAndView("employee/edit", "employee", employeeService.findById(id));
    }

    @PostMapping("/edit-employee")
    public ModelAndView updateEmployee(@Validated @ModelAttribute("employee") Employee employee, BindingResult bindingResult) {
        if (bindingResult.hasErrors()) {
            return new ModelAndView("employee/edit");
        } else {
            employeeService.save(employee);
            ModelAndView modelAndView = new ModelAndView("employee/edit", "employee", employee);
            modelAndView.addObject("message", "Updated successfully");
            return modelAndView;
        }
    }

    @GetMapping("/delete-employee/{id}")
    public ModelAndView showDeleteForm(@PathVariable("id") Integer id) {
        return new ModelAndView("employee/delete", "employee", employeeService.findById(id));
    }

    @PostMapping("/delete-employee")
    public ModelAndView deleteEmployee(@ModelAttribute("employee") Employee employee) {
        employeeService.delete(employee.getId());
        ModelAndView modelAndView = new ModelAndView("employee/delete", "employee", employee);
        modelAndView.addObject("message", "Deleted Successfully");
        return modelAndView;
    }
}
