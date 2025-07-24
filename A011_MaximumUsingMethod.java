// Write a program to find the maximum of three numbers using a method.

package JavaAssignment;

public class A011_MaximumUsingMethod
{
	

	 public static int findMax(int a, int b, int c) 
	 {
	        int max = a;

	        if(b > a) 
	        {
	            max = b;
	        }
	        
	        if(c > a) 
	        {
	            max = c;
	        }

	        return max;
	    }

	    public static void main(String[] args) 
	    {
	        int num1 = 25;
	        int num2 = 452;
	        int num3 = 19;

	        int maximum = findMax(num1, num2, num3);

	        System.out.println("The maximum of the three numbers is: " + maximum);
	    }
	}

