package example;
import java.util.Scanner;

public class BubbleIntA {
	
	static int bubble(int arr[],int n)
	{
		int i,j,temp;
		for(i=0;i<n-1;i++)
		{
			for(j=0;j<n-i-1;j++)
			{
				if(arr[j]>arr[j+1])
				{
					temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1]= temp;
				}
			}
		}
		return 0;
	}
	public static void main(String args[])
	{
		int arr[],i,n,j,temp;
		Scanner s = new Scanner(System.in);
		System.out.println("Enter Number of Elements :");
		n=s.nextInt();
		
		arr = new int[n];
		System.out.println("Enter Elements :");
		for(i=0;i<n;i++)
		{
			arr[i]=s.nextInt();
		}
		System.out.println("Array Elements Before Sort   :");
		for(i=0;i<n;i++)
		{
			System.out.print(arr[i]+" ");
			
		}
		System.out.println();
		
		
		bubble(arr,n);
		
		System.out.println("Array Elements After Sort   :");
		for(i=0;i<n;i++)
		{
			System.out.print(arr[i]+" ");
		}
		
		
		
	}
	
	

}
