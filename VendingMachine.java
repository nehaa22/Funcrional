package example;
import java.util.Scanner;
public class VendingMachine 
{
	static int i=0;
	static int total = 0;
	static int note[]= {2000,500,200,100,50,20,10,5,2,1};
	
	public static int calculate(int money,int[] note)
	{
		int rem=0;
		
		if(money == 0)
		{
			return -1;
		}
		else
		{
			if(money >= note[i])
			{
				int cal = money/note[i];
				rem = money % note[i];
				money = rem;
				total += cal;
				System.out.println( "Notes of " + note[i] + " = " + cal);
				
			}
			i++;
		
		return calculate(money,note);
    }
}
	
	
	
	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		int money;
		System.out.println("Enter the Amount :");
		money = s.nextInt();
		VendingMachine.calculate(money,note);
		System.out.println("Total number of notes :"+total );
		
		
	}

}
