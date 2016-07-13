package com.app.service.impl;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.omg.CORBA.Request;
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
			int idofnewss=0;
			for(News tmp:newsDao.selectCurMonthListNews())
			{
				HashMap<String, String> newsMap = new HashMap<String, String>();
				newsMap.put("date", tmp.getDateofnews().toString());
				newsMap.put("content", tmp.getTitle());
				newsMap.put("detailcontent", tmp.getContent());
				String sid=String.valueOf(idofnewss);
				newsMap.put("idofnews", sid);
				newsList.add(newsMap);
				idofnewss++;
				
			}
			
		}
	
		return newsList;
	}
	@Autowired
	 private NewsDao oldNewsDao;
	
	private static ArrayList<HashMap> oldNewsList = new ArrayList();
	
	private static int OLDNEWS_NUM = 2;
	
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
			int idofoldnewss=0;
			
			for(News tmp:oldNewsDao.selectPreMonthListNews())
			{  
				HashMap<String, String> newsMap = new HashMap<String, String>();
				newsMap.put("date", tmp.getDateofnews().toString());
				newsMap.put("content", tmp.getTitle());
				newsMap.put("detailcontent", tmp.getContent());
				String sid=String.valueOf(idofoldnewss+12);
				newsMap.put("idofnews", sid);
			    oldNewsList.add(newsMap);
				idofoldnewss++;
			}
			
		}
		
		return oldNewsList;
	}
	
	
	
	@Autowired
	 private NewsDao firstNewsDao;
	
	private static ArrayList<HashMap> selectedNewList = new ArrayList();
	
	private static int SELECTNEW_NUM = 1;
	
	private void clearfirstList()
	{
		selectedNewList.clear();
	}

	@SuppressWarnings("unchecked")
	@Transactional
	public List<HashMap> getFirstNew() 
	{   
		if (selectedNewList.size() != SELECTNEW_NUM ||selectedNewList.isEmpty())
		{
			clearfirstList();
			int idoffirstnews=0;
			for(News tmp:firstNewsDao.selectCurFirstNew())
			{ 
				HashMap<String, String> newsMap = new HashMap<String, String>();
				newsMap.put("date", tmp.getDateofnews().toString());
				newsMap.put("content", tmp.getTitle());
				newsMap.put("detailcontent", tmp.getContent());
				String sid=String.valueOf(idoffirstnews);
				newsMap.put("idofnews", sid);
			    selectedNewList.add(newsMap);
			    idoffirstnews++;
				
			}
			
		}
		
		return selectedNewList;
	}
	
	
	//新闻页面跳转，搜索数据库的实现方法，因为使用了内存，所以可以不调用这段函数。
	@Autowired
	 private NewsDao selectedNewDao;
	
	private static ArrayList<HashMap> selectedNewByIdList = new ArrayList();
	
	private static int SELECTEDNEW_NUM = 1;
	
	private void clearSelectedNewList()
	{
		selectedNewByIdList.clear();
	}

	@SuppressWarnings("unchecked")
	@Transactional
	public List<HashMap> getSelectedNewById(String idofselectednew) 
	{  
		
			clearSelectedNewList();
           
			for(News tmp:selectedNewDao.selectTheNewById(idofselectednew))
			{ 
				HashMap<String, String> newsMap = new HashMap<String, String>();
				newsMap.put("date", tmp.getDateofnews().toString());
				newsMap.put("content", tmp.getTitle());
				newsMap.put("detailcontent", tmp.getContent());
				//String sid=String.valueOf(id);
				newsMap.put("idofnews", tmp.getId());
				
				
			//	System.out.println("id:"+tmp.getId());
				//System.out.println("title:"+tmp.getTitle());
				//System.out.println("content:"+tmp.getContent());
				
				selectedNewByIdList.add(newsMap);
			}
			
	
		
		return selectedNewByIdList;
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
