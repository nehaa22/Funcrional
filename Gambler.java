package example;

import java.util.Scanner;

public class Gambler
{
	public static void main(String args[])
	{
		int stack,trail,goal;
		Scanner s = new Scanner(System.in);
		System.out.println("Enter stack trail and Goal :");
		stack = s.nextInt();
		trail = s.nextInt();
		goal = s.nextInt();
		System.out.println("Stack = "+stack);
		System.out.println("Trail = "+trail);
		System.out.println("Goal = "+goal);
		
		int bets=0;
		int win=0;
		
		for(int t=0;t<goal;t++)
		{
			int cash = stack;
			while(cash>0 && cash<goal)
			{
				bets++;
			
			
			if(Math.random()<0.5)
			  cash++;
			else
			  cash--;
			}
			
			if(cash==goal)
				win++;
		}
		
		System.out.println(win +" out of"+ trail);
		System.out.println("Percentage of won :" + 100.0 * win/trail);
		System.out.println("Avegage of bets :" + 1.0* bets/trail);
	}

}
