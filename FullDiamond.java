package practice;
import java.util.Scanner;

public class FullDiamond {

	public static void main(String[] args) {
		
		int i,j,r;
		System.out.println("Input Number of Rows (Full of the diamond) : ");
		Scanner in = new Scanner(System.in);
		r = in.nextInt();
		
		for(i=0; i<=r; i++) 
		{
			for(j=1; j<=r-i; j++) 
				System.out.print(" ");
			for(j=1; j<=2*i-1; j++)
					System.out.print("*");
				System.out.println(" ");
		}
		
		for(i=r-1; i>=1; i--) 
		{
		for(j=1; j<=r-i; j++) 
			System.out.print(" ");
		for(j=1; j<=2*i-1; j++)
			System.out.print("*");
		  System.out.println(" ");
		}
			
		in.close();

	}

}
