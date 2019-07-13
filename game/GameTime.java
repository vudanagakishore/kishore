package com.game;

import java.util.*;

public class GameTime 
{
	public void gametime()
	{
		Scanner s = new Scanner(System.in);
		System.out.println("*******************************************************");
		System.out.println("                 Game Starts Now                       ");
		System.out.println("*******************************************************");
		//System.out.println("Choose From The Following Menu\n"
			//	+ "1.Start The Game\n"
			//	+ "2.Game Description\n"
			//	+ "3.Exit");
		while(true)
		{
			System.out.println("Choose From The Following Menu\n"
					+ "1.Start The Game\n"
					+ "2.Game Description\n"
					+ "3.Exit");
			int choice = s.nextInt();
			switch(choice)
			{
			case 1:
				System.out.println(" Game will start");
				break;
			case 2:
				System.out.println(" Game Is So Simple Users ");
				System.out.println(" The Game is all about Arranging The Jumbled Letters ");
				System.out.println(" You have Only Three Attempts To Crack The Game ");
				System.out.println(" Thats It ");
				System.out.println(" Chello Start The Game ");
				System.out.println(" All The Best ");
				break;
			default:
				System.out.println(" Exit from the game");
				System.exit(0);
			}
		}
	}
}
