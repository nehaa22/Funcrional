package example;

import java.util.Scanner;

public class PowerOfF {
	public static void main(String arga[])
	{
		int e,i,n;
		long r=1;
		Scanner s = new Scanner(System.in);
		
		System.out.println("Enter Base term");
		n= s.nextInt();
		System.out.println("Enter Power term");
		e= s.nextInt();
		for(i=1;i<=e;i++)
		{
			r = r * n;
		}
		
		System.out.println("Result is "+ r);
	}

}
