package SampleBSIT.java;
import java.util.Scanner;

public class findLargeNumber {
	public static void main(String[]args) {
		Scanner input = new Scanner(System.in);
		int x, y, z;
		
		System.out.print("Enter the First number: " );
		x = input.nextInt();
		
		System.out.print("Enter the Second number: ");
		y = input.nextInt();
		
		System.out.print("Enter the Third number: ");
		z = input.nextInt();
		
		if (x > y && x > z)
		{
			System.out.println("The largest number is: "+x);
		}
		else if(y > z)
		{
			System.out.println("The largest number is: "+y);
		}
		else
		{
			System.out.println("-------------------------------");
			System.out.println("The largest number is: "+z);
		}
		
		
	}

}
