package com.example.springmvc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.example.springmvc.entities.Student;

@ComponentScan
@Configuration
@SpringBootApplication
@EnableAutoConfiguration
public class SpringMvc1Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext context=SpringApplication.run(SpringMvc1Application.class, args);
		Student s=context.getBean(Student.class);
		//Student s1=new Student();
		s.display();
	}

}
