package practice;

public class RunnableThreadSample implements Runnable {
	
	public void run()
	{
		System.out.println("Thread is Running");
	}

	public static void main(String[] args) {
		
		RunnableThreadSample mt = new RunnableThreadSample(); //class object
		Thread t = new Thread(mt); //thread object
		t.start();
		
	}
}
