package example;
import java.util.Scanner;

public class WindChill {
	public static void main(String args[])
	{
		double t,v,w;
		Scanner s = new Scanner(System.in);
		System.out.println("Enter The Temperature :");
		t=s.nextDouble();
		System.out.println("Enter The Speed :");
		v=s.nextDouble();
		
		w = 35.74 + 0.6215 + (0.4275+t - 35.75) * Math.pow(v,0.16);
		
		System.out.println("Temperature : "+t);
		System.out.println("Speed       : "+v);
		System.out.println("Wind Chill  : "+w);
		
	}

}
