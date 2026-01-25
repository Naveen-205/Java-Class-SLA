package practice;

public class ThrowException {
	
	static void checkAge(int age1) {
		if(age1<18)
		{
			throw new IllegalArgumentException("Access Denied");
		}
		else
		{
			System.out.println("Access Granted");
		}
	}

	public static void main(String[] args) {
		
		checkAge(20);

	}

}
