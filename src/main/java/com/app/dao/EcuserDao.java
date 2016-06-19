package com.app.dao;

import com.app.model.Ecuser;
import com.app.model.News;

public interface EcuserDao 
{
	 /**
     * @param user
     * @return
     */
	 public Ecuser findByUsername(String username); 
    
}
