package com.longhoang.finalexammodule2.formatters;

import com.longhoang.finalexammodule2.models.EmployeeGroup;
import com.longhoang.finalexammodule2.services.EmployeeGroupService;
import org.springframework.format.Formatter;

import java.text.ParseException;
import java.util.Locale;

public class EmployeeGroupFormatter implements Formatter<EmployeeGroup> {
    private EmployeeGroupService employeeGroupService;

    @Override
    public EmployeeGroup parse(String text, Locale locale) throws ParseException {
        return employeeGroupService.;
    }

    @Override
    public String print(EmployeeGroup object, Locale locale) {
        return null;
    }
}
