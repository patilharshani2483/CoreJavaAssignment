// Write a program to create and run multiple threads using the Thread class.
package JavaAssignment;

	class MyThread extends Thread 
	{
	    private String threadName;

	    // Constructor to name the thread
	    MyThread(String name) 
	    {
	        this.threadName = name;
	    }

	    // Override the run method to define what the thread will do
	    public void run() 
	    {
	        for (int i = 1; i <= 5; i++) 
	        {
	            System.out.println(threadName + " is running: Count " + i);
	            try 
	            {
	                Thread.sleep(500); 
	            }
	            catch (InterruptedException e) 
	            {
	                System.out.println(threadName + " was interrupted.");
	            }
	        }
	        System.out.println(threadName + " has finished execution.");
	    }
	}

	public class A034_Thread
	{
	    public static void main(String[] args) 
	    {
	        // multiple threads
	        MyThread t1 = new MyThread("Thread-1");
	        MyThread t2 = new MyThread("Thread-2");
	        MyThread t3 = new MyThread("Thread-3");

	        // Start the threads
	        t1.start();
	        t2.start();
	        t3.start();
	    }
	}

