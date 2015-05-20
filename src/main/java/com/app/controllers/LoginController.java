package com.app.controllers;


import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.app.constants.Session;
import com.app.model.LoginForm;
import com.app.service.UserService;

@Controller
public class LoginController {
		
	@Autowired
	private UserService userService;


	@RequestMapping(value="login")
		
        public ModelAndView login(HttpServletRequest request,HttpServletResponse response,LoginForm command, HttpSession httpSession)
	{
		
	        String username = command.getUsername();
	        
	        String password = command.getPassword();
	        
	      
	        if(username.equals(null) || password.equals(null))
	        {
	        	return null;
	        }
	        
	        if (userService.insertUser(command) == 0)
	        {
	        	httpSession.setAttribute(Session.CURRENT_USER_ATTR_NAME, command);
	        }
	        
	        ModelAndView mv = new ModelAndView("/test/index","command","LOGIN SUCCESS, " + username);
	        
	        return mv;
    	}
}
