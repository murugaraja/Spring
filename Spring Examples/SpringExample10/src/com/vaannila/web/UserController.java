package com.vaannila.web;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.multiaction.MultiActionController;

public class UserController extends MultiActionController {
	
	public ModelAndView add(HttpServletRequest request, HttpServletResponse response) throws Exception {
		System.out.println("Add method called");
		return new ModelAndView("user", "message", "Add method called");
	}
	
	public ModelAndView remove(HttpServletRequest request, HttpServletResponse response) throws Exception {
		System.out.println("Remove method called");
		return new ModelAndView("user", "message", "Remove method called");
	}
}