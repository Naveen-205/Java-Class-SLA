package practice;

public class ThreadImplementation {

	public static void main(String[] args) {
		
		for(int i=1; i<=5; i++)
		{
			final int threadNumber = i;
			//thread created
			Thread t = new Thread(()->{
				System.out.println("Thread " + threadNumber + " is running");
			});
			
			t.start(); //thread start
			
			try
			{
				t.join(); //wait for current thread to finish
			}
			catch(InterruptedException e)
			{
				e.printStackTrace();
			}
			
			
		}

	}

}
