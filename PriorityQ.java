package practice;

import java.util.Comparator;
import java.util.PriorityQueue;

class Task
{
	String name;
	int priority;
	
	Task(String name, int priority)
	{
		this.name = name;
		this.priority = priority;
	}
	
	@Override
	public String toString()
	{
		return name + "(Priority " + priority + ")";
	}
}



public class PriorityQ {

	public static void main(String[] args) {
		
		PriorityQueue<Task> pr = new PriorityQueue<>(new Comparator<Task>()
	{
		public int compare(Task t1, Task t2)
		{
			return t2.priority-t1.priority;
		}
	 });
		
		pr.add(new Task("Task A",4));
		pr.add(new Task("Task B",3));
		pr.add(new Task("Task C",2));
		pr.add(new Task("Task D",8));
		pr.add(new Task("Task E",6));
		pr.add(new Task("Task F",7));
		pr.add(new Task("Task G",1));
		pr.add(new Task("Task H",9));
		
		System.out.println("Processing task in priority list");
		
	while(!pr.isEmpty())
	{
		Task t = pr.poll();
		System.out.println("Processing " + t);
	}
	
  }
}


