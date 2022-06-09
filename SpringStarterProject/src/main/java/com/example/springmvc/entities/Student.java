package com.example.springmvc.entities;

import org.springframework.stereotype.Component;

@Component
public class Student {
	private int uid;
	private String name;
	
	public Student() {
		super();
		System.out.println("Hello Students");
	}
	public int getUid() {
		return uid;
	}
	public void setUid(int uid) {
		this.uid = uid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void display()
	{
		System.out.println("Student Class");
	}

}
