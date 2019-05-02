package example;

public class MergeSort {
	
	
	public static void printA(int[] A)
	{
		for(int i : A)
		{
			System.out.print(i+ " ");
		}
	}
	
	private static int[] merging(int[] A)
	{
		if(A.length <=1)
		{
			return A;
		}
		int n = A.length;
		int mid = n/2;
		
		int[] l = new int[mid];
		int[] r;
		
		if(n % 2 == 0)
			r = new int[mid];
		else
			r = new int[mid +1];
		
		for(int i=0;i<mid;i++)
		{
			l[i]=A[i];
		}
		
		for(int j=0;j<r.length;j++)
		{
			r[j]=A[mid+j];
		}
		
		int[] res = new int[A.length];
		
		l = merging(l);
		r = merging(r);
		
		res = merge(l,r);
		return res;
	}
	
	private static int[] merge(int[] l,int[] r)
	{
		int[] res = new int[l.length + r.length];
		int lp,rp,resp;
		lp=rp=resp=0;
		
		while(lp<l.length || rp<r.length)
		{
			if(lp<l.length && rp<r.length)
			{
				if(l[lp] < r[rp])
				{
					res[resp++]= l[lp++];
				}
				else
				{
					res[resp++]= r[rp++];
					
				}
			}
			
			else if(lp<l.length)
			{
				res[resp++]=l[lp++];
			}
			else if(rp<r.length)
			{
				res[resp++]=r[rp++];
			}
		}
		return res;
		
	}
	
	public static void main(String args[])
	{
		int[] A = {5,4,3,2,1};
		System.out.println("Initial Array :");
		printA(A);
		
		System.out.println();
		
		A = merging(A);
		System.out.println("Sorted Array : ");
		printA(A);
	}

}
