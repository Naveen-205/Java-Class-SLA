package practice;
import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListProgram {

	public static void main(String[] args) {
		
		LinkedList <Integer> list = new LinkedList<>();
		
		//Add an Element
		list.add(20);
		list.add(30);
		list.add(40);
		list.add(50);
		list.add(60);
		
		//Add at beginning
		list.addFirst(10);
		
		//Add at end
		list.addLast(70);
		
		//Display List
		System.out.println(list);
		
		//Remove Elements
		list.remove(); //removes first element
		list.remove(1); //removes element at index 1
		list.removeFirst(); //removes first element
		list.removeLast(); //removes last element
		
		//Display after removal
		System.out.println(list);
		
		
		//Iterator
		Iterator<Integer> itr = list.iterator();
		
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}

	}

}
