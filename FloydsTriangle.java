package practice;
import java.util.Scanner;

public class FloydsTriangle {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int numberOfRows;
		System.out.println("Input Number of Rows:");
		numberOfRows = in.nextInt();
		
		int number = 1;
		for(int row = 1; row<=numberOfRows; row++)
		{
			for(int column = 1; column <= row; column++)
			{
				System.out.print(number + " ");
				number++; //floyds algorithm
			}
			System.out.println();
		}
		in.close();
	}

}
