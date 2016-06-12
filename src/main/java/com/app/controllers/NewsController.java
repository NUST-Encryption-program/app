package com.app.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.app.model.News;
import com.app.service.NewsService;

@Controller
public class NewsController 
{
	@Autowired
	private NewsService newsService;
		
	@RequestMapping("/news/news.json")
	public @ResponseBody List<News> getNewsList() 
	{
		return newsService.getAllNews();
	}


}
