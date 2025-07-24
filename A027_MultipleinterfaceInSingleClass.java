// Write a program that implements multiple interfaces in a single class.

package JavaAssignment;

//First interface
interface Printable 
{
 void print();
}

//Second interface
interface Showable
{
 void show();
}

//Class implementing both interfaces
class Document implements Printable, Showable 
{
 public void print() 
 {
     System.out.println("Printing document...");
 }

 public void show() 
 {
     System.out.println("Showing document...");
 }
}

public class A027_MultipleinterfaceInSingleClass
{
 public static void main(String[] args) 
 {
     Document d = new Document();
     d.print();
     d.show();
 }
}

