package practice;

public class HeartShaped {

	public static void main(String[] args) {
		
		int n=6; //size of the heart
		
		//Top part of the heart(two humps)
		for(int i=n/2; i<=n; i+=2)
		{
		
		//left spaces
		for(int j=1; j<n-i; j+=2)
		{
			System.out.print(" ");
		}
		
		//Left stars
		for(int j=1; j<=i; j++)
		{
			System.out.print("*");
		}
		
		//Spaces between left and right humb
		for(int j=1; j<=n-i; j++)
		{
			System.out.print(" ");
		}
		
		//Right stars
		for(int j=1; j<=i; j++)
		{
			System.out.print("*");
		}
		System.out.println();
		
		}
		
		//Bottom part of heart(inverted triangle)
		for(int i=n; i>=1; i--)
		{
		//Leading spaces
		for(int j=i; j<n; j++)
		{
			System.out.print(" ");
		}
		
		//Stars
		for(int j=1; j<=(i*2)-1; j++)
		{
			System.out.print("*");
		}
		System.out.println();
		}
		
		
	}

}
