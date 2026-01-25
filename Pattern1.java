package practice;

public class Pattern1 {

	public static void main(String[] args) {
		
		char ch = '*';
		 
		 for(int i=1; i<=5; i++) //row = i
			 {
			 for(int j=1; j<=i; j++) //column,j but depends on i
			{
				 System.out.print(ch);
			 }
			 System.out.println();
		 }

	}

}
