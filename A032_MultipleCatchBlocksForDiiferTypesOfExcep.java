// Implement multiple catch blocks for different types of exceptions.

package JavaAssignment;

public class A032_MultipleCatchBlocksForDiiferTypesOfExcep 
{

   public static void main(String[] args) 
    {
        try 
        {
            int a = 10, b = 0;
            int result = a / b;  // ArithmeticException

            int[] arr = new int[5];
            arr[10] = 50;         // ArrayIndexOutOfBoundsException (will not be reached)
        } 
        catch (ArithmeticException e) 
        {
            System.out.println("Caught ArithmeticException: " + e.getMessage());
        } 
        catch (ArrayIndexOutOfBoundsException e) 
        {
            System.out.println("Caught ArrayIndexOutOfBoundsException: " + e.getMessage());
        } 
        catch (Exception e) 
        {
            System.out.println("Caught General Exception: " + e.getMessage());
        } 
        finally 
        {
            System.out.println("Finally block always executes.");
        }
    }
}
