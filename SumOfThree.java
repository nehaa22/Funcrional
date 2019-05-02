package example;
import java.util.Scanner;

public class SumOfThree 
{
	public int compute(int arr[],int n)
	{
		int i,j,k;
		int cnt = 0;
		
		for(i=0;i<n;i++)
		{
			for(j=i+1;j<n;j++)
			{
				for(k=0;k<n;k++)
				{
					if(arr[i] + arr[j] + arr[k] == 0)
					{
						System.out.println(arr[i]+" "+arr[j]+" "+arr[k]);
						cnt++;
					}
				}
			}
		}
		return cnt;
		
	}
	public static void main(String args[])
	{
		int arr[], n;
		Scanner s = new Scanner(System.in);
		System.out.println("Enter number of elements :");
		n=s.nextInt();
		arr = new int[n];
		
		System.out.println("Enter the Array elements :");
		for(int i=0;i<n;i++)
		{
			arr[i]=s.nextInt();
		}
		
		SumOfThree sm = new SumOfThree();
		int sum = sm.compute(arr,n);
		System.out.println("Number of Triplets is : "+ sum);
		
	}

}
