package com.app.service;

import java.util.HashMap;
import java.util.List;

import com.app.model.News;

public interface NewsService 
{
	
    public List<HashMap> getAllNews();

    public void addNews(News news);

    public void deleteNews(News news);

    public void deleteAll();
    
    public void updateNews(News news);

	public List<HashMap> getAllOldNews();



}
