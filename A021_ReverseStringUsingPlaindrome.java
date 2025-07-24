//Create a program to reverse a string and check for palindromes.
package JavaAssignment;

import java.util.Scanner;

public class A021_ReverseStringUsingPlaindrome 
{

	
	    public static void main(String[] args) 
	    {
	        Scanner sc = new Scanner(System.in);

	        System.out.println("Enter a String :");
	        String original = sc.nextLine();

	        String reversed = ""; 
	        for (int i = original.length() - 1; i >= 0; i--)
	        {
	            reversed += original.charAt(i);
	        }

	        System.out.println("Reversed String: " + reversed);

	        if (original.equalsIgnoreCase(reversed)) 
	        {
	            System.out.println("The String is Palindrome");
	        } 
	        else
	        {
	            System.out.println("The String is Not Palindrome");
	        }

	       
	    }
	}



