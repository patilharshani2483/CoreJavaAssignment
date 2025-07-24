// Demonstrate constructor overloading by passing different types of parameters.
package JavaAssignment;

//Class 
class BookInfo 
{
 String title;
 String author;
 int pages;
 double price;

 // Default constructor
 BookInfo() 
 {
     title = "Unknown";
     author = "Unknown";
     pages = 0;
     price = 0.0;
 }
 

 // Constructor with title and author
 BookInfo(String title, String author) 
 {
     this.title = title;
     this.author = author;
     this.pages = 100;
     this.price = 200.0;
 }
 

 // Constructor with title, pages, and price
 BookInfo(String title, int pages, double price)
 {
     this.title = title;
     this.pages = pages;
     this.price = price;
     this.author = "Anonymous";
 }
 

 // Constructor with all details
 BookInfo(String title, String author, int pages, double price) 
 {
     this.title = title;
     this.author = author;
     this.pages = pages;
     this.price = price;
 }

 
 public void display() 
 {
     System.out.println("Title : " + title);
     System.out.println("Author: " + author);
     System.out.println("Pages : " + pages);
     System.out.println("Price : ₹" + price);
     System.out.println(); 
 }
}


public class A019_ConstructorOverloadingbyPassingdiffPara
{
 public static void main(String[] args)
 {
     BookInfo b1 = new BookInfo();  // default constructor
     BookInfo b2 = new BookInfo("Java Basics", "Harshani");  // string, string
     BookInfo b3 = new BookInfo("Python Guide", 300, 499.99);  // string, int, double
     BookInfo b4 = new BookInfo("C++ Handbook", "Patil", 450, 599.00);  // all details

     b1.display();
     b2.display();
     b3.display();
     b4.display();
 }
}


