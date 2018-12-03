package com.longhoang.finalexammodule2;

import com.longhoang.finalexammodule2.formatters.EmployeeGroupFormatter;
import com.longhoang.finalexammodule2.models.EmployeeGroup;
import com.longhoang.finalexammodule2.services.EmployeeGroupService;
import com.longhoang.finalexammodule2.services.EmployeeService;
import com.longhoang.finalexammodule2.services.impl.EmployeeGroupImpl;
import com.longhoang.finalexammodule2.services.impl.EmployeeServiceImpl;
import org.springframework.beans.BeansException;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.format.FormatterRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

@EnableJpaRepositories

@SpringBootApplication
public class FinalExamModule2Application {
	@Bean
	public EmployeeService employeeService() {
		return new EmployeeServiceImpl();
	}

	@Bean
	public EmployeeGroupService employeeGroupService() {
		return new EmployeeGroupImpl();
	}

	@Configuration
	static class MyConfig extends WebMvcConfigurerAdapter implements ApplicationContextAware {
		private ApplicationContext applicationContext;
		@Override
		public void addFormatters(FormatterRegistry registry) {
			registry.addFormatter(new EmployeeGroupFormatter(applicationContext.getBean(EmployeeGroupService.class)));
		}
		@Override
		public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
			this.applicationContext = applicationContext;
		}
	}

	public static void main(String[] args) {
		SpringApplication.run(FinalExamModule2Application.class, args);
	}
}
