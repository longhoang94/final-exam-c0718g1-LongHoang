package com.longhoang.finalexammodule2.formatters;

import com.longhoang.finalexammodule2.models.EmployeeGroup;
import com.longhoang.finalexammodule2.services.EmployeeGroupService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.Formatter;

import java.text.ParseException;
import java.util.Locale;
import java.util.Optional;

public class EmployeeGroupFormatter implements Formatter<Optional<EmployeeGroup>> {
    private EmployeeGroupService employeeGroupService;

    @Autowired
    public EmployeeGroupFormatter(EmployeeGroupService e) {
        this.employeeGroupService = e;
    }

    @Override
    public Optional<EmployeeGroup> parse(String text, Locale locale) throws ParseException {
        return employeeGroupService.findById(Integer.parseInt(text));
    }

    @Override
    public String print(Optional<EmployeeGroup> object, Locale locale) {
        return null;
    }
}
