// Write a program to create and initialize an object using a parameterized constructor.
package JavaAssignment;

class UserInfo 
{
    // Data Members
    String Fname;
    String Lname;
    int age;
    String CollegeName;

    // Default constructor
    UserInfo() 
    {
        Fname = "Unknown";
        Lname = "";
        CollegeName = "Not Provided";
        age = 21;
    }

    // Parameterized constructor
    UserInfo(String s, String s1, int i, String s2) 
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
        System.out.println(); 
    }
}

public class A018_ConstructorOverLoading 
{
    public static void main(String[] args) 
    {
        UserInfo f1 = new UserInfo();  // default constructor
        UserInfo f2 = new UserInfo("Harshani", "Patil", 21, "MSCET");  // parameterized constructor

        f1.show();
        f2.show();
    }
}
