package com.websystique.spring.domain;

import javax.annotation.Resource;

import org.springframework.stereotype.Component;

@Component("application")
public class Application {

	@Resource(name="applicationUser")
	private ApplicationUser user;

	@Override
	public String toString() {
		return "Application [user=" + user + "]";
	}
}
