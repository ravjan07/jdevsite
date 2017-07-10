package com.websystique.spring.domain;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Bond {

	@Autowired
	@Qualifier("Mustang")
	private Car car;
	
	public void showCar(){
		car.getCarName();
	}
}
