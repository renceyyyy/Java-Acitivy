package BSITsample.java;
import java.util.Scanner;

public class Case_Study_Balon {
	public static void main(String[]args) {
		Scanner input = new Scanner(System.in);
		double mbp, otp, gp, wh, income,Absences,tml,tl,td,contributions,np;
		
		System.out.println("_________________________________________");
		System.out.println("|Department                 Rate per day|");
		System.out.println("|IT                         1000        |");
		System.out.println("|Accounting                 800         |");
		System.out.println("|Engineering                1500        |");
		System.out.println("|Security                   568.75      |");
		System.out.println("|General Services           500.25      |");
		System.out.println("|_______________________________________|");
		System.out.print("Please Enter your name: ");
		String name = input.nextLine();
		
		System.out.print("Please Enter you department: ");
		String department = input.nextLine();
		
		System.out.print("Enter your position: ");
		String position = input.nextLine();
		
		System.out.print("Enter Date hired: ");
		String hired = input.nextLine();
		
		System.out.print("Enter Rate per day: ");
		double rate = input.nextDouble();
		
		System.out.print("Enter no of days working: ");
		double days = input.nextDouble();
		
		System.out.print("Please Enter your incentives or overtime pay: ");
		otp = input.nextDouble();
		
		System.out.print("Enter your working hours(8hours): ");
		wh = input.nextDouble();
		
		System.out.print("Enter you total minutes late: ");
		tml = input.nextDouble();
		
		System.out.print("Enter Contributions (SSS, Pagibig, Philhealth): ");
		contributions = input.nextDouble();
		
		System.out.println("");
		System.out.println("----------Salary breakdown--------------------");
		System.out.println("");
		// Computation of Employee's salary
		System.out.println("Employee's name: "+name);
		mbp = rate * days; // Compute to get the monthly basic pay.
		System.out.print("Monthly basic pay: "+mbp);
		System.out.println("");
		gp = mbp + otp;  // Compute to get the Gross pay.
		System.out.print("Gross pay: "+gp);
		System.out.println("");
		otp = rate/wh;   // Compute to get the Overtime pay.
		System.out.println("Overtime pay = "+otp);
		income = gp * .10;   //Computation to get Income tax.
		System.out.println("Income tax: "+income);
		Absences = days * rate;   //Computation to get Absences.
		System.out.println("Absences: "+Absences);
		tl = tml * rate / 480;    //Computation to get the Tardiness/Late.
		System.out.println("Tardiness/Late: "+tl);
		td = income + tl + contributions;    //Computation to get your Deductions.
		System.out.println("Total Deduction: "+td);
		System.out.println("");
		np = gp - td;   //Computation to get you Net pay.
		System.out.println("Your Net pay: "+np);	
		}
		
	}

