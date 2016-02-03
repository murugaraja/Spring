package com.vaannila.web;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.ui.ModelMap;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.SimpleFormController;

import com.vaannila.dao.UserDAO;
import com.vaannila.domain.User;
import com.vaannila.service.UserService;

@SuppressWarnings("deprecation")
public class UserController extends SimpleFormController {

	private UserService userService;

	public UserController()	{
		setCommandClass(User.class);
		setCommandName("user");
	}
	
	public void setUserService(UserService userService) {
		this.userService = userService;
	}
	
	@SuppressWarnings("unchecked")
	@Override
	protected Map referenceData(HttpServletRequest request) throws Exception {
		Map referenceData = new HashMap();
		referenceData.put("countryList", userService.getAllCountries());
		referenceData.put("communityList", userService.getAllCommunities());
		return referenceData;
	}

	@Override
	protected ModelAndView onSubmit(Object command) throws Exception {
		User user = (User) command;
		userService.add(user);
		return new ModelAndView("userSuccess","user",user);
	}
	
	
	
	
	/*   Multi Action control  */
	private UserDAO userDAO;

	public void setUserDAO(UserDAO userDAO) {
		this.userDAO = userDAO;
	}

	public ModelAndView add(HttpServletRequest request, HttpServletResponse response, User user) throws Exception {
		userDAO.saveUser(user);
		return new ModelAndView("redirect:list.htm");
	}

	public ModelAndView list(HttpServletRequest request, HttpServletResponse response) throws Exception {
		ModelMap modelMap = new ModelMap();
		modelMap.addAttribute("userList", userDAO.listUser());
		modelMap.addAttribute("user", new User());
		return new ModelAndView("userForm", modelMap);
	}
	/*   Multi Action control  */ 
	
}