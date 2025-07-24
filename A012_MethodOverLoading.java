//Implement method overloading by creating methods for different data types.
package JavaAssignment;

class demo
{
	public void subtract(int a,int b)
	{
		int x=a+b;
		System.out.println("Subtraction of 2 int No:"+x);
	}
	
	public void subtract(int a,int b,int c)
	{
		int x=a+b+c;
		System.out.println("Subtraction of 3 int No :"+x);
		
	}
	
	public void subtract(double a,int b)
	{
		double x=a+b;
		System.out.println("Subtraction of double & int:"+x);
	}
	
	
}

public class A012_MethodOverLoading
{

	public static void main(String[] args) 
	{
		
		demo d1 = new demo();
		d1.subtract(23, 430);
		d1.subtract(12, 230, 450);
		d1.subtract(12.9, 12);
		
	}

}




