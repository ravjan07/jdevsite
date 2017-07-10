package com.websystique.spring.domain;

import org.springframework.stereotype.Component;

@Component
public class Instrument {

	private String name = "PIANO";

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Instrument [name=" + name + "]";
	}
	
	
}
