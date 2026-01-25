package practice;

public class ArrayPalindromePyramid {

	public static void main(String[] args) {
		
		int[] arr = {1,2,3,4,5};
		int n = arr.length;
		
		for(int i=0; i<n; i++)
		{
			for(int s=0; s<n-i-1; s++) //print leading spaces
			{
				System.out.print("  "); //two spaces
			}
			
			//Print decreasing part
			for(int j=0; j<=i; j++) 
			{
				System.out.print(arr[j]+" ");
			}
			
			for(int j=i-1; j>=0; j--) //print increasing part(mirror)
			{
				System.out.print(arr[j]+" ");
			}
			System.out.println();
		}
		
	}

}
