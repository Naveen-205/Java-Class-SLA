package practice;

class InvalidMarksException extends Exception
{
	InvalidMarksException(String msg)
	{
		super(msg);
	}
}

public class MarksCheck {

	public static void main(String[] args) {
		
		int marks = 101;
		
		try {
			if(marks<0 || marks>100)
			{
				throw new InvalidMarksException("Marks Between 0 to 100");
			}
			else
			{
				System.out.println("Valid Marks " + marks);
			}
		}
		catch(InvalidMarksException e) {
			System.out.println(e.getMessage());
		}
		finally {
			System.out.println("Ths will always execute");
		}
		
	}

}
