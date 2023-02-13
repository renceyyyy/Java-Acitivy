package BSITsample;
import java.util.Scanner;

public class dowhileYesNo {
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first number: ");
		int f = sc.nextInt();
		System.out.println("Enter Second number: ");
		int s = sc.nextInt();
		boolean repeat = true;
		
		do {
			int sum = f + s;
			System.out.println("The sum:  "+ sum);
			System.out.println("Do you want to perform the sum again? (y/n) ");
			char choice = sc.next().charAt(0);
			
			if(choice == 'n') {
			repeat = false;
		}
		}while (repeat);
}
	}

