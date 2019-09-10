package com.cofee.code.resource;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Home {

	@GetMapping("/")
	public String getHome() {
		return "Hello, Welcome to Spring-Security";
	}
	
	@GetMapping("/employee")
	public String getEmployee() {
		return "Hello Employee, Welcome to Spring-Security.";
	}
	
	
	@GetMapping("/visitor")
	public String getVisitors() {
		return "Hello Visitor, Welcome to Spring-Security.";
	}
	
}
