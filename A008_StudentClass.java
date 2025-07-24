//Create a class Student with attributes (name, age) and a method to display the details
package JavaAssignment;

class Student
{
	//data member
	int id=1;
	String name="Harshani Patil";
	String Address="Surat";
	int age=21;
	
	//Function member
	public void show()
	{
		System.out.println("id = " + id);
		System.out.println("name = " + name);
		System.out.println("address = " + Address);
		System.out.println("age = " + age);		
	}
}
public class A008_StudentClass 
{
	public static void main(String[] args)
	{
		Student s1 = new Student();
		s1.show();
		
//		Student s2= new Student();
//		s2.age=22;
//		s2.id=2;
//		s2.name="Jenu";
//		s2.Address="Surat";
//		s2.show();
		
		
	}

}
