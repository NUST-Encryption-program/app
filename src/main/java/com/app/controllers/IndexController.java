package com.app.controllers;

import java.util.ArrayList;
import java.util.HashMap;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.app.exceptionofmysql.GetConnectionSqlServer;
import com.app.service.NewsService;
/**
 * Created with IntelliJ IDEA.
 * User: xvitcoder
 * Date: 12/20/12
 * Time: 5:27 PM
 */
@Controller
@RequestMapping("/")
public class IndexController {
	
    @RequestMapping
    public String getIndexPage() {
    	//GetConnectionSqlServer getConn = new GetConnectionSqlServer();  
       // getConn.getConnectionSqlServer();
    	
  
    	
    	
    	return "index";
    }
}
