package com.app.dao.impl;

import java.util.HashMap;
import java.util.Map;

import com.app.constants.FileConstant;
import com.app.dao.FileDao;
import com.app.model.FileForm;

public class FileDaoImpl implements FileDao
{
	private Map<String, FileForm> map = null;
	
	public void init() {
		// TODO Auto-generated method stub
		if (map == null)
		{
			map = new HashMap<String,FileForm>(); 
		}
		map.put(FileConstant.KEY_JAVA_DOWN_FILE, new FileForm(FileConstant.FILE_NAME_JAVA, FileConstant.FILE_PATH));
		map.put(FileConstant.KEY_C_DOWN_FILE, new FileForm(FileConstant.FILE_NAME_C, FileConstant.FILE_PATH));
		map.put(FileConstant.KEY_REST_DOWN_FILE, new FileForm(FileConstant.FILE_NAME_REST, FileConstant.FILE_PATH));
		map.put(FileConstant.KEY_ANDROID_DOWN_FILE, new FileForm(FileConstant.FILE_NAME_ANDROID, FileConstant.FILE_PATH));
		map.put(FileConstant.KEY_IPHONE_DOWN_FILE, new FileForm(FileConstant.FILE_NAME_IPHONE, FileConstant.FILE_PATH));
		
	}

	public FileForm getFileDao(String key)
	{
		// TODO Auto-generated method stub
		return map.get(key);
	}

	public void insertFileDao(FileForm fileForm) {
		// TODO Auto-generated method stub
		map.put(FileConstant.KEY_JAVA_DOWN_FILE, fileForm);
	}

}
