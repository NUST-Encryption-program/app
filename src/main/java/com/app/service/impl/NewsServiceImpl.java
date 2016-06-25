package com.app.service.impl;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.app.dao.NewsDao;
import com.app.model.News;
import com.app.service.NewsService;

@Service("newsService")
public class NewsServiceImpl implements NewsService 
{
    @Autowired
    private NewsDao newsDao;
	
	private static ArrayList<HashMap> newsList = new ArrayList();
	
	private static int NEWS_NUM = 11;
	
	private void clearList()
	{
		newsList.clear();
	}
	
	
	
	
	
	@SuppressWarnings("unchecked")
	@Transactional
	public List<HashMap> getAllNews() 
	{
		if (newsList.size() != NEWS_NUM || newsList.isEmpty())
		{
			clearList();
			
			for(News tmp:newsDao.selectCurMonthListNews())
			{
				HashMap<String, String> newsMap = new HashMap<String, String>();
				newsMap.put("date", tmp.getDateofnews().toString());
				newsMap.put("content", tmp.getTitle());
				newsMap.put("detailcontent", tmp.getContent());
				newsMap.put("http", "contents/page.html");
				newsList.add(newsMap);
				//System.out.println(tmp.getDateofnews().toString());
			}
			
		}
		return newsList;
	}
	@Autowired
	 private NewsDao oldNewsDao;
	
	private static ArrayList<HashMap> oldNewsList = new ArrayList();
	
	private static int OLDNEWS_NUM = 9;
	
	private void clearOldList()
	{
		oldNewsList.clear();
	}

	@SuppressWarnings("unchecked")
	@Transactional
	public List<HashMap> getAllOldNews() 
	{   
		if (oldNewsList.size() != OLDNEWS_NUM ||oldNewsList.isEmpty())
		{
			clearOldList();
			//System.out.println("getAllOldNews第一个if过了");
			for(News tmp:oldNewsDao.selectPreMonthListNews())
			{  //System.out.println("getAllOldNews第一个if过了for内");
				HashMap<String, String> newsMap = new HashMap<String, String>();
				newsMap.put("date", tmp.getDateofnews().toString());
				newsMap.put("content", tmp.getTitle());
				newsMap.put("detailcontent", tmp.getContent());
				newsMap.put("http", "contents/page.html");
				oldNewsList.add(newsMap);
				//System.out.println(tmp.getDateofnews().toString());
			}
			
		}
		
		return oldNewsList;
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
