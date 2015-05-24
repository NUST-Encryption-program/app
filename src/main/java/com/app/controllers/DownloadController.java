package com.app.controllers;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.app.constants.FileConstant;
import com.app.dao.FileDao;

/**
 * 
 * @author gaoyanshou
 * down api and app
 *
 */

@Controller
public class DownloadController {
	
	//暂时写死
	
	
	//File file = new File("E:\\gaoyanshou" + "\\" + fileName);
	
	//使用spring自动注入
	@Autowired
	private FileDao fileDao;
	
	private String fileName = null;
	
	OutputStream out = null;
	
	FileInputStream in = null;
	
	@RequestMapping(value="/download/api")
	 public ModelAndView download(HttpServletRequest request,HttpServletResponse response)
	 {
		ModelAndView mv = new ModelAndView("/test/index","command","download sucessful");
		
	 	//HttpSession session = request.getSession(); 
			    
		//download api	
		try {
			fileName = fileDao.getFileDao(FileConstant.KEY_JAVA_DOWN_FILE).getFileName();
			fileName =  URLEncoder.encode(fileName, "UTF-8");
			
		} catch (UnsupportedEncodingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
		if (downloadFile(request, response, fileDao.getFileDao(FileConstant.KEY_JAVA_DOWN_FILE).getFile()) == true)
		{
			return mv;
		}
		
		return null;
	 	        
	 }
	 
	boolean downloadFile(HttpServletRequest request,HttpServletResponse response,File file)
	{
	    if(!file.exists())
	    {
	        
			return false;
			
		}
		
		response.setContentType("application/zip");
		
    	response.addHeader("Content-Disposition", "attachment;filename=" + fileName);

    	try {
    		
			out = response.getOutputStream();
			
			in = new FileInputStream(file);
			
			byte[] buffer = new byte[1024];
			
			int len = 0;
			
			while ((len = in.read(buffer)) > 0) 
			{
				
				out.write(buffer, 0, len);
				
			}
			
			in.close();
			
			out.flush();
			
			return true;
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    	
		return false;
	}
		
}
