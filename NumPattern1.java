package practice;

public class NumPattern1 {

	public static void main(String[] args) {
		int[] arr = {5,4,3,2,1}; 
		 
		 for (int i=0; i<arr.length; i++) //row
		 {
			 for (int j=0; j<=i; j++) //column based on row //prints the elements
			 {
				 System.out.print(arr[j]+" ");
			 }
			 System.out.println();
		 }
		 
	}

}
