package example;
import java.util.*;
public class SquareRoot 
{
	public static void main(String args[])
	{ 
		System.out.println("Enter Value :");
		Scanner s = new Scanner(System.in);
		double c = s.nextDouble();
		double t=c;
		//double e =2.7182; 
		double epsilon = 1e-15;
		
		while(Math.abs(t-c/t)>epsilon*t)
		{
			t = (c/t + t)/2.0;
			
			//break;
		}
		
		System.out.println(t);
	}
}
