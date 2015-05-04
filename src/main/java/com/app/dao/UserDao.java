package com.app.dao;

import org.springframework.stereotype.Repository;

import com.app.model.LoginForm;

public interface UserDao 
{
	 /**
     * 添加新用户
     * @param user
     * @return
     */
	public int insertUser(LoginForm user);

}
