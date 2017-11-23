package com.st.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.st.model.User;
import com.st.service.UserService;

@Controller
public class UserController {

	@Autowired
	private UserService userService;
	
	@RequestMapping(value="/queryAll",method=RequestMethod.GET)
	public ModelAndView queryAll(){
		ModelAndView mv = new ModelAndView();
		mv.addObject("lists", userService.queryAllUser());
		mv.setViewName("user");
		return mv;
	}
	
	@RequestMapping(value="/addUser",method=RequestMethod.POST)
	public String addUser(@ModelAttribute User user){
		userService.addUser(user);
		return "redirect:/queryAll";
	}
	
	@RequestMapping(value="/delUser/{id}",method=RequestMethod.GET)
	public String delUser(@PathVariable int id){
		userService.deleteUserById(id);
		return "redirect:/queryAll";
	}
}
