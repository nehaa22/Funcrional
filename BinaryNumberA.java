package example;

import java.util.Scanner;

public class BinaryNumberA 
{
	public static void main(String args[])
	{
		int arr[],i,first, last, mid,search,n;
		
		Scanner s = new Scanner(System.in);
		
		System.out.println("Enter the Number of elements :");
		n=s.nextInt();
		
		arr = new int[n];
		
		System.out.println("Enter The Elements :\n");
		for(i=0;i<n;i++)
		{
			arr[i]=s.nextInt();
		}
		
		System.out.println("Enter Element to Search :");
		search=s.nextInt();
		
		first=0;
		last=n-1;
		mid= (first+last)/2;
		
		while(first<=last)
		{
			if(arr[mid]<search)
			    first = mid+1;
			
			else
				if(arr[mid] == search)
				{
					System.out.println("Element fount at " +(mid+1)+ " location");
					break;
				}
		    
				
				else
				
					last=mid-1;
					
				
		mid = (first+last)/2;	
		}
		
		if(first>last)
		
			System.out.println(search +" Element Not Present");
	}

}
