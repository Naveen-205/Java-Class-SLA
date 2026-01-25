package practice;

public class NestedTry {

	public static void main(String[] args) {
		
		//outer try
		try {
			String s = null;
			
		//inner try
		try {
			System.out.println(s.length());
		}
		
		catch(NullPointerException e) {
			System.out.println("Inner Catch : String is null");
		}
		}
		
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("Outer Catch : Invalid array Index");
		}

	}

}
