package BSITsample;
import java.util.Scanner;

public class askuser {
public static void main(String[]args) {
	Scanner input = new Scanner(System.in);

	while (true) {
	    System.out.println("Do you want to order another item? (yes/no)");
	    String answer = input.nextLine();
	    if (answer.equalsIgnoreCase("no")) {
	        break;
	    } else if (answer.equalsIgnoreCase("yes")) {
	    	
	        // code to process the order
	    } else {
	        System.out.println("Invalid input. Please enter 'yes' or 'no'.");
	    }
	}
}
}

