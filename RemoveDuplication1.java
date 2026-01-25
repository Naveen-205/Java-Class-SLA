package practice;
import java.util.Scanner;

public class RemoveDuplication1 {
	
	public static void removeDuplicates(int[] arr) {
		int n = arr.length;
		boolean[] visited = new boolean[n]; //marks duplicate position
		
		System.out.print("Array after removing duplicates: ");
		
		for(int i=0; i<n; i++) {
			if(visited[i]) continue;
			
			boolean isDuplicate = false;
			
			for(int j=i+1; j<n; j++) {
				if(arr[i] == arr[j]){
					visited[j] = true;
					isDuplicate = true;
				}
			}
			//print only first occurrence
			System.out.println(arr[i] + " ");
		}
	}
	

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//Read size
		System.out.print("Enter Size:");
		int n = sc.nextInt();
		int[] arr = new int[n];
		//Read Elements
		System.out.println("Enter " + n + " Elements:");
		for(int i=0; i<n; i++) {
			
		}

	}

}
