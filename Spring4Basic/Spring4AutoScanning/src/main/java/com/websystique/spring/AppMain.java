package com.websystique.spring;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

import com.websystique.spring.configuration.AppConfig;
import com.websystique.spring.model.Employee;
import com.websystique.spring.service.EmployeeService;

public class AppMain {

	public static void main(String args[]){
		AbstractApplicationContext  context = new AnnotationConfigApplicationContext(AppConfig.class);
		
		EmployeeService service = (EmployeeService) context.getBean("employeeService");

		/*
		 * Register employee using service
		 */
		Employee employee = new Employee();
		employee.setName("Danny Theys");
		service.registerEmployee(employee);
		
		context.close();
	}
}
