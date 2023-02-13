package BSITsample.java;
import java.util.Scanner;

public class Prefinals_Assignment3_Balon {
	public static void main(String[]args) {
		Scanner input = new Scanner(System.in);
		double male_percentage, female_percentage,ns;
        int male, female;
     
        System.out.print("Enter Section: ");
        String S = input.nextLine();
        System.out.print("Number of Male Students:  ");
        male = input.nextInt();
        System.out.print("Number of Female Students:  ");
        female = input.nextInt();
        System.out.println("----------results----------");
        System.out.println("section: "+S);
        ns = male+female;
        System.out.println("Number of students = "+ns);
        male_percentage = 100 * male / ns;
        female_percentage = 100 * female / ns;
        System.out.println("Male: "+male_percentage+"%");  
        System.out.println("Female: "+female_percentage+"%"); 
        	
        
        if (male >= female) {
        	switch (male) {
        	case 1:
        		System.out.println("The male is greater than female");
        	break;
        	}
        if (female >= male) {
        	switch(female) {
        	case 2:
        		System.out.println("The female is greater than the male.");
       break;
        }
        	}
        }
	}
}

