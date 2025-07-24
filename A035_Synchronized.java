// Implement thread synchronization using synchronized blocks or methods.
package JavaAssignment;

class Table
{
    //multiplication table
    synchronized void printTable(int n) 
    {
        for (int i = 1; i <= 5; i++) 
        {
            System.out.println(n + " x " + i + " = " + (n * i));
            try 
            {
                Thread.sleep(400);
            } 
            catch (InterruptedException e) 
            {
                System.out.println("Thread interrupted");
            }
        }
    }
}

class MyThread1 extends Thread
{
    Table t;

    MyThread1(Table t)
    {
        this.t = t;
    }

    public void run()
    {
        t.printTable(5); // thread 1 prints table of 5
    }
}

class MyThread2 extends Thread 
{
    Table t;

    MyThread2(Table t)
    {
        this.t = t;
    }

    public void run()
    {
        t.printTable(100); // thread 2 prints table of 100
    }
}

public class A035_Synchronized
{
    public static void main(String[] args)
    {
        Table obj = new Table(); 

        MyThread1 t1 = new MyThread1(obj);
        MyThread2 t2 = new MyThread2(obj);

        t1.start();
        t2.start();
    }
}
