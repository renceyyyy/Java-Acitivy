package SampleBSIT.java;
import java.util.Scanner;

public class Information {
	public static void main(String[]args) {
		Scanner input = new Scanner (System.in);
		
		System.out.println("Enter Student name: ");
		String name=input.nextLine();
		System.out.println("Enter Student course: ");
		String course=input.nextLine();
		System.out.println("Enter Student Section: ");
		String section =input.nextLine();
		System.out.println("Enter Student Year: ");
		String year =input.nextLine();
		System.out.println("Enter Subject: ");
		String Subject =input.nextLine();
		System.out.println("Enter Professor: ");
		String professor = input.nextLine();
		
		System.out.println("-----------------------------");
		System.out.println("Student name: "+name);
		System.out.println("Student course: "+course);
		System.out.println("Student Section: "+section);
		System.out.println("Student Year: "+year);		
		System.out.println("Subject: "+Subject);
		System.out.println("Professor: "+professor);
	}
}
