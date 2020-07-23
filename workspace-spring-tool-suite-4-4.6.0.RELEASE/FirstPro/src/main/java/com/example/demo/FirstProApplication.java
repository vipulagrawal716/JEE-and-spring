package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class FirstProApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(FirstProApplication.class, args);
		//System.out.println("hello spring boot...");
		//objects get initiated before only check my removing a.show()
		//singleton, means object will get create only one time, by default it is singleton and object gets created prehanded
		//in prototype object doesn't get created prehanded and we can create as many objects
		/*
		 * Alien a = context.getBean(Alien.class); a.show(); Alien a1 =
		 * context.getBean(Alien.class); a1.show();
		 */
		Alien a = context.getBean(Alien.class);
		a.show();
	
	}

}
