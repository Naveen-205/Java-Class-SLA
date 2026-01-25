package practice;

import java.util.HashSet;
import java.util.Set;

public class SetImplementation {

	public static void main(String[] args) {
		
		//Simple hashset
		Set<Integer> set = new HashSet<>();
		
		//Add elements
		set.add(10);
		set.add(20);
		set.add(30);
		set.add(20);
		
		
		System.out.println("Set Elements: " + set);
		
		//Remove elements
		set.remove(30);
		
		//Checking presence
		System.out.println("Contains 20? " + set.contains(20));
		
		//size
		System.out.println("Size of the set " + set.size());
		
		
		
	}

}
