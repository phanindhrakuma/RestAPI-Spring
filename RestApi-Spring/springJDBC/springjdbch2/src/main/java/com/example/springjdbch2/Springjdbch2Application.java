package com.example.springjdbch2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.example.springjdbch2.model.Alien;
import com.example.springjdbch2.repo.AlienRepo;

@SpringBootApplication
public class Springjdbch2Application {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(Springjdbch2Application.class, args);

		Alien alien1 = context.getBean(Alien.class); // importing package

		alien1.setId(111);
		alien1.setName("phani");
		alien1.setTech("java");


		AlienRepo repo = context.getBean(AlienRepo.class);
		repo.save(alien1);

		System.out.println(repo.findall());

	}

}
