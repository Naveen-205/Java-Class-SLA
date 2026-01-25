package practice;

public class ExceptionHandlingSample {

	public static void main(String[] args) {
		
		int n = 10;
		int m = 0;
		
		try
		{
			int ans = n/m;
			System.out.println("The answer is " + ans);
		}
		catch(Exception e)
		{
			System.err.println("Error Divide by 0 " + e);
		}

	}

}
