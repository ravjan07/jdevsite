package com.ddns.jdevsite.spring.domain;

public class HelloWorldImpl implements HelloWorld {

	public void sayHello(String name) {
		System.out.println("Hello " + name);
	}

}