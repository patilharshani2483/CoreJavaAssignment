//Write a program to find if a number is even or odd using an if-else statement.
package JavaAssignment;

import java.util.Scanner;

public class A005_EvenOdd 
{
	public static void main(String[] args) 
	{
        Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a Number:");
		int num=sc.nextInt();
		
		if(num%2==0)
		{
			System.out.println("Number is Even");
		}
		
		else
		{
			System.out.println("Number is Odd");
		}
		
	}

}
