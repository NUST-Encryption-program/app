package com.app.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.app.model.News;
import com.app.service.NewsService;

@Service("newsService")
public class NewsServiceImpl implements NewsService 
{
	private static ArrayList<News> newsList = new ArrayList();
	
	private static int NEWS_NUM = 10;
	
	private void clearList()
	{
		newsList.clear();
	}
	
	public void  update()
	{
		//数据库查询语句操作，查询当月最新的十条新闻
		//将查询的新闻数据的id，新闻标题，和新闻时间，重新组装成News对象
		//将News数据更新到内存
	}

	public List<News> getAllNews() 
	{
		if (newsList.size() != NEWS_NUM || newsList.isEmpty())
		{
			clearList();
			update();		
		}
		
		return newsList;
	}

	public void addNews(News news) 
	{
		// TODO Auto-generated method stub

	}

	public void deleteNews(News news) 
	{
		// TODO Auto-generated method stub

	}

	public void deleteAll() 
	{
		// TODO Auto-generated method stub

	}

	public void updateNews(News news) 
	{
		// TODO Auto-generated method stub

	}

}
