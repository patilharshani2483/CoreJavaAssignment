// Write a program that demonstrates inheritance using extends keyword.
package JavaAssignment;

class Fruitss
{
	public void taste()
	{
		System.out.println("Fruits are generally sweet in taste");
	}
	
}

class Mango extends Fruitss
{
	public void color()
	{
		System.out.println("Mango is Yellow in Color ");
	}
}

public class A023_InheritanceUsingExtendLey 
{
	
   public static void main(String[] args)
	
	{
		
		Mango m1 = new Mango();
		m1.taste();
		m1.color();
		
	}


}
