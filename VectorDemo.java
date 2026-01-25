package practice;

import java.util.Vector;

public class VectorDemo {

	public static void main(String[] args) {
		
		//Creating a vector 
		Vector<Integer> vec = new Vector<>();
		
		//Adding elements
		vec.add(10);
		vec.add(20);
		vec.add(30);

		// Insert at a specific index
		vec.add(1, 15);
		vec.add(150);
		vec.add(2, 19);
		
		// Accessing elements
		System.out.println("Element at index 2: " + vec.get(2));
		System.out.println("Element at index 1: " + vec.get(1));
		
		// Updating values
		vec.set(0,  5);
		
		//Removing elements
		vec.remove(2);
		
		// Displaying vector
		System.out.println("Vector: " + vec);
		
		//Vector size and capacity
		System.out.println("Size: " + vec.size());
		System.out.println("Capacity: " + vec.capacity());
		
		
	}

}
