package com.app.controllers;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * 
 * @author gaoyanshou
 * down api and app
 *
 */

@Controller
public class DownloadController {
	
	@RequestMapping(value="/download/api")
	 public ModelAndView download(HttpServletRequest request,HttpServletResponse response)
		{
			

      
	        ModelAndView mv = new ModelAndView("/test/index","command","download sucessful");
	        
	        return mv;
	    }
		
}
