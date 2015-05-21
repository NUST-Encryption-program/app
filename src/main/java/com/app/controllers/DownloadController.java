package com.app.controllers;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.app.constants.Session;

/**
 * 
 * @author gaoyanshou
 * down api and app
 *
 */

@Controller
public class DownloadController {
	
	//暂时写死
	private static String fileName = "api.zip";
	
	File file = new File("E:\\gaoyanshou" + "\\" + fileName);
	
	
	@RequestMapping(value="/download/api")
	 public ModelAndView download(HttpServletRequest request,HttpServletResponse response)
	 {
		ModelAndView mv = new ModelAndView("/test/index","command","download sucessful");
		
	 	HttpSession session = request.getSession(); 
		    
	        if (session.getAttribute(Session.CURRENT_USER_ATTR_NAME) == null)
	        {  
	        	if(!file.exists())
	        	{
	        		request.setAttribute("message", "抱歉，资源暂时无法下载");
	        		
	        		return mv;
	        		
	        	}
	        	//download api	
	        	try {
	        		fileName =  URLEncoder.encode(fileName, "UTF-8");;
				} catch (UnsupportedEncodingException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
	        	//上传的文件都是保存在/WEB-INF/upload目录下的子目录当中
	        	//String fileSaveRootPath=this.getServletContext().getRealPath("/WEB-INF/upload");
	        	response.setContentType("application/zip");
	        	response.addHeader("Content-Disposition", "attachment;filename=" + fileName);
	        	OutputStream out = null;
	        	FileInputStream in = null;
	        	try {
					out = response.getOutputStream();
					in = new FileInputStream(file);
					byte[] buffer = new byte[1024];
					int len = 0;
					while ((len = in.read(buffer)) > 0) {
						out.write(buffer, 0, len);
					}
					in.close();
					out.flush();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
	    		return null;
	        }
      
	        
	        
	        return mv;
	 }
		
}
