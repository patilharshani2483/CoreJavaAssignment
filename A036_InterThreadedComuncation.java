// Use inter-thread communication methods like wait(), notify(), and notifyAll().
package JavaAssignment;

class SharedResource
{
    private int data;
    private boolean available = false;

    public synchronized void produce(int value) 
    {
        while (available)
        {
            try 
            {
                wait(); 
            } 
            catch (InterruptedException e)
            {
                System.out.println("Producer interrupted");
            }
        }
        data = value;
        System.out.println("Produced: " + data);
        available = true;
        notify(); // notify consumer
    }

    // Consume method
    public synchronized void consume()
    {
        while (!available) 
        {
            try
            {
                wait(); // wait until data is produced
            } 
            
            catch (InterruptedException e)
            {
                System.out.println("Consumer interrupted");
            }
        }
        System.out.println("Consumed: " + data);
        available = false;
        notify(); // notify producer
    }
}

class Producer extends Thread
{
    SharedResource resource;

    Producer(SharedResource resource)
    {
        this.resource = resource;
    }

    public void run() 
    {
        for (int i = 1; i <= 5; i++)
        {
            resource.produce(i);
            try 
            {
                Thread.sleep(500);
            } 
            catch (InterruptedException e) {}
        }
    }
}

class Consumer extends Thread
{
    SharedResource resource;

    Consumer(SharedResource resource)
    {
        this.resource = resource;
    }

    public void run() {
        for (int i = 1; i <= 5; i++) {
            resource.consume();
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {}
        }
    }

    public static void main(String[] args) 
    {
        SharedResource resource = new SharedResource();

        Producer producer = new Producer(resource);
        Consumer consumer = new Consumer(resource);

        producer.start();
        consumer.start();
    }
}
