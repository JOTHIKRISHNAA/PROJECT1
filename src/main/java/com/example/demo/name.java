package com.example.demo;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;

@RestController
public class name {
	private String studentName="MyName";
	@GetMapping("/a")
	public String getname() {
		return "Welcome"+studentName;
		
	}
}
