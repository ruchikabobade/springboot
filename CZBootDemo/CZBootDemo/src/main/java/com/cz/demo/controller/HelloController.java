package com.cz.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

//@Controller
@RestController
public class HelloController {
	@RequestMapping("/hh")
	public String message()
	{
		return "Welcome To Spring Boot First Controller";
	}
	@RequestMapping("/get")
	public String message1()
	{
		return "Welcome To Spring Boot Second Controller";
	}

}
