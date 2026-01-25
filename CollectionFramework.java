package practice;
import java.util.ArrayList;

public class CollectionFramework {

	public static void main(String[] args) {
		//Array Implementation
		ArrayList<Integer> num = new ArrayList<Integer>();
		
		//How to add elements to the framework
		num.add(1);
		
		ArrayList<String> str = new ArrayList<String>();
		str.add("Orange");
		
		System.out.println("ArrayInteger " + num);
		System.out.println("ArrayString " + str);
		
		ArrayList<Object> list = new ArrayList<Object>();
		list.add(10);
		list.add("Hello");
		list.add(1.78953);
		list.add(1325678908);
		System.out.println("The List is " + list);
		
//		//Using Pair
//		ArrayList<Pair<Integer,String>> list2 = new ArrayList<>();
//		list2.add(new Pair<>(1,"Alice"));
		
	}

}
