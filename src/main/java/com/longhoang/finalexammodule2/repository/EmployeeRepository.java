package com.longhoang.finalexammodule2.repository;

import com.longhoang.finalexammodule2.models.Employee;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface EmployeeRepository extends PagingAndSortingRepository<Employee, Integer> {
}
