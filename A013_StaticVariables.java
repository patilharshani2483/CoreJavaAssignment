// Create a class with static variables and methods to demonstrate their use.

package JavaAssignment;

class  MyStudent
{
	
	static String college="BMU";
	
	int id;
	String Studentname;
	
	MyStudent(int i,String s)
	{
		id=i;
		Studentname=s;
	}
	
	public void display()
	{
		System.out.println(id+" "+Studentname+" "+college);
	}
	
}

public class A013_StaticVariables
{

	public static void main(String[] args)
	{
		MyStudent s1 = new MyStudent(1,"Harshani Patil");
		MyStudent s2 = new MyStudent(2,"Jenu Patil");

		s1.display();
		s2.display();
		
		
	}


}
