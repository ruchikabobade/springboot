package com.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages={"com.demo","login"})
public class CzSpringStarterDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(CzSpringStarterDemoApplication.class, args);
	}
}
