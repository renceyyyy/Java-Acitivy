package BSITsample;
import java.util.Scanner;

public class ReversedNumbers {
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Input a number: ");
		int n = sc.nextInt();
		
		for(int r = 0; n !=0;) {
			r = r * 0;
			r = r + n%10;
			n = n/10;
			System.out.println("Reversed number: "+r);
		}
		}
}