package com.app.interceptor;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import com.app.constants.Session;

public class CommonInterceptor implements HandlerInterceptor
{

    private List<String> excludedUrls;
    
    public void afterCompletion(HttpServletRequest arg0,
            HttpServletResponse arg1, Object arg2, Exception arg3)
            throws Exception {
        // TODO Auto-generated method stub
    	System.out.println("after starting....");      
    }

    public List<String> getExcludedUrls() 
    {
        return excludedUrls;
    }

    public void setExcludedUrls(List<String> excludedUrls) 
    {
        this.excludedUrls = excludedUrls;
    }

    public void postHandle(HttpServletRequest arg0, HttpServletResponse arg1,
            Object arg2, ModelAndView arg3) throws Exception {
        // TODO Auto-generated method stub
    	System.out.println("post starting....");
        
    }

    public boolean preHandle(HttpServletRequest arg0, HttpServletResponse arg1,
            Object arg2) throws Exception {
        
    	System.out.println("begin starting....");
    	 /*判断是否需要过滤的页面*/  
        HttpSession session = arg0.getSession();    
          
        if(session.getAttribute(Session.CURRENT_USER_ATTR_NAME) == null){  
            /*跳转到登录页*/  
        	arg0.getRequestDispatcher("/WEB-INF/jsp/login/index.jsp").forward(arg0, arg1);  
              
            return false;  
        }  
        return true;  	
    }
}
