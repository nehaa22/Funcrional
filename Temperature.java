package example;
import java.util.Scanner;

public class Temperature 
{
	
	public static void temperatureConversion()
	{
		double cels, farh;

        Scanner s = new Scanner(System.in);

        System.out.print("Enter temperature in Fahrenheit:");

        farh = s.nextDouble();

        cels = (farh-32)*(0.5556);

        System.out.println("Temperature in Celsius:"+cels);
        
        
        System.out.print("Enter temperature in Celcious:");

        cels = s.nextDouble();

        farh = (cels-0.5556)*32;

        System.out.println("Temperature in Celsius:"+farh);
	}
	
	
	public static void main(String[] args) 
     {
		    System.out.println("Welcome to Temperature Conversion :");
		    
		    temperatureConversion();
      }
}


