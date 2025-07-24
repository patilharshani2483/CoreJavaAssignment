// Implement string comparison using equals() and compareTo() methods.
package JavaAssignment;

public class A022_StringComapreUsingEqualsCompareTo 
{
	 public static void main(String[] args)
	    {
	        String str1 = "Harshani";
	        String str2 = "Harshani";
	        String str3 = "Patil";
	        String str4 = "harshani";

	        // Using equals() 
	        System.out.println("Using equals():");
	        System.out.println("str1.equals(str2): " + str1.equals(str2)); // true
	        System.out.println("str1.equals(str3): " + str1.equals(str3)); // false
	        System.out.println("str1.equals(str4): " + str1.equals(str4)); // false

	        // Using compareTo() 
	        System.out.println("\nUsing compareTo():");
	        System.out.println("str1.compareTo(str2): " + str1.compareTo(str2)); // 0
	        System.out.println("str1.compareTo(str3): " + str1.compareTo(str3)); // < 0
	        System.out.println("str3.compareTo(str1): " + str3.compareTo(str1)); // > 0
	        System.out.println("str1.compareTo(str4): " + str1.compareTo(str4)); // negative (case-sensitive)
	    }
	}



