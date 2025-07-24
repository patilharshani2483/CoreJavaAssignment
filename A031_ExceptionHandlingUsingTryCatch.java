//Write a program to demonstrate exception handling using try-catch-finally.

package JavaAssignment;

public class A031_ExceptionHandlingUsingTryCatch 
{
	
    public static void main(String[] args) 
    {
        int[] numbers = {1, 2, 3};

        try 
        {
            System.out.println("Accessing 5th element: " + numbers[4]);
        } 
        catch (ArrayIndexOutOfBoundsException e) 
        {
            System.out.println("Exception caught: " + e);
        } 
        finally 
        {
            System.out.println("Finally block executed - cleanup can be done here.");
        }

        System.out.println("Program continues after exception handling.");
    }
}

