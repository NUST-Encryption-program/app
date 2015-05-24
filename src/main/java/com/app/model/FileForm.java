package com.app.model;

import java.io.File;

public class FileForm 
{
	private String fileName;
	
    private String filePath;
    
    private File file;
    
    public FileForm(String fileName, String filePath)
    {
    	this.fileName = fileName;
    	this.filePath = filePath;
    	this.file = new File(filePath + "\\" + fileName);
    }

	public String getFileName() 
	{
		
		return fileName;
		
	}

	public void setFileName(String fileName) 
	{
		
		this.fileName = fileName;
		
	}
	

	public String getFilePath() 
	{
		
		return filePath;
		
	}

	public void setFilePath(String filePath) 
	{
		
		this.filePath = filePath;
		
	}

	public File getFile() 
	{
		
		return file;
		
	}

	public void setFile(File file) 
	{
		
		this.file = file;
		
	}

}
