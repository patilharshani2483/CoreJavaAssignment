//Implement method overriding to show polymorphism in action.

package JavaAssignment;

// Base Class
class ParentAnimal 
{
    public void sound() 
    {
        System.out.println("Animal makes a sound");
    }
}

// Derived Class
class DogAnimal extends ParentAnimal
{
    @Override
    public void sound()
    {
        System.out.println("Dog barks");
    }
}

// Another Derived Class
class CatAnimal extends ParentAnimal
{
    @Override
    public void sound() 
    {
        System.out.println("Cat meows");
    }
}


public class A016_OverridingtoshowPolymorphism 
{
 
    public static void main(String[] args)
    {
        ParentAnimal a;

        a = new DogAnimal();   
        a.sound();             

        a = new CatAnimal();   
        a.sound();             

        a = new ParentAnimal();  
        a.sound();               
    }
}
