package example;
import java.lang.*;

public class FlipCoin 
{
	public static void main(String args[])
	{
		int cnt=1;
		double res,hp,tp,r;
		int h=0;
		
		while(cnt<=10)
		{
			r= Math.random();
			res = (r%(1.0-0.0 + 1.0))+0.0;
			if(res< 0.5)
			{
				System.out.println("Result is head");
				h++;
			}
			else
			{
				System.out.println("Result is Tail");
			}
			cnt = cnt+1;
		}
		
		hp=(double)(h/10)*100;
		tp=(double)((10-h)/10)*100;
		System.out.println("Percentage of head : "+hp);
		System.out.println("Percentage of tail : "+tp);
	}

}
