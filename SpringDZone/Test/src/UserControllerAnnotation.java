package com.vaannila.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.servlet.ModelAndView;

import com.vaannila.domain.User;
import com.vaannila.service.UserService;
import com.vaannila.validator.UserValidator;

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



@Controller
@RequestMapping("/userRegistration.htm")
@SessionAttributes("user")
public class UserController {

	private UserService userService;
	private UserValidator userValidator;

	@Autowired
	public UserController(UserService userService, UserValidator userValidator) {
		this.userService = userService;
		this.userValidator = userValidator;
	}

	@RequestMapping(method = RequestMethod.GET)
	public String showUserForm(ModelMap model) {
		User user = new User();
		model.addAttribute("user", user);
		return "userForm";
	}

	@RequestMapping(method = RequestMethod.POST)
	public String onSubmit(@ModelAttribute("user") User user, BindingResult result) {
		userValidator.validate(user, result);
		if (result.hasErrors()) {
			return "userForm";
		} else {
			userService.add(user);
			return "redirect:userSuccess.htm";
		}
	}
}