package com.dao;
import java.util.Scanner;
import java.util.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import com.bean.Bean;
import com.game.GameTime;

public class Dao 
{
	GameTime g;
	//HashMap<String,String> hm = new HashMap<String,String>();
    //hm.put("asd","asd@123");
	//hm.put("fgh","fgh@123");
	//hm.put("jkl","jkl@123");
	//hm.put("qwe","qwe@123");
	//hm.put("rty","rty@123");
	Bean b1 = new Bean("asd","asd@123");
	Bean b2 = new Bean("fgh","fgh@123");
	Bean b3 = new Bean("jkl","jkl@123");
	Bean b4 = new Bean("qwe","qwe@123");
	Bean b5 = new Bean("rty","rty@123");
	Bean [] a = new Bean[10];
	
	HashMap<String,Bean> hm = new HashMap<String,Bean>();
	public void storeDao(Bean b)
	{
		a[0] = b1;
		a[1] = b2;
		a[2] = b3;
		a[3] = b4;
		a[4] = b5;
		int flag=0;
		for(int i=0;i<5;i++)
		{
			if(b.getUsername().equals(a[i].getUsername()))
			{
				flag=1;
			}
		}
		if(flag==0)
		{
		System.out.println("Not a valid user");
		}
		else
		{
		System.out.println("Logged suucessfully");
		g = new GameTime();
		g.gametime();
		}
	}
	
	public void storecreate(Bean b)
	{
		
		hm.put(b.getUsername(), b);
		System.out.println(hm);
	}
}






/*a[9] = b;
System.out.println("Account created successfully");
System.out.println("username: "+ a[9].getUsername()+"Password "+ a[9].getPassword());*/





/*		if(b.getUsername() != a[0].getUsername())
{
	System.out.println(" Not Valid user");
}
else if(b.getUsername() != a[1].getUsername())
{
	System.out.println("Not Valid user");
}
else if(b.getUsername() != a[2].getUsername())
{
	System.out.println("Not Valid user");
}
else if(b.getUsername() != a[3].getUsername())
{
	System.out.println("Not Valid user");
}
else if(b.getUsername() != a[4].getUsername())
{
	System.out.println("Not Valid user");
}
*/
/*else
{
	System.out.println("Logged suucessfully");
}
*/
