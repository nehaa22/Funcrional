package example;
import java.util.Scanner;
import java.lang.*;
public class Anagram
{
	public static void main(String args[])
	{
		String s1,s2;
		int i,j,l,l1,l2,found=0,nfound=0;
		Scanner s = new Scanner(System.in);
		System.out.println("Enter first String :");
		s1=s.nextLine();
		System.out.println("Enter Second String :");
		s2=s.nextLine();
		l1=s1.length();
		l2=s2.length();
		
		if(l1 == l2)
		{
			l=l1;
			for(i=0;i<l;i++)
			{
				for(j=0;j<l;j++)
				{
					if(s1.charAt(i) == s2.charAt(j))
					{
						found = 1;
						break;
					}
				}
				if(found == 0)
				{
					nfound=1;
					break;
				}
				
			}
			
			if(nfound == 1)
			{
				System.out.println("String are not Anagrams");
			}
			else
			{
				System
				.out.println("String are Anagram");
			}
		}
		else
		{
			System.out.println("Both strings must have same length");
		}
	}

}
