package com.vaannila.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.vaannila.domain.Community;
import com.vaannila.domain.Country;
import com.vaannila.domain.User;
import com.vaannila.service.UserService;

@Controller
@RequestMapping("/userRegistration.htm")
@SessionAttributes("user")
public class UserController {

	private UserService userService;
	@Autowired
	public void setUserService(UserService userService) {
		this.userService = userService;
	}
	
	@ModelAttribute("countryList")
	public List<Country> populateCountryLists() {
		return userService.getAllCountries();
	}
	
	@ModelAttribute("communityList")
	public List<Community> populateCommunityListd() {
		return userService.getAllCommunities();
	}
	
	@RequestMapping(method = RequestMethod.GET)
	public String showUserFormbb(ModelMap model) {
		User user = new User();
		model.addAttribute("user", user);
		return "userForm";
	}

	@RequestMapping(method = RequestMethod.POST)
	public String onSubmit(@ModelAttribute("user") User user) {
		userService.add(user);
		return "redirect:office.htm";
	}	
}