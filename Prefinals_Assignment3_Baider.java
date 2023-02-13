package SampleBSIT.java;
import java.util.Scanner;

public class Prefinals_Assignment3_Baider {
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
	      
	      System.out.println("Enter the number of students in the class");
	      int numStudents = sc.nextInt();
	      
	      System.out.println("Enter the number of male students");
	      int numMale = sc.nextInt();
	      
	      System.out.println("Enter the number of female students");
	      int numFemale = sc.nextInt();
	      
	      System.out.println("Number of students in the class: " + numStudents);
	      System.out.println("Number of male students: " + numMale);
	      System.out.println("Number of female students: " + numFemale);
	      
	      int difference = numMale - numFemale;
	      
	      if (difference > 0) {
	         System.out.println("The number of male students is greater than the number of female students");
	      } else if (difference < 0) {
	         System.out.println("The number of female students is greater than the number of male students");
	      } else {
	         System.out.println("The number of male students is equal to the number of female students");
	      }
	      
	      double malePercentage = (double) numMale / numStudents * 100;
	      double femalePercentage = (double) numFemale / numStudents * 100;
	      
	      System.out.println("Percentage of male students: " + malePercentage + "%");
	      System.out.println("Percentage of female students: " + femalePercentage + "%");
	      
	      // switch statement 
	      switch (difference) {
	         case 0:
	            System.out.println("The number of male students is equal to the number of female students");
	            break;
	         case 1:
	         case 2:
	         case 3:
	         case 4:
	            System.out.println("The number of male students is slightly greater than the number of female students");
	            break;
	         default:
	            System.out.println("The number of male students is greater than the number of female students");
	            break;
	      }
	   }
	}

	}

}
