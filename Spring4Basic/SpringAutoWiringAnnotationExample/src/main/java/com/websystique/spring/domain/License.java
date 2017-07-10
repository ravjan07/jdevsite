package com.websystique.spring.domain;

import org.springframework.stereotype.Component;

@Component
public class License {

	private String number="123456ABC";

	@Override
	public String toString() {
		return "License [number=" + number + "]";
	}
	
	//setters, getters
}
