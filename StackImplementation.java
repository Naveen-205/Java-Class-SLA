package practice;

import java.util.Stack;

public class StackImplementation {

	public static void main(String[] args) {
		
		Stack<String> stack = new Stack<>();
		
		//push elements
		stack.push("A");
		stack.push("B");
		stack.push("C");
		stack.push("D");

		System.out.println("Stack: " + stack);

		//Peek (Top element)
		System.out.println("Peek: " + stack.peek());

		// Pop (removes last inserted element)
		System.out.println("Popped: " + stack.pop());
		System.out.println("After Pop: " + stack);

		//Search Element (1-based index)
		System.out.println("Position of B: " + stack.search("B"));
		
		
	}

}
