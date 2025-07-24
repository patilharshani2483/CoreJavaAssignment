// Create a calculator using arithmetic and relational operators.
package JavaAssignment;

import java.util.Scanner;

public class A003_Calculator 
{
	public static void main(String[] args) 
	{
		 Scanner sc = new Scanner(System.in);
	        
	        System.out.println("Enter a First Number:");
	        double num1=sc.nextDouble();
	        
	        System.out.println("Enter a Second Number:");
	        double num2=sc.nextDouble();
	        
	        System.out.println("[----------Arithmetic Operator---------]");
	        System.out.println("Addition of the num1 and num2 : "+(num1+num2));
	        System.out.println("Subtraction of num1 and num2 : "+(num1-num2));
	        System.out.println("Multiplication of num1 and num2 : "+(num1*num2));
	        System.out.println("Division of num1 and num2 : "+(num1/num2));
	        System.out.println("Modulo of num1 and num2 : "+(num1%num2));
	        System.out.println("");
	        
	        
	        System.out.println("[---------Relational Operator----------]");
	        System.out.println(num1 + " == " + num2 + ":"+(num1==num2));
	        System.out.println(num1 +  " > "  + num2 +":"+(num1>num2));
	        System.out.println(num1 +  " >= "  + num2 +":"+(num1>=num2));
	        System.out.println(num1 +  " < "  + num2 +":"+(num1<num2));
	        System.out.println(num1 +  " <= "  + num2 +":"+(num1<=num2));
	        System.out.println(num1 +  " != " + num2 +":"+(num1!=num2));
	        
		
		
	}

}
