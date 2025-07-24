//Create multiple constructors in a class and demonstrate constructor overloading
package JavaAssignment;

class MyInfo
{
    // Data Members
    String Fname;
    String Lname;
    int age;
    String CollegeName;

    // Default constructor
    MyInfo() 
    {
        Fname = "Unknown";
        Lname = "";
        CollegeName = "Not Provided";
        age = 21;
    }

    // Parameterized constructor
    MyInfo(String s, String s1, int i, String s2)
    {
        Fname = s;
        Lname = s1;
        CollegeName = s2;
        age = i;
    }

    
    public void show()
    {
        System.out.println("Name: " + Fname + " " + Lname);
        System.out.println("College: " + CollegeName);
        System.out.println("Age: " + age);
        System.out.println(); // spacing
    }
}
public class A009_ConstructorOverLoading 
{
	
		public static void main(String[] args)
	    {
	        MyInfo f1 = new MyInfo();  // default constructor
	        MyInfo f2 = new MyInfo("Harshani", "Patil", 21, "MSCET");  // parameterized constructor

	        f1.show();
	        f2.show();
	    }
		
	}



