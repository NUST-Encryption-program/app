package com.app.controllers;


import java.util.HashMap;
import java.util.List;

import javax.management.MBeanServer;
import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.app.service.NewsService;


@Controller
public class NewsController 
{
	@Autowired
	private NewsService newsService;
	  

	@RequestMapping("/news/news.json")
	public @ResponseBody List<HashMap> getNewsList() 
	{   
		//System.out.println("asdfasdfasdfasdfasdfasdf");
		//System.out.println("newsService.getAllNews().get(0)="+newsService.getAllNews().get(0));
		
		return newsService.getAllNews();
	}
    
	
	@RequestMapping("/news/oldnews.json")
	public @ResponseBody List<HashMap> getOldNewsList() 
	{   
		System.out.println("newsService.getAllOldNews().get(0)="+newsService.getAllOldNews().get(0));
		return newsService.getAllOldNews();
	}
	
	@RequestMapping("/news/firstnews.json")
	public @ResponseBody List<HashMap> getLastestNewsList() 
	{   
		
		
		return newsService.getFirstNew();
	}
}
