package com.websystique.spring.domain;

import org.springframework.stereotype.Component;

@Component
public class EmployeeAddress {

	private String Street="123/223 SantaVila";
	private String city="Nebraska";
	
	public String getStreet() {
		return Street;
	}
	
	public void setStreet(String street) {
		Street = street;
	}
	
	public String getCity() {
		return city;
	}
	
	public void setCity(String city) {
		this.city = city;
	}
	
	@Override
	public String toString() {
		return "EmployeeAddress [Street=" + Street + ", city=" + city + "]";
	}


}
