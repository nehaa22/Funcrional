package example;
import java.util.Scanner;
public class DaysOfWeek 
{
    public static void main(String args[])
    {
    	Scanner s=new Scanner(System.in);
    	int d,m,y;
    	boolean bl = true;
    	
    	while(bl)
    	{
    		System.out.println("Enter Day");
    		d=s.nextInt();
    		
    		if(d>0 && d<=31)
    		{  
    			System.out.println("Day is between 1 to 31");
    		   
    		}
    		
    		System.out.println("Enter Month");
    		m=s.nextInt();
    		if(m>0 && m<=12)
    		{  
    			System.out.println("Month is between 1 to 31");
    		  
    		}
    		
    		System.out.println("Enter Year");
    		y=s.nextInt();
    		if(y>1000 && y<=10000)
    		{  
    			System.out.println("Year is between 1000 to 10000");
    		   
    		   
    		}
    		
    		
    		int y0 = y - (14 - m) / 12;
            int x = y0 + y0/4 - y0/100 +y0/400;
            int m0 = m + 12 * ((14 - m) / 12) - 2;
            int d0 = (d + x + 31 * m0 / 12) % 7;  
            
            boolean c = 0 <= d0  && d0<= 6;
        
            	int b=8;
            	
            	if (c) {
                   b = 0;
                  } else {
                    if (c) {
                     b = 1;
                    } else {
                      if (c) {
                    	   b= 2;
                    } else {
                      if (c) {
                    	 b = 3;
                      } else {
                        if (c) {
                         b = 4;
                        } else {
                          if (c) {
                        	   b = 5;
                          } else {
                            if (c) {
                            	 b = 6;
                            }                 
                           }
                          }
                       }
                     }
                     }
                  } 
            
            
			System.out.println("The day of the week is ");
			System.out.println(b);
    		
    		
    		
    	}
    }
}
