package practice;

public class ExceptionThrowsImplementation {
	
	static void divide(int a,int b) throws ArithmeticException
	{
		int result = a/b;
		System.out.println("Result " + result);
	}
	
	public static void main(String[] args) {
		
		try {
			divide(0,0);
		}
		catch(ArithmeticException e) {
			System.out.println("Cannot Divide by Zero");
		}

	}

}
