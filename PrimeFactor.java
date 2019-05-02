package example;
import java.lang.*;

public class PrimeFactor 
{

	public static void main(String args[])
	{
		int n=315;
		int i;
		
		
		for(i=2; i<n; i++)
		{
			while(n%i==0)
			{
				System.out.print(i + " ");
			n /= i;
			}
		}
		
		if(n>2)
		{
			System.out.print(n+ " ");
		}
	}
	
	
}


