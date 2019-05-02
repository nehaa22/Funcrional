package example;

import java.util.Scanner;

public class BubbleStringA {
	
	public static void main(String args[])
	{
		int i,j,n;
		String str[]= {"Z","F","H","Y","O"};
		String temp;
		n=str.length;
		System.out.println("String before sorted :");
		for(i=0;i<n;i++)
		{
		System.out.println(str[i]);
		}
		
		System.out.println("Sorted  String Elements :");
		

        for(i=0;i<n;i++)
        {
        	for(j=i+1;j<n;j++)
        	{
        		if(str[i].compareTo(str[j])>0)
        		{
        			temp = str[i];
        			str[i]= str[j];
        			str[j]=temp;
        		}
        	}
        	
        	System.out.println(str[i]);
        }
        
        
	}

}
