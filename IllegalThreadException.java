package practice;

public class IllegalThreadException {

	public static void main(String[] args) {

		Thread thread = new Thread(()-> {
			System.out.println("Thread Running");
		});
		thread.start(); // First start
		try {
			thread.start(); //Illegal Start
			//thread.start();
			System.out.println("hai");
		}
		catch(IllegalThreadStateException e) {
			System.out.println("Exception Caught " + e.getMessage());
		}
		
	}

}
