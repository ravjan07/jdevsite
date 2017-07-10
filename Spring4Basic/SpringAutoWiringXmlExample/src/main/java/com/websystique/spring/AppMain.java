package com.websystique.spring;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.websystique.spring.domain.Application;
import com.websystique.spring.domain.Driver;
import com.websystique.spring.domain.Employee;
import com.websystique.spring.domain.Performer;

public class AppMain {
	public static void main(String args[]){
		AbstractApplicationContext context = new ClassPathXmlApplicationContext("app-config.xml");

		//autowire=byName 
		Application application = (Application)context.getBean("application");
	    System.out.println("Application Details : "+application);

		//autowire=byType
		Employee employee = (Employee)context.getBean("employee");
	    System.out.println("Employee Details : "+employee);

		//autowire=constructor
		Performer performer = (Performer)context.getBean("performer");
	    System.out.println("Performer Details : "+performer);
	
		//autowire=default
	    Driver driver = (Driver)context.getBean("driver");
	    System.out.println("Driver Details : "+driver);

	
	}
}
