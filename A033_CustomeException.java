//Create a custom exception class and use it in your program.

package JavaAssignment;

//Custom Exception Class
class InvalidAgeException extends Exception 
{
 // Constructor
 public InvalidAgeException(String message) 
 {
     super(message);
 }
}

public class A033_CustomeException
{

  public static void validateAge(int age) throws InvalidAgeException 
 {
     if (age < 18)
     {
         throw new InvalidAgeException("Age is not valid for voting.");
     } else {
         System.out.println("You are eligible to vote.");
     }
 }

 public static void main(String[] args) 
 {
     try
     {
         validateAge(16); // change value to 20 to avoid exception
     } 
     catch (InvalidAgeException e)
     {
         System.out.println("Caught Exception: " + e.getMessage());
     }
     finally
     {
         System.out.println("Validation process completed.");
     }
 }
}
