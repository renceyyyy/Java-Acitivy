package BSITsample.java;
import java.util.Scanner;
public class kiosk {
	public static void main(String[]args) {
		Scanner scanner = new Scanner(System.in);
        String[] options = {"Option 1", "Option 2", "Option 3", "Exit"};
        
        while (true) {
            System.out.println("Welcome to the Kiosk! Please select an option:");
            for (int i = 0; i < options.length; i++) {
                System.out.println((i + 1) + ". " + options[i]);
            }
            
            int choice = scanner.nextInt();
            if (choice == options.length) {
                break;
            }
            
            System.out.println("You selected: " + options[choice - 1]);
        }
        
        System.out.println("Thank you for using the Kiosk!");
    }
}
	}

}
