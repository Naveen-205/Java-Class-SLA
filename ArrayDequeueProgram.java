package practice;

import java.util.ArrayDeque;
import java.util.Deque;


public class ArrayDequeueProgram {

	public static void main(String[] args) {
		
		Deque<Integer> q = new ArrayDeque<>();
		
		//Add
		q.addFirst(10); //Front
		q.addLast(20); //rear
		q.addLast(30);
		
		//Display
		System.out.println(q);
		
		
		System.out.println("The Queue remove is " + q.removeFirst());
		System.out.println("The Queue poll is " + q.poll());
		System.out.println("The Queue peek first is " + q.peekFirst());
		System.out.println("The Queue peek last is " + q.peekLast());
		System.out.println("The Queue element is " + q.element());

	}

}
