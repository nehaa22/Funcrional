package example;

public class PrimeRangeF 
{
	public static boolean pallin(int n)
	{
		int r,sum=0;
	
		int num = n;
	    while(n>0)
	    {
	    	
	    	r=n%10;
	    	sum = sum*10 + r;
	    	n/=10;
	    }
	      if(num== sum)
	      {
	    	 return true;
	      }else
	          {
	    	    return false;
	          }
	}
	public static void main(String args[])
	{
		int i,n,r,pos=0,sum=0;
		int arr[] =new int[1000];
		for(n=2;n<1000;n++)
		{
		   for(i=2;i<1000;i++)
			  {
		         if(n%i == 0)
				   break;
			  }
		         if(n==i)
		         {
		              System.out.println("Prime Number :"+n);
		      
		                if(pallin(n))
		                {
		    	           arr[pos]=n;
		    	            pos++;
		                 }
		          } 
	 }
		for(i=0;i<pos;i++)
		{
			System.out.println("Prime As well as Pallindrome : "+arr[i]);
		}
		
	}
}


