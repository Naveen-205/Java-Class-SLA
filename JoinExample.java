package practice;

public class JoinExample implements Runnable {
	
	public void run()
	{
		Thread t = Thread.currentThread();
		System.out.println("Current Thread " + t.getName());
		
		//Checks if current thread is alive
		System.out.println("Is alive? " + t.isAlive());
	}

	public static void main(String[] args) throws Exception {
		
		Thread t = new Thread (new JoinExample()); //another way
		t.start();
		//waits for 5000 milli seconds this tread to die
		t.join(5000);
		System.out.println("\n Joining after 5000 " + "Milliseconds\n ");
		System.out.println("Current thread " + t.getName());
		//checks if this thread is alive
		System.out.println("Is alive " + t.isAlive());

	}

}
