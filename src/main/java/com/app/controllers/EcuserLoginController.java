package com.app.controllers;


import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;


import com.app.dao.EcuserDao;
import com.app.model.Ecuser;
import com.app.controllers.*;

@Controller
public class EcuserLoginController {
		
	@Autowired
	private EcuserDao ecuserDao;

	
	@RequestMapping("/logins/login/Ecuser")
   public String login(HttpServletRequest request,HttpServletResponse response,Ecuser entity,HttpSession httpSession )
	{     
		   System.out.println("输入的用户名："+request.getParameter("usernamee"));
		   System.out.println("输入的密码："+request.getParameter("passwd"));   
		   String username=request.getParameter("usernamee");
		   String password=request.getParameter("passwd");
		   System.out.println(username.length());
		   System.out.println(password.length());
	
	   
	if((2<username.length()&username.length()<13)&&(2<password.length()&password.length()<13)){   
		if(ecuserDao.findByUsername(request.getParameter("usernamee"))!=null){
			entity = ecuserDao.findByUsername(request.getParameter("usernamee"));
			if(entity.getPassword().compareTo(request.getParameter("passwd"))==0){
				System.out.println("登录成功");
				  return "redirect:/"; 
		        }
		     else{
					System.out.println("用户名与密码不匹配导致登录失败");
	                return "redirect:/logins/login";
				}
		}
		
		else{
			System.out.println("用户名拼写错误错误，或者该用户没有注册，导致登录失败"); 
		     return "redirect:/logins/login";
         }
		}
	else{
	     System.out.println("长短空不符合要求");
	     return "redirect:/logins/login";
		}
	}
	
}	

