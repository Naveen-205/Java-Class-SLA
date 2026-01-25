package practice;
import java.util.Set;
import java.util.TreeSet;

public class TreeSetProgram {

	public static void main(String[] args) {
		
		
		Set<Integer> set = new TreeSet<>();
				
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
