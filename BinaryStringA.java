package example;

public class BinaryStringA 
{
	
	static int strSearch(String s[], String x)
	{
		int first,last,len,m,res;
		len=s.length-1;
		
		first=0;
		last=len;
		while(first<=last)
		{
		
		m = (first+last)/2;
		
		if(s[m].compareTo(x)<0)
			first = m+1;
		else
		
		if(s[m].compareTo(x)>0)
			last=m-1;
		
			else
				return m;
		}		
		return -1;
	}
	public static void main(String args[])
	{
		int res;
		String s[] = {"Neha", "Nikita","Ashu","Kanchan","Dolly"};
		String x = "Ashu";
		res= strSearch(s,x);
		/*if(res == -1)
			System.out.println("String Not Present");*/
		
			System.out.println(x+ " String  Present at "+res+ " Location");
			
		
	}
	
 
}
