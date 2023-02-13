package BSITsample.java; 

import java.util.Scanner; 

public class sample { 

public static void main(String[]arg) { 

	Scanner input = new Scanner(System.in); 

	String name, section, number,year; 

	double a,b,c,d,e,ave; 

	System.out.print("Student name: "); 

	name = input.nextLine(); 

	System.out.print("Section and course: "); 

	section = input.nextLine(); 

	System.out.print("Student Number: "); 

	number = input.nextLine(); 

	System.out.print("Student Year: "); 

	year = input.nextLine(); 

	System.out.print("-------------------------------------------------------"); 

	System.out.println(); 

	System.out.print("Enter Your Grade in Prelim: "); 

	a = input.nextDouble(); 

	System.out.print("Enter Your Grade in Midterm: "); 

	b = input.nextDouble(); 

	System.out.print("Enter Your Grade in Pre-final: "); 

	c = input.nextDouble(); 

	System.out.print("Enter Your Grade in final: "); 

	d = input.nextDouble(); 

	 

	//formula for the grade 

	e = a+b+c+d; 

	ave= e/4; 

	System.out.print("Your average grade is: "+ave); 

	System.out.println(); 

	System.out.print("-------------------------------------------------------------"); 

	System.out.println(); 

	 

	System.out.println("Average         Equivalent Grade             Remarks"); 

	System.out.println("100-97             1.0                        Excellent"); 

	System.out.println("96-94              1.25                       Excellent"); 

	System.out.println("93-91              1.5                        Very Good"); 

	System.out.println("90-88              1.75                       Very Good"); 

	System.out.println("87-85              2.0                        Good"); 

	System.out.println("84-82              2.25                       Satisfactory"); 

	System.out.println("76-78              2.75                        Fair"); 

	System.out.println("75                 3.0                         Passed"); 

	System.out.println("below 75           5.0                         Fail"); 

	System.out.print("---------------------------------------------------------------------"); 

	System.out.println(); 

	if(ave <= 100 && ave >= 97) {

	System.out.print("Equivalent = 1.0    Remarks= Excellent"); 
	}
	if(ave <= 96 && ave >= 94) { 

	System.out.print("Equivalent = 1.25    Remarks= Excellent"); 

	} 

	if(ave <= 93 && ave >= 91) { 

	System.out.print("Equivalent = 1.5    Remarks= Very Good"); 

	} 

	if(ave <= 90 && ave >= 88) { 

	System.out.print("Equivalent = 1.75    Remarks= Very Good"); 

	} 

	if(ave <= 87 && ave >= 85) { 

	System.out.print("Equivalent = 2.0    Remarks= Good"); 

	} 

	if(ave <= 84 && ave >= 82) { 

	System.out.print("Equivalent = 2.25    Remarks= Satisfactory"); 

	} 

	if(ave <= 76 && ave >=78) { 

	System.out.print("Equivalent = 2.75    Remarks= Fair"); 

	} 

	if(ave == 75) { 

	System.out.print("Equivalent = 3.0    Remarks= Passed"); 

	} 

	if(ave<75) { 

	System.out.print("Equivalent = 5.0    Remarks= Fail"); 

	} 

	else if (ave>100) { 

	System.out.println("Invalid"); 

	} 

	 

	} 

	} 