package com.example.object;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class ObjectApplication {

	public static void main(String[] args) {
		ApplicationContext context =  SpringApplication.run(ObjectApplication.class, args);

		
		Alien obj = context.getBean(Alien.class);

		obj.code();
	}

}
