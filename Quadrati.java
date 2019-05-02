package example;
import java.util.Scanner;

public class Quadrati {
	public static void main(String args[])
	{
		double a,b,c,delta,r1,r2;
		Scanner s = new Scanner(System.in);
		System.out.println("Enter variables of equations :");
		a=s.nextDouble();
		b=s.nextDouble();
		c=s.nextDouble();
		
		delta = b*b - 4*a*c;
		
		if(delta >0)
		{
			r1= ((+b + Math.sqrt(delta))/2*a);
			r2= ((-b + Math.sqrt(delta))/2*a);
			
			System.out.println("Root1 : "+r1);
			System.out.println("Root2 : "+r2);
		}

		else
			if(delta == 0)
		{
			r1=r2= b/2*a;
			System.out.println("Root1 and Root2 : "+r1);
		}
			else 
			{
			   System.out.println("Enter positive");
		    }
		
	}

}
