package com.example.springboot1;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Student1 
{
	@RequestMapping("/hi")
	public String home()
	{
		return "Hello World";
	}

}
//http://localhost:8080/hi