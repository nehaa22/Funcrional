package example;
import java.io.PrintWriter;
import java.util.Scanner;
public class Array 
{
	public static void main(String args)
	{
		int r,c;
		Scanner s = new Scanner(System.in);
		System.out.println("Enter Number of rows :");
		r=s.nextInt();
		System.out.println("Enter Number of Columns :");
		c=s.nextInt();
		
		//methods calling
		int ai[][] = arrInteger(r,c);
		double ad[][] = arrDouble(r,c);
		String as[][] = arrString(r,c);
		
		display(ai,ad,as,r,c);
		
	}
	
	public static int[][] arrInteger(int m, int n)
	{
		int ai[][]= new int[m][n];
		Scanner s = new Scanner("System.in");
		System.out.println("Integer Array :");
		
		for(int i=0;i<m;i++)
		{
			for(int j=0;j<n;j++)
			{
				ai[m][n]= s.nextInt();
			}
				
		}
		
		return ai;
		
	}
	
	public static double[][] arrDouble(int m, int n)
	{
		double ad[][]= new double[m][n];
		Scanner s = new Scanner("System.in");
		System.out.println("Integer Array :");
		
		for(int i=0;i<m;i++)
		{
			for(int j=0;j<n;j++)
			{
				ad[m][n]= s.nextDouble();
			}
				
		}
		
		return ad;
		
	}
	
	public static String[][] arrString(int m, int n)
	{
		String as[][]= new String[m][n];
		Scanner s = new Scanner("System.in");
		System.out.println("Integer Array :");
		
		for(int i=0;i<m;i++)
		{
			for(int j=0;j<n;j++)
			{
				as[m][n]= s.nextLine();
			}
				
		}
		
		return as;
		
	}

	
	//Display result
	
	public static void display(int [][]ai,double[][]ad, String[][]as, int m, int n)
	{
		
		PrintWriter pw = new PrintWriter(System.out,true);
		
		System.out.println("Integer Array :");
		for(int i=0;i<m;i++)
		{
			for(int j=0;j<n;j++)
			{
				pw.print(" "+ ai[m][n]+" ");
			}
		}
		
		System.out.println("Double  Array :");
		for(int i=0;i<m;i++)
		{
			for(int j=0;j<n;j++)
			{
				pw.print(" "+ ad[m][n]+" ");
			}
		}
		
		System.out.println("String Array :");
		for(int i=0;i<m;i++)
		{
			for(int j=0;j<n;j++)
			{
				pw.print(" "+ as[m][n]+" ");
			}
		}
	}
		
}


	


