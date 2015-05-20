package com.app.controllers;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.app.constants.Session;

/**
 * 
 * @author gaoyanshou
 * down api and app
 *
 */

@Controller
public class DownloadController 
{
	
	@RequestMapping(value="/download/api")
	 public ModelAndView download(HttpServletRequest request,HttpServletResponse response)
	 {
			
	 	HttpSession session = request.getSession(); 
		    
	        if (session.getAttribute(Session.CURRENT_USER_ATTR_NAME) == null)
	        {  
	        	//download api	
	    		 return null;
	        }
      
	        ModelAndView mv = new ModelAndView("/test/index","command","download sucessful");
	        
	        return mv;
	 }
		
}
