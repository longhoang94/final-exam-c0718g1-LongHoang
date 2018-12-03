package com.longhoang.finalexammodule2.repository;

import com.longhoang.finalexammodule2.models.Employee;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.PagingAndSortingRepository;

import java.util.Optional;

public interface EmployeeRepository extends PagingAndSortingRepository<Employee, Integer> {
    Page<Employee> findAllByNameContaining(Optional<String> keyword, Pageable pageable);
}
