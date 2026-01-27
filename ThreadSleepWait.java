package practice;

	
	class SleepExample extends Thread
	{
		public void run()
		{
			for(int i=1; i<=5; i++)
			{
				System.out.println("Thread is Running " + i);
				try {
					Thread.sleep(5000); //pause for 5 second
				}
				catch(InterruptedException e) {
					System.out.println("Thread Interruppted");
				}
			}
		}
	}
	
	public class ThreadSleepWait {

	public static void main(String[] args) {
		
		SleepExample t1 = new SleepExample();
		t1.start();
	}

}
