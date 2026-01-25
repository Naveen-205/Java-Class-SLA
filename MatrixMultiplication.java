package practice;
import java.util.Scanner;

public class MatrixMultiplication {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter rows and columns for Matrix A:");
		int r1 = sc.nextInt();
		int c1 = sc.nextInt();
		
		System.out.println("Enter rows and columns for Matrix B:");
		int r2 = sc.nextInt();
		int c2 = sc.nextInt();
		
		if (c1 != r2) // this is one rule 
		{
			System.out.println("Matrix multiplication not possible.");
			return;
		}
		
		int[][] A = new int[r1][c1];
		int[][] B = new int[r2][c2];
		//matrix multiplication array
		int[][] C = new int[r1][c2];
		
		System.out.println("Enter Matrix A:");
		for(int i = 0;i<r1;i++)//row1
			for(int j=0;j<c1;j++)//column1
				A[i][j] = sc.nextInt();
		
		System.out.println("Enter Matrix B:");
		for(int i = 0;i<r2;i++)//row2
			for(int j=0;j<c2;j++)//column2
				B[i][j] = sc.nextInt();
		
		for(int i=0; i<r1; i++)//r1 
		{
			for (int j=0; j<c2; j++)//c2
			{
				for (int k=0; k<c1; k++)//c1
				{
					C[i][j] += A[i][k] * B[k][j];
				}
			}
		}
		
		System.out.println("Muliplication Result:");
		for(int i=0; i<r1; i++) {
			for(int j=0; j<c2; j++) {
				System.out.print(C[i][j] + " ");
			}
			System.out.println();
		}
		sc.close();
				
	}

}
