package com.cofee.code.resource;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Home {

	@GetMapping("/")
	public String getHome() {
		
		
		String returnString = "Hello, Welcome to Spring-Security "
				+ "<br><br> <a href=\"visitor\">Visitor</a>"
				+ "<br><br> <a href=\"employee\">Employee</a>";
		return returnString;
	}
	
	@GetMapping("/employee")
	public String getEmployee() {
		
		String returnString = "Hello Employee, Welcome to Spring-Security "
				+ "<br><br> <a href=\"visitor\">Visitor</a>"
				+ "<br><br> <a href=\"/\">Home</a>";
		return returnString;
	}
	
	
	@GetMapping("/visitor")
	public String getVisitors() {
		
		String returnString = "Hello Visitor, Welcome to Spring-Security "
				+ "<br><br> <a href=\"employee\">Employee</a>"
				+ "<br><br> <a href=\"/\">Home</a>";
		return returnString;
	}
	
}
