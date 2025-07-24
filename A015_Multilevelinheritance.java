//Create a class hierarchy and demonstrate multilevel inheritance.

package JavaAssignment;

class Animal
{
	
	public void eat()
	{
		System.out.println("Animal are Eating......");
	}
}



class Dog extends Animal
{
	
   public void bark() 
   {
	   System.out.println("Dogs Are Barkinggg....");
   }
}


class Puppy extends Dog
{
	 public void weep() 
	 {
		 System.out.println("Puppy are weeping.....");
	 }
}


public class A015_Multilevelinheritance
{

	public static void main(String[] args) 
	{
		
		Puppy p1 = new Puppy();
		p1.eat();
		p1.bark();
		p1.weep();
		
	}
}

