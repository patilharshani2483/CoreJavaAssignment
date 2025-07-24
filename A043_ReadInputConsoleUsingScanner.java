// Write a program to read input from the console using Scanner.
package JavaAssignment;

import java.util.Scanner;

public class A043_ReadInputConsoleUsingScanner 
{
    public static void main(String[] args) 
    {
        // Create Scanner object to read from console
        Scanner sc = new Scanner(System.in);

        // Read a string
        System.out.print("Enter your name: ");
        String name = sc.nextLine();

        // Read an integer
        System.out.print("Enter your age: ");
        int age = sc.nextInt();

        // Read a double
        System.out.print("Enter your percentage: ");
        double percentage = sc.nextDouble();

        
        System.out.println("\n[--- User Info ---]");
        System.out.println("Name       : " + name);
        System.out.println("Age        : " + age);
        System.out.println("Percentage : " + percentage);

    }
}
