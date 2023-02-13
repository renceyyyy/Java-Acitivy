package BSIT11M1;
import java.util.Scanner;

public class Power {
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Input a number: ");
		int n = sc.nextInt();
		System.out.println("Input another number: ");
		int a = sc.nextInt();
		
		int result = 1;
		for( int i  = 0; i < a; i ++) {
			result *= n;
		}
		System.out.println("Result: "+result);		
		}
	}