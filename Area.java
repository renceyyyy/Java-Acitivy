package SampleBSIT.java;

import java.util.Scanner;

public class Area {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
	
		double r,a,pi=1416;

		System.out.println("Enter Raduis: ");
		r = input.nextDouble();
		
		a= pi*r*r;
		System.out.println("Area of the Circle: "+a);
}
}

