package practice;

public class ThreadNewSample extends Thread {
	public void run()
	{
		System.out.println("Thread is Running");
	}

	public static void main(String[] args) {
		
		ThreadNewSample mt = new ThreadNewSample();
		mt.start();
	}

}
