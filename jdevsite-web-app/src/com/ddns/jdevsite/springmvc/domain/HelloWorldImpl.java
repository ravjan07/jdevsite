package com.ddns.jdevsite.springmvc.domain;

public class HelloWorldImpl implements HelloWorld {

	public void sayHello(String name) {
		System.out.println("Hello " + name);
	}

}