package BSITsample;
import java.util.Scanner;

public class Fibonacci {
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of terms: ");
		int num = sc.nextInt();
		
		int f = 0, s = 1;
		for(int i = 1; i <= num; i++) {
			System.out.println(f + s);
			
			int n = f + s;
			f = s;
			s = n;
		}
	}

}
