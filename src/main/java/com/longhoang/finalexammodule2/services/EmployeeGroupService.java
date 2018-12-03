package com.longhoang.finalexammodule2.services;

import com.longhoang.finalexammodule2.models.EmployeeGroup;

import java.util.Optional;

public interface EmployeeGroupService {
    Optional<EmployeeGroup> findById(Integer id);

    Iterable<EmployeeGroup> findAll();
}
