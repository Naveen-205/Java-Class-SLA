package practice;

public class JaggedArray {

	public static void main(String[] args) {
		// int[][] arr = new int[3][];
		
//		 arr[0] = new int[2]; //row 0 column 2
//		 arr[1] = new int[4]; //row 1 column 4
//		 arr[2] = new int[1]; //row 2 column 1
//		 
//		 System.out.println(arr[0][1]);	
//		 System.out.println(arr[1][3]);	
		 
		
		
		int[][] arr = { {1,2},{3,4,5,6},{7} }; 
		
		

		 
		 for (int i=0; i<arr.length; i++) //row
		 {
			 for (int j=0; j<arr[i].length; j++) //column based on row
			 {
				 System.out.print(arr[i][j]+" ");
			 }
			 System.out.println();
		 }
		 
		 
		 
		 
		 
		 
		 
		 char ch = 'a';
		 
		 for(int i=1; i<=5; i++) //row = i
			 {
			 for(int j=1; j<=i; j++) //column,j but depends on i
			{
				 System.out.print(ch);
			 }
			 ch++;
			 System.out.println();
		 }
	}

}
