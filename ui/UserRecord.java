package com.ui;

import java.util.Scanner;

import com.bean.Bean;
//import com.bean.Bean;
import com.service.Service;

public class UserRecord 
{
	Scanner s;
	Bean b;
	Service se;
	public void login()
	{
		//System.out.println("1 method");
		s = new Scanner(System.in);
		System.out.println("Enter your username");
		String username = s.nextLine();
		System.out.println("Enter your password");
		String password = s.nextLine();
		b = new Bean(username,password);
		se = new Service();
		se.serviceLogin(b);
		
	}
	
	public void createLogin()
	{
		//System.out.println("2 method");
		System.out.println("Enter the user name");
		s = new Scanner(System.in);
		String username = s.nextLine();
		System.out.println("Enter your password");
		String password = s.nextLine();
		b = new Bean(username,password);
		se = new Service();
		se.createLogin(b);
	}
}
