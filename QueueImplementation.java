package practice;
import java.util.Queue;
import java.util.LinkedList;

public class QueueImplementation {

	public static void main(String[] args) {
		
		
		Queue<Integer> q = new LinkedList<>();
		
		//Add
		q.add(10);
		q.add(20);
		q.add(30);
		q.add(40);
		q.add(50);
		
		System.out.println("The Queue list is " + q);
		System.out.println("The Queue remove is " + q.remove());
		System.out.println("The Queue poll is " + q.poll());
		System.out.println("The Queue peek is " + q.peek());
		System.out.println("The Queue offer is " + q.offer(10));
		System.out.println("The Queue element is " + q.element());


	}

}
