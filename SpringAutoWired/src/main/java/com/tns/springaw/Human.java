package com.tns.springaw;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Human 
{
	private Heart heart;
	//default constructor
	public Human() {
		
		this.heart = heart;
	}
	
	//DI using constructor
	public Human(Heart heart) {
		super();
		this.heart = heart;
	}
	//DI using setters
	@Autowired
	@Qualifier("octopusHeart")
	public void setHeart(Heart heart) {
		this.heart = heart;
	}

	public void startPumping()
	{
		heart.pump();
		System.out.println("Name of the animal is "+heart.getNameOfAnimal()
		+ " No.of heart present is "+heart.getNoOfHeart());
	}

}
