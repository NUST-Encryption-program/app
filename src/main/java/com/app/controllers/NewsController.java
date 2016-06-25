package com.app.controllers;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.app.service.NewsService;
import com.app.controllers.*;

@Controller

public class NewsController 
{
	@Autowired
	private NewsService newsService;
	ArrayList<HashMap> temp = new ArrayList();
	
	@RequestMapping("/news/news.json")
	public @ResponseBody List<HashMap> getNewsList() 
	{   
		temp.addAll(newsService.getAllNews());
		return temp;
	}
    
	
	
	@RequestMapping("/news/oldnews.json")
	public @ResponseBody List<HashMap> getOldNewsList() 
	{   
		return newsService.getAllOldNews();
	}
	
	@RequestMapping("/news/firstnews.json")
	public @ResponseBody List<HashMap> getLastestNewsList() 
	{   
		ArrayList<HashMap> firstNewList = new ArrayList();
		firstNewList.add(temp.get(0));
		return firstNewList;
	}
}
