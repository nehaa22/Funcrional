package example;
import java.util.Scanner;
public class BinaryPower 
{
	public static void toBinary(int v)
	{
		int x=0;
		for(int i=0;(v-Math.pow(2,i)>0); i++)
		{   
			v -= Math.pow(2,i);
			x++;
		}
		for(int j=0;j<=x;j++)
		{
			System.out.println(Math.pow(2,j));
		}
	}
	public static void main(String args[])
	{
		int val;
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the Number :");
		val=s.nextInt();
		toBinary(val);
		
	}

}
