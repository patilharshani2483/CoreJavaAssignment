// Write a program to display the Fibonacci series using a loop.
package JavaAssignment;

import java.util.Scanner;

public class A007_FibonacciSeries 
{
	public static void main(String[] args) 
	{
		
		
     Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a Number:");
		int n=sc.nextInt();
		
		int first = 0, second =1,next;
		
		System.out.println("Fibonacci Seriesss....");
		
		for(int i =0 ; i<n;i++)
		{
			if(i<=1)
			{
				next=i;
			}
			
			else
			{
				next=first+second;
				first=second;
				second=next;
			}
			
			System.out.println(next+" ");
		}
	}

}
