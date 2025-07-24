//Demonstrate type casting (explicit and implicit).

package JavaAssignment;

public class A004_TypeCasting
{
	public static void main(String[] args) 
	{
		
		//Implicit Casting
				int a=20;
				double b=a;
				System.out.println("Implicit Casting:"+a);
				System.out.println("Implicit Casting Converted:"+b);

				
				//Explicit Casting 
				double d=20.98;
				int i=(int)d;
				System.out.println("\nExplicit Casting:"+d);
				System.out.println("Explicit Casting Converted:"+i);

		
		
	}

}
