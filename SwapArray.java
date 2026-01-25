package practice;

public class SwapArray {

	public static void main(String[] args) {
		// swap using temp (variable)
		int a = 10;
		int b = 20;
			System.out.println("Before Swapping " + a + " " + b);
		int temp = a; //temp = 1st variable , a=10
		a=b; //1st variable = 2nd variable, a=b => b=10
		b=temp; //2nd variable b=10
		
		System.out.println("After Swapping " + a + " " + b);
		
		//swap using temp (array)
		int c = 6;
		int d = 7;
		int[] temparray = {c,d}; //storing in an array
		System.out.println("Before Swapping "+ c + " " + d);
		c = temparray[1];
		d = temparray[0];
		System.out.println("After Swapping "+ c + " " + d);
	}

}
