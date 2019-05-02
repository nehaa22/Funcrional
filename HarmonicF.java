package example;
import java.util.Scanner;

public class HarmonicF
{
	public static void main(String args[])
	{
		int n;
		float i,sum=0;
		System.out.println("Enter the Number");
		Scanner s = new Scanner(System.in);
		n=s.nextInt();
		
		for(i=1;i<=n;i++)
		{
			System.out.println(1/i);
			sum += ((float)1/i);
		}
		System.out.println("Harmonic Number is " +sum);
	}
	

}
