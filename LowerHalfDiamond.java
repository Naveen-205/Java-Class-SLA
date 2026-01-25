package practice;
import java.util.Scanner;

public class LowerHalfDiamond {

	public static void main(String[] args) {
		//lower half diamond
		int i,j,spaces,rows;
		System.out.println("Input Number of Rows (half of the diamond) : ");
		Scanner in = new Scanner(System.in);
		rows = in.nextInt();
		
		//Loop for the upper half
		for(i=rows-1; i>=1; i--) //iteration prints the rows of pyramid
		{
			//Loop to print leading spaces
				//print spaces before starts to center the pyramid
				//number of spaces decreases as i increases
			for(spaces=1; spaces<rows-i; spaces++)
			{
				System.out.print(" ");
			}
			
			//Loop to print stars
				//2*i-1 ensures the pyramid shape
			for(j=1; j<=2*i-1; j++) //row1 -> 1 star, row2 -> 3 star, row3 -> 5 star
			{
				System.out.print("*");
			}
			System.out.println(" ");
		}
			
		in.close();


	}

}
