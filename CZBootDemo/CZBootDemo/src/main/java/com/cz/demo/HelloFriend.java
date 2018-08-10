package com.cz.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;



@Controller
public class HelloFriend {
	@Autowired
	private UserRepository userRepository;
	
//	@Autowired
//	private UserEntity userEntity;

	@RequestMapping("/hello")
	public String hello() {
		return "Hello  from spring boot 1.0 auto deploy";
	}

	@RequestMapping("/")
	public String welcome() {
		return "index";
	}
	
	@RequestMapping(value= "/adduser", method = RequestMethod.POST )
	public ModelAndView addUser(@ModelAttribute User user) {
		ModelAndView mv = new ModelAndView();
		mv.setViewName("adduser");
		mv.addObject("userReceived", user);
		System.out.println(user.fname + " " +user.lname);
		UserEntity userEntity = new UserEntity();
		userEntity.setFname(user.fname);
		userEntity.setLname(user.lname);
		userRepository.save(userEntity);
		return mv;
	}
}
