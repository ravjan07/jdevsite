package com.websystique.spring;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AppMain {
	
	public static void main(String args[]){
		AnnotationConfigApplicationContext  context = new AnnotationConfigApplicationContext();
		//Sets the active profiles
		context.getEnvironment().setActiveProfiles("Development");
		//Scans the mentioned package[s] and register all the @Component available to Spring
		context.scan("com.websystique.spring"); 
        context.refresh();
        context.close();
	}

}
