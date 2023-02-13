package BSITsample.java;
import java.util.Scanner;

public class SortingNumbers {
	public static void main(String[]args) {
		Scanner input = new Scanner(System.in);
		int a,b,c;

		System.out.print("Enter The First Number: ");
		a = input.nextInt();
		System.out.print("Enter The Second Number: ");
		b = input.nextInt();
		System.out.print("Enter The Third Number: ");
		c = input.nextInt();
		System.out.println("|----------Sorting numbers-----------|");
		System.out.println();
		System.out.print("Highest: ");
		System.out.print("Highest: ");
		System.out.print("Highest: ");
		
		
		System.out.println();
		if(a >= b && a >= c && b >= c){
			System.out.println("   "+a+"             "+b+"            "+c);
			}
		else if(a >= b && a >= c && c >= b){
			System.out.println("   "+a+"             "+c+"             "+b);
			}
		else if(b >= a && b >= c && c >= a){
			System.out.println("   "+b+"             "+c+"             "+a);
			}
		else if(b >= a && b >= c && a >= c) {
		    System.out.println("   "+b+"             "+a+"             "+c);
		}
		else if(c >= a && c >= b && a >= b){
			System.out.println("   "+c+"             "+a+"             "+b);
			}
		else if(c >= a && c >= b && b >= a){
			System.out.println("   "+c+"             "+b+"             "+a);
			}
		}
	}
