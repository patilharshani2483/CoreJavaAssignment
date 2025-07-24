//Implement runtime polymorphism by overriding methods in the child class.

package JavaAssignment;

//Parent class
class Vehicle
{
    public void run()
    {
        System.out.println("Vehicle is running");
    }
}

// Derived class (Child 1)
class Bike extends Vehicle
{
    @Override
    public void run() {
        System.out.println("Bike is running safely");
    }
}

// Derived class (Child 2)
class Car extends Vehicle
{
    @Override
    public void run()
    {
        System.out.println("Car is running smoothly");
    }
}

public class A024_RuntimePolyByOverriding
{
    public static void main(String[] args)
    {
        Vehicle v; 

        v = new Bike();  
        v.run();         

        v = new Car();   
        v.run();
    }
}
