package com.ddns.jdevsite.springmvc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.ddns.jdevsite.spring.domain.HelloWorld;
import com.ddns.jdevsite.springmvc.domain.Message;

@Controller
@RequestMapping("/")
public class HelloWorldController {

	@Autowired
	HelloWorld helloWorld;

	@RequestMapping(method = RequestMethod.GET)
	public String sayHello(ModelMap model) {
		model.addAttribute("greeting", "Hello World from Spring 4 MVC");
		return "welcome";
	}

	@RequestMapping(value = "/helloagain", method = RequestMethod.GET)
	public String sayHelloAgain(ModelMap model) {
		helloWorld.sayHello("you");
		model.addAttribute("greeting", "Hello World Again, from Spring 4 MVC");
		return "welcome";
	}

	@RequestMapping(value = "/helloagain/{name}", method = RequestMethod.GET)
	public String sayHelloAgainYou(ModelMap model, @PathVariable String name) {
		helloWorld.sayHello(name);
		model.addAttribute("greeting", "Hello World Again " + name + ", from Spring 4 MVC");
		return "welcome";
	}

	

}
