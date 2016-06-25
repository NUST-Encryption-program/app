package com.app.model;

import java.sql.Date;

public class News 
{
	private String data;
	
	private Date dateofnews;
	
	private String content;
	
	private String title;
	
	private String id;

	public String getData() 
	{
		return data;
	}

	public void setData(String data) 
	{
		this.data = data;
	}

	public String getContent()
	{
		return content;
	}

	public void setContent(String content) 
	{
		this.content = content;
	}

	public String getId() 
	{
		return id;
	}

	public void setId(String id) 
	{
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}
	
	  
	
	
    public Date getDateofnews()
	    {
	        return dateofnews;
	    }
	    
	    public void setDateofnews(Date dateofnews)
	    {
	        this.dateofnews = dateofnews;
	    }

}
