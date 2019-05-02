package example;

import java.util.Scanner;

public class InsertionNumberA {
	
	static int insert(int arr[], int n)
	{
		int i,d,temp;
		for(i=1;i<=n-1;i++)
		{
		d=i;
		while(d>0 && arr[d-1]>arr[d])
		{
			temp = arr[d];
			arr[d] = arr[d-1];
			arr[d-1]=temp;
			
			d--;
		}
		}
		return 0;
	}
	public static void main(String args[])
	{
		int i,n,arr[];
		
		
		Scanner s = new Scanner(System.in);
		
		System.out.println("Enter the Size :");
		n=s.nextInt();
		
		arr = new int[n];
		
		System.out.println("Enter Array Elements :");
		for(i=0;i<n;i++)
		{
			arr[i]=s.nextInt();
		}
		
		System.out.println("Array Before Sort :");
		for(i=0;i<n;i++)
		{
			System.out.println(arr[i]+" ");
		}
		
		insert(arr,n);
		
		System.out.println("Array After Sort :");
		for(i=0;i<n;i++)
		{
			System.out.println(arr[i]+" ");
		}
		
	    
		
	}

}
