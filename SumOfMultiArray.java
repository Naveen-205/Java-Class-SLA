package practice;
import java.util.Scanner;

public class SumOfMultiArray {
	public static void main (String[] args) {
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Enter the number of Rows:");
		int rows = sc.nextInt();
		System.out.println("Enter the number of Columns:");
		int cols = sc.nextInt();
		int [][] arr = new int[rows][cols];
		
		//input
		for(int i=0;i<rows;i++) {
			for(int j=0;j<cols;j++) {
				arr[i][j] = sc.nextInt();
			}
		}
		//Display
		System.out.println("2D array elements");
		for(int i=0;i<rows;i++) {
			for(int j=0;j<cols;j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
		sc.close();
	}
}
