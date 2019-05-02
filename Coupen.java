package example;
import java.util.Scanner;
public class Coupen 
{
	public static int getCoupen(int n)
	{
		
		return (int)(Math.random()*n);
	}
	
	public static int compute(int n)
	{
		boolean[] isCollected = new boolean[n];
		int count = 0;
		int distinct = 0;
		
		while(distinct<n)
		{
			int val = getCoupen(n);
			count++;
			if(!isCollected[val])
				distinct++;
			isCollected[val]=true;
		}
		return count;
	}
	public static void main(String args[])
	{
		int n;
		Scanner s = new Scanner(System.in);
		System.out.println("Enter new number :");
		n = s.nextInt();
		int res = compute(n);
		System.out.println(res);
	}

}
