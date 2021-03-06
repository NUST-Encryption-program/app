package com.app.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.app.dao.UserDao;
import com.app.model.LoginForm;
import com.app.service.UserService;

@Service
@Transactional
public class UserServiceImpl implements UserService
{
	    @Autowired
	    private UserDao userDao;
	    

		public int insertUser(LoginForm user) 
	    {
	        // TODO Auto-generated method stub
	    	if (1 == userDao.insertUser(user))
	    	{
	    		return -1;
	    	}
	    	
	        return 0;
	        
	    }


		public UserDao getUserDao() {
			return userDao;
		}


		public void setUserDao(UserDao userDao) {
			this.userDao = userDao;
		}	    
	  
}
