package com.websystique.spring;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

import com.websystique.spring.config.AppConfig;
import com.websystique.spring.domain.Application;
import com.websystique.spring.domain.Bond;
import com.websystique.spring.domain.Driver;
import com.websystique.spring.domain.Employee;
import com.websystique.spring.domain.Performer;

public class AppMain {

	public static void main(String args[]) {
		AbstractApplicationContext context = new AnnotationConfigApplicationContext(
				AppConfig.class);

		// Byname Autowiring
		Application application = (Application) context.getBean("application");
		System.out.println("Application Details : " + application);

		// ByType Autowiring
		Employee employee = (Employee) context.getBean("employee");
		System.out.println("Employee Details : " + employee);

		// By Constructor Autowiring
		Performer performer = (Performer) context.getBean("performer");
		System.out.println("Performer Details : " + performer);

		// Setter Autowiring
		Driver driver = (Driver) context.getBean("driver");
		System.out.println("Driver Details : " + driver);

		Bond bond = (Bond) context.getBean("bond");
		bond.showCar();
	}

}
