package com.longhoang.finalexammodule2.services.impl;

import com.longhoang.finalexammodule2.models.EmployeeGroup;
import com.longhoang.finalexammodule2.repository.EmployeeGroupRepository;
import com.longhoang.finalexammodule2.services.EmployeeGroupService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Optional;

public class EmployeeGroupImpl implements EmployeeGroupService {
    @Autowired
    private EmployeeGroupRepository employeeGroupRepository;

    @Override
    public Optional<EmployeeGroup> findById(Integer id) {
        return employeeGroupRepository.findById(id);
    }

    @Override
    public Iterable<EmployeeGroup> findAll() {
        return employeeGroupRepository.findAll();
    }
}
