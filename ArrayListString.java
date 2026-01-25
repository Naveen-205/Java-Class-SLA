package practice;
import java.util.ArrayList;

public class ArrayListString {

	public static void main(String[] args) {
		
		ArrayList<String> names = new ArrayList<String>();
		
		//Add elements
		names.add("Java");
		names.add("Python");
		names.add("C++");
		
		//Add at index
		names.add(1, "JavaScript");
		
		//Access Element(get)
		System.out.println(names.get(2));
		
		//Update Element(set)
		names.set(0, "Core Java");
		
		//Remove Element
		names.remove("C++");
		
		//Size
		System.out.println("Size: " + names.size());
		
		//Iterate
		for(String s : names) {
			System.out.println(s);
		}
		
		
	}

}
