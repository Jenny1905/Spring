package com.example.controller;

import org.springframework.web.bind.annotation.RestController;

import com.example.model.Response;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;

@RestController
public class AnimalController {
	@GetMapping(path="/animal", produces="application/txt")
	public ResponseEntity<Response>getAnimalDetails()
	{
		Response response=new Response();
		response.setData("Lion");
		response.setResponseCode(11);
		response.setStatus("Success");
		int x=10;
		if(x==10)
			throw new RuntimeException();
		
		return new ResponseEntity<>(response,HttpStatus.OK);
	}
	
}
