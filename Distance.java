package example;
import java.util.Scanner;

public class Distance {
	public static void main(String args[])
	{
		double x,y,n1,n2,d;
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the coordinates :");
		x = s.nextDouble();
		y = s.nextDouble();
		n1= Math.pow(x,2);
		n2= Math.pow(y,2);
		d=Math.pow((n1+n2),0.5);
		System.out.println("Distance : "+ d);
		
	}

}
