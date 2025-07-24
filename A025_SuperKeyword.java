// Use the super keyword to call the parent class constructor and methods.
package JavaAssignment;


class Banana
{
	Banana()
	{
		System.out.println("Banana Constructor are Callingggg...");
	}
	
	
	public void taste()
	{
		System.out.println("Fruits are gernaral taste");
	}
}

class Papaya extends Banana
{
	Papaya()
	{
		super();
		System.out.println("Papaya Constructor are Calling..");
	}
	
	@Override 
	public void taste()
	{
		System.out.println("Papaya taste Sweets");
	}
}

public class A025_SuperKeyword
{
	

	public static void main(String[] args)
	{
		Papaya p1 = new Papaya();
		p1.taste();
		
	}
}
