package com.app.dao;

import com.app.model.LoginForm;

public interface UserDao 
{
	 /**
     * @param user
     * @return
     */
	public int insertUser(LoginForm user);

}
