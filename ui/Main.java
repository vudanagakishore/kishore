package com.ui;

import java.util.Scanner;

public class Main 
{
	
	public static void main(String [] args)
	{
		UserRecord u = new UserRecord();
		Scanner keyboard = new Scanner(System.in);
		
		while(true)
		{
			System.out.println("Choose from the following menu\n"
					+ "1.Login to your account\n"
					+ "2.Create your account\n"
					+ "3.Exit");
			int choice  = keyboard.nextInt();
			switch(choice)
			{
				case 1: 
					u.login();
					break;
				case 2:
					u.createLogin();
					break;
				default :
					System.out.println("you are exited");
					System.exit(0);
					break;
			}
		}
	}
}
