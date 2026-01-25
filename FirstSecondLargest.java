package practice;

//selection sort
public class FirstSecondLargest {

	public static void main(String[] args) {
		
		        int[] arr = {10, 5, 20, 8, 25, 15};

		        for (int i = 0; i < 3; i++) {
		            int maxIndex = i;

		            for (int j = i + 1; j < arr.length; j++) {
		                if (arr[j] > arr[maxIndex]) {
		                    maxIndex = j;
		                }
		            }

		            // swap
		            int temp = arr[i];
		            arr[i] = arr[maxIndex];
		            arr[maxIndex] = temp;
		        }

		        System.out.println("Second largest: " + arr[1]);
		        System.out.println("Third largest: " + arr[2]);
	
	}

}
