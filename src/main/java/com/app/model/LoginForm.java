package com.app.model;

import java.sql.Date;

public class LoginForm 
{   
	
	int n=0;
	int m=1;
	String s=null;
	private Integer id;
	private String username;//�û���
	private String password;
	private String email;//����
	private Date registerTime;//ע��ʱ��
	private String registerIP;//ע��IP
	private Date lastLoginTime;//����¼ʱ��
	private String lastLoginIP;//����¼IP
	private Integer loginCount;//��¼����
	private Integer rank;//����Ա����
	private long uploadSize;//�ϴ��ܴ�С
	private Date uploadDate;//�ϴ�����
	private boolean admin;//�Ƿ��ǹ���Ա
	private boolean viewonlyAdmin;//�Ƿ�ֻ������Ա
	private boolean selfAdmin;//�Ƿ�����Լ�������
	private boolean disabled;//�Ƿ����
    
    public String getUsername() 
    {
    	
        return username;
        
    }
    
    public void setUsername(String username) 
    {
    	
        this.username = username;
        
    }
    
    public String getPassword() 
    {
    	
        return password;
        
    }
    
    public void setPassword(String password) 
    {
    	
        this.password = password;
        
    }

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Date getRegisterTime() {
		return registerTime;
	}

	public void setRegisterTime(Date registerTime) {
		this.registerTime = registerTime;
	}

	public String getRegisterIP() {
		return registerIP;
	}

	public void setRegisterIP(String registerIP) {
		this.registerIP = registerIP;
	}

	public Date getLastLoginTime() {
		return lastLoginTime;
	}

	public void setLastLoginTime(Date lastLoginTime) {
		this.lastLoginTime = lastLoginTime;
	}

	public String getLastLoginIP() {
		return lastLoginIP;
	}

	public void setLastLoginIP(String lastLoginIP) {
		this.lastLoginIP = lastLoginIP;
	}

	public Integer getLoginCount() {
		return loginCount;
	}

	public void setLoginCount(Integer loginCount) {
		this.loginCount = loginCount;
	}

	public Integer getRank() {
		return rank;
	}

	public void setRank(Integer rank) {
		this.rank = rank;
	}

	public Date getUploadDate() {
		return uploadDate;
	}

	public void setUploadDate(Date uploadDate) {
		this.uploadDate = uploadDate;
	}

	public long getUploadSize() {
		return uploadSize;
	}

	public void setUploadSize(long uploadSize) {
		this.uploadSize = uploadSize;
	}

	public boolean isAdmin() {
		return admin;
	}

	public void setAdmin(boolean admin) {
		this.admin = admin;
	}

	public boolean isViewonlyAdmin() {
		return viewonlyAdmin;
	}

	public void setViewonlyAdmin(boolean viewonlyAdmin) {
		this.viewonlyAdmin = viewonlyAdmin;
	}

	public boolean isSelfAdmin() {
		return selfAdmin;
	}

	public void setSelfAdmin(boolean selfAdmin) {
		this.selfAdmin = selfAdmin;
	}

	public boolean isDisabled() {
		return disabled;
	}

	public void setDisabled(boolean disabled) {
		this.disabled = disabled;
	}

}
