//Implement a simple menu-driven program using a switch-case.
package JavaAssignment;

import java.util.Scanner;

public class A006_MenuDrivenSwitchCase 
{
	public static void main(String[] args)
	{
		
		
		Scanner sc = new Scanner(System.in);
		char choice;

        do 
        {
            System.out.println("\n[------- MENU -------]");
            System.out.println("1. Addition");
            System.out.println("2. Subtraction");
            System.out.println("3. Multiplication");
            System.out.println("4. Division");
            System.out.println("5. Exit");
            System.out.print("Enter your choice : ");
            int option = sc.nextInt();

            switch (option)
            {
                case 1:
                    System.out.print("Enter two numbers: ");
                    int a1 = sc.nextInt();
                    int b1 = sc.nextInt();
                    System.out.println("Result = " + (a1 + b1));
                    break;

                case 2:
                    System.out.print("Enter two numbers: ");
                    int a2 = sc.nextInt();
                    int b2 = sc.nextInt();
                    System.out.println("Result = " + (a2 - b2));
                    break;

                case 3:
                    System.out.print("Enter two numbers: ");
                    int a3 = sc.nextInt();
                    int b3 = sc.nextInt();
                    System.out.println("Result = " + (a3 * b3));
                    break;

                case 4:
                    System.out.print("Enter two numbers: ");
                    int a4 = sc.nextInt();
                    int b4 = sc.nextInt();
                    if (b4 != 0)
                    {
                        System.out.println("Result = " + (a4 / b4));
                    }
                    else
                    {
                        System.out.println("Error: Cannot divide by zero.");
                    }
                    break;

                case 5:
                    System.out.println("Exiting program...");
                    return;

                default:
                    System.out.println("Invalid choice! Please enter 1–5.");
            }

            System.out.print("\nDo you want to continue? (y/n): ");
            choice = sc.next().charAt(0);

        } 
        while (choice == 'y' || choice == 'Y');

        sc.close();
        System.out.println("Exit.");
    }

		
	}


