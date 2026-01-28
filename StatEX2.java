package practice;

public class StatEX2 {

	//static variable
	static int a = 40;
	//instance variable
	int b = 50;
	
	void simpleDisplay() //non-static method
	{
		System.out.println(a);//static variable
		System.out.println(b);
	}
	
	//Declaration of static method
	static void staticDisplay()
	{
		System.out.println(a);
	}
	
	
	public static void main(String[] args) {
		
		//calling non-static method
		 StatEX2 obj = new StatEX2();
		 obj.simpleDisplay();
		 
		 //calling static method
		 staticDisplay();

	}

}
