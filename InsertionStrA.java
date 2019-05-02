package example;
import java.util.Scanner.*;

public class InsertionStrA {
	
		public static void main(String args[])
		{
			int i,d,n;
			String str[]= {"Z","F","H","Y","O"};
			String temp;
			n=str.length;
			System.out.println("String before sorted :");
			for(i=0;i<n;i++)
			{
			System.out.println(str[i]);
			}
			
			System.out.println("Sorted  String Elements :");
			

	        for(i=1;i<=n-1;i++)
	        {
	        	d=i;
	        	
	        	{
	        		if(d>0 && (str[d].compareTo(str[d-1])>0))
	        		{
	        			temp = str[d];
	        			str[d]= str[d-1];
	        			str[d-1]=temp;
	        			d--;
	        		}
	        	}
	        	for(i=0;i<n;i++)
	        	{
	        	System.out.println(str[i]);
	           }
	        }
	        
	        
		}

	}


