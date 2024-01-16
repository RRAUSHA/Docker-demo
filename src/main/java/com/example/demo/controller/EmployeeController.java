package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class EmployeeController {
	
	@Autowired
	public RestTemplate restTemplate;
	
	@GetMapping("/messages")
	public String getName() {
		System.out.println("Retrieve name ");
		ResponseEntity<String> res = restTemplate.getForEntity("http://192.168.1.7:8087/api/hello", String.class);
		String name = res.getBody();
		System.out.println("name is "+ name);
		return "Rajnish Raushan";
	}

}
