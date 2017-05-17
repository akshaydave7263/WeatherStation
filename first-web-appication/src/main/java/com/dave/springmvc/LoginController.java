package com.dave.springmvc;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.dave.jee.valid;

@Controller
public class LoginController {
    

	@Autowired
	valid v;
	@RequestMapping(value="/login",method = RequestMethod.GET)
	public String showLoginPage()
	{
		
		return "login";
		
		
	}
	
	@RequestMapping(value="/login",method = RequestMethod.POST)
	public String sayLoginRequest(@RequestParam String name,@RequestParam String password,ModelMap model)
	{
		
		if(!v.isvalid(name,password))
		{
			model.put("errorMessage","Invalid name or password");
			return "login";
			
		}
		model.put("name", name);
		return "welcome";
		
	}
	
	
	
}
