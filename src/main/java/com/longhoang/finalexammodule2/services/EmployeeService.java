package com.longhoang.finalexammodule2.services;

import com.longhoang.finalexammodule2.models.Employee;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.Optional;

public interface EmployeeService {
    Page<Employee> findAll(Pageable pageable);

    Optional<Employee> findById(Integer id);

    void delete(Integer id);

    void save(Employee employee);

    Page<Employee> findByNameContaining(Optional<String> keyword, Pageable pageable);
}
