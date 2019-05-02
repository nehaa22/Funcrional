package example;
import java.util.Scanner;

public class Permutation
{
	
	public static void swap(char ch[], int i, int j)
	{
		char temp=ch[i];
		ch[i]=ch[j];
		ch[j]=temp;
	}
	public static void permute(char ch[],int currenti)
	{
		if(currenti == ch.length-1)
		{
			System.out.println(String.valueOf(ch));
		}
		for(int i=currenti;i<ch.length;i++)
		{
			swap(ch,currenti,i);
			permute(ch,currenti+1);
			swap(ch,currenti,i);
			
		}
		
	}
	public static void main(String args[])
	{
		String str;
		Scanner s = new Scanner(System.in);
		System.out.println("Enter String :");
		str=s.nextLine();
		permute(str.toCharArray(),0);
		
	}

}
