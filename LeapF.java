package example;
import java.util.Scanner;

public class LeapF 
{
	public static void main(String args[])
	{
		int y;
		System.out.println("Enter Year :");
		Scanner s = new Scanner(System.in);
		y = s.nextInt();
		
		if((y%4==0 && y%100 !=0)||(y%400==0))
		{
			System.out.println(y + " is Leap Year");
		}
		else
		{
			System.out.println(y + " is Not  Leap Year");
		}
	}

}
