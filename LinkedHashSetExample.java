package practice;
import java.util.LinkedHashSet;
import java.util.Set;

public class LinkedHashSetExample {

	public static void main(String[] args) {
		
		//Simple hashset
		Set<Integer> set = new LinkedHashSet<>();
		
		//Add elements
		set.add(10);
		set.add(20);
		set.add(30);
		set.add(null);
		set.add(20);
		set.add(null); // it will not allow more than one null
		
		System.out.println("Set Elements: " + set);
		
		//Remove elements
		set.remove(30);
		
		//Checking presence
		System.out.println("Contains 20? " + set.contains(20));
		
		//size
		System.out.println("Size of the set " + set.size());
		
		
		
	}

}
