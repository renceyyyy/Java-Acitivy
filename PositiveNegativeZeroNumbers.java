package BSITsample;
import java.util.Scanner;

public class PositiveNegativeZeroNumbers {
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		
	int num, p = 0, n = 0, z = 0, i;
	char choice;
	do {
		System.out.println("Input the number: ");
		num = sc.nextInt();
		if(num > 0) {
			p++;
	}else if(num < 0) {
		n++;
	}else {
		z++;
	}
	System.out.println("Do you want to order another? (y/n)");
	choice = sc.next().charAt(0);
	
	}while(choice=='y' || choice=='Y');
	
	System.out.println("Positive: "+p);
	System.out.println("Negative: "+n);
	System.out.println("Zero: "+z);	
	}
	}

