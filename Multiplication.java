package BSITsample;
import java.util.Scanner;
public class Multiplication {
	public static void main(String[]args) {
		Scanner sc = new Scanner (System.in);
		System.out.println("Input a postive integer: ");
		int n = sc.nextInt();
		
		int i = 1;
		int p = 0;
		do {
			p = n*i;
			System.out.println("Answer: "+p);
			i++;
		}
		while(i <= 10);
	}
}

		
		