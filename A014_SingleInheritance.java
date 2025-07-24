// Write a program demonstrating single inheritance.
package JavaAssignment;

class Parent
{
	//data member
	String name="Harshani Patil";
	int age=21;
	
	
	//Function Member
	public void display()
	
	{
		System.out.println("Name:"+name+" "+"\nAge:"+age);
	}
	
}

class child extends Parent
{
	public void show()
	{
		System.out.println("Child Class Method is Calling....");
	}
	
}
public class A014_SingleInheritance
{

	public static void main(String[] args) 
	{
		child c1 = new child();
		c1.display();
		c1.show();
		
	}
}




