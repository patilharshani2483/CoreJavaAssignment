// Write a program to create and initialize an object using a parameterized constructor.
package JavaAssignment;

// Class 
class CollegeStudent
{
    String name;
    int age;

    // Parameterized constructor
    CollegeStudent(String studentName, int studentAge) 
    {
        name = studentName;
        age = studentAge;
    }

    // Method to display data
    public void display()
    {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}

public class A017_ParameterizedConstructor
{
    public static void main(String[] args) 
    {
        CollegeStudent s1 = new CollegeStudent("Harshani", 21);
        s1.display();
    }
}
