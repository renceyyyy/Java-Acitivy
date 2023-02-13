/*filename:Temp_Conversion.java
*Author:Laurence James S. Balon
*Date: Nov 10, 2022
*Language: Java
*Author:Laurence James S. Balon*/

package SampleBSIT.java;
import java.util.Scanner;

public class Temp_Conversion {

		public static void main(String[] args) {

		    double Fahrenheit;
	             	    Scanner input=new Scanner(System.in);	   	 
		    System.out.println("Enter Fahrenheit temperature: ");
	                   Fahrenheit=input.nextDouble(); 
		    System.out.println("Celsius temperature is = "+celsius(Fahrenheit));		  	  	     
		} 
		static double celsius(double f)
		{	
		return  (f-32)*5/9;
		}
	}

