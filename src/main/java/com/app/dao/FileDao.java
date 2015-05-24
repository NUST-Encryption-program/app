package com.app.dao;

import com.app.model.FileForm;

public interface FileDao 
{
	/**
	 * init download file info
	 * by gaoyanshou
	 */
	void init();
	
	FileForm getFileDao(String key);
	
	void insertFileDao(FileForm fileForm);

}
