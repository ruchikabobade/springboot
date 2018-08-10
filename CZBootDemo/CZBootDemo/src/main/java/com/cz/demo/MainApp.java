package com.cz.demo;

import org.springframework.boot.SpringApplication;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class MainApp {
	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(MainApp.class, args);
//		Greet g1 = (Greet) context.getBean("greet");
//		System.out.println(g1.hello());
	}

}
