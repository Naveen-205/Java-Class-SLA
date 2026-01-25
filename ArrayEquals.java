package practice;
import java.util.Scanner;

public class ArrayEquals {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int size;
		
		System.out.println("Enter the Size:");
		size = sc.nextInt();
		int[] a = new int[size];
		System.out.println("Enter"+" "+size+ " Elements:");
		
		for(int i=0; i<a.length; i++) {
			a[i] = sc.nextInt();
		}
		System.out.println("Enter the Size:");
		int size1 = sc.nextInt();
		int[] b = new int[size1];
		System.out.println("Enter"+" "+size+"Elements:");
		
		sc.close();

}
}
	
//	public static boolean 
	
	
	
	
	
	
	
	
	
	
	
	
	
	