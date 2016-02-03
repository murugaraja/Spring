package com.vaannila.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class UserController {
	
	@RequestMapping("/user/add.htm")
	public ModelAndView add() {
		System.out.println("Add method called");
		return new ModelAndView("user", "message", "Add method called");
	}
	
	@RequestMapping("/user/remove.htm")
	public ModelAndView remove() {
		System.out.println("Remove method called");
		return new ModelAndView("user", "message", "Remove method called");
	}
}
