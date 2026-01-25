package practice;
import java.util.Arrays;

//extra array method
public class RotateKPosition {
	
	static int[] leftRotate(int[] arr,int k) 
	{	
		int n = arr.length; //array size
		k = k % n; // It gives reminder
		// k greater than array length, rotation repeats,
		//rotating by 7 position in an array of size 5 is same
		//as rotating by 7%5=2
		
		int[] result = new int[n]; //store the rotated elements
		int index = 0; //tracks the position to insert elements
		
		for(int i=k; i<n; i++) //copy elements from index k to end
		{
			result[index++] = arr[i]; //moves elements after rotation point to the front
		}
		
		for(int i=0; i<k; i++) //copy first k elements to the end 
		{
			result[index++] =  arr[i]; //appends the first k elements at the end
		}
		return result;
			
	}

	public static void main(String[] args) {
		
		int[] arr = {1,2,3,4,5};
		int k = 2; //takes 2 number of left rotation
		arr = leftRotate(arr,k);
		System.out.println(Arrays.toString(arr)); //built-in method
 
	}

}
