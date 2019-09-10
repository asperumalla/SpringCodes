package com.cofee.code.resource;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Home {

	@GetMapping("/")
	public String getHome() {
		return "Hello, Welcome to Spring-Security";
	}
	
}
