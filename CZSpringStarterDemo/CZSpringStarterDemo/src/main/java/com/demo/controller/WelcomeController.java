package com.demo.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


@Controller
@RequestMapping("welcome")
public class WelcomeController {

	@Value("${welcome.message}")
	private String message = "Default";
	
	@RequestMapping(method = RequestMethod.GET)
	public String message(Model model) {
		model.addAttribute("title", message);
		return "welcome";
	}
}
