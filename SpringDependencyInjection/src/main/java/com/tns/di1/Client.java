package com.tns.di1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.tns.di.Student;

public class Client {

	public static void main(String[] args) {
		ApplicationContext c=new ClassPathXmlApplicationContext("beans.xml");
		Student1 s1=c.getBean("s1",Student1.class);
		s1.cheating();
		
		AnotherStudent s2=c.getBean("s2",AnotherStudent.class);
		s2.startcheating();

	}

}
