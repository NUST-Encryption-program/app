package com.app.service;

import java.util.List;

import com.app.model.News;

public interface NewsService 
{
	
    public List<News> getAllNews();

    public void addNews(News news);

    public void deleteNews(News news);

    public void deleteAll();
    
    public void updateNews(News news);

}
