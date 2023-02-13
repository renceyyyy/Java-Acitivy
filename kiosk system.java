package BSITsample;
import java.util.Scanner;
public class kiosk {
	public static void main(String[]args) {
		Scanner input = new Scanner(System.in);
            System.out.println("---------------------------------------");
            System.out.println("-------------Table of Foods------------");
            System.out.println("Press          Product            Price");
            System.out.println(" [a]        Fried Chicken         50.00");
            System.out.println(" [b]         Hamburger            35.00");          //Table of Foods
            System.out.println(" [c]        Burger Steak          45.00");
            System.out.println(" [d]        French Fries          35.00");
            System.out.println(" [e]         Ice Cream            20.00");
            System.out.println("---------------------------------------");
            System.out.println("");
            double a, b, c, d, e, ch, am, q, t;
            System.out.print("Choose a food: ");
            char or = input.next().charAt(0);
            System.out.print("How many order do you want?: ");     //the user inputs
            q = input.nextDouble();
            System.out.print("Enter Payment: ");              //the user will enter their payment.
            am = input.nextDouble();
            a = 50;
            b = 35;
            c = 45;
            d = 35;
            e = 20;
            switch (or) {                 
                case 'a':
                    ch = am - a*q;       //Computation of change 
                    t = q*a;                    //Computation of Total                   
                    if(ch>=0){
                        System.out.println("");
                        System.out.println("----------------Receipt----------------");
                        System.out.println("Fried Chicken"+"                     "+a);
                        System.out.println("Quantity"+"                          "+q);          //the receipt of the user of their order
                        System.out.println("Amount"+"                            "+am);
                        System.out.println("Total"+"                             "+t);
                        System.out.println("Changes"+"                           "+ch);
                    }
                    else if(ch<0){ 
                        System.out.println("Invalid Input");
                }
                    break;
                case 'b':
                    ch = am - b*q;
                    t = q*b;
                    if(ch>=0){
                        System.out.println("");
                        System.out.println("----------------Receipt----------------");
                        System.out.println("Hamburger"+"                         "+b);
                        System.out.println("Quantity"+"                          "+q);      
                        System.out.println("Amount"+"                            "+am);
                        System.out.println("Total"+"                             "+t);
                        System.out.println("Changes"+"                           "+ch);
                    }
                    else if(ch<0){
                        System.out.println("Invalid Input");
                }
                    break;
                case 'c':
                    ch = am - c*q;
                    t = q*c;
                    if(ch>=0){
                        System.out.println("");
                        System.out.println("----------------Receipt----------------");
                        System.out.println("Burger Steak"+"                      "+c);
                        System.out.println("Quantity"+"                          "+q);
                        System.out.println("Amount"+"                            "+am);
                        System.out.println("Total"+"                             "+t);
                        System.out.println("Changes"+"                           "+ch);
                    }
                    else if(ch<0){
                        System.out.println("Invalid Input");
                }
                    break;
                case 'd':
                    ch = am - d*q;
                    t = q*d;
                    if(ch>=0){
                        System.out.println("");
                        System.out.println("----------------Receipt----------------");
                        System.out.println("French Fries"+"                      "+d);
                        System.out.println("Quantity"+"                          "+q);
                        System.out.println("Amount"+"                            "+am);
                        System.out.println("Total"+"                             "+t);
                        System.out.println("Changes"+"                           "+ch);
                    }
                    else if(ch<0){
                        System.out.println("Invalid Input");
                }
                    break;
                case 'e':
                    ch = am - e*q;
                    t = q*e;
                    if(ch>=0){
                        System.out.println("");
                        System.out.println("----------------Receipt----------------");
                        System.out.println("Ice Cream"+"                         "+e);
                        System.out.println("Quantity"+"                          "+q);
                        System.out.println("Amount"+"                            "+am);
                        System.out.println("Total"+"                             "+t);
                        System.out.println("Changes"+"                           "+ch);
                    }
                    else if(ch<0){
                        System.out.println("Invalid Input");
                }
                    break;
                default:
                        System.out.print("Invalid Input");


            }


        }

    }