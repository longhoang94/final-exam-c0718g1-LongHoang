package com.longhoang.finalexammodule2;

import com.longhoang.finalexammodule2.services.EmployeeService;
import com.longhoang.finalexammodule2.services.impl.EmployeeServiceImpl;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class FinalExamModule2Application {
	@Bean
	public EmployeeService employeeService() {
		return new EmployeeServiceImpl();
	}

	public static void main(String[] args) {
		SpringApplication.run(FinalExamModule2Application.class, args);
	}
}
