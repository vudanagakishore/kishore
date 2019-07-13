package com.service;

import com.bean.Bean;
import com.dao.Dao;

public class Service 
{
	Dao d;
	public void serviceLogin(Bean b)
	{
		d = new Dao();
		d.storeDao(b);
	}
	public void createLogin(Bean b)
	{
		d = new Dao();
		d.storecreate(b);
		
	}
}
