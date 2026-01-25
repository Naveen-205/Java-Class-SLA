package practice;

public class LinkedListExample {
	
	class Node
	{
		int data;
		Node next;

		Node(int data)
		{
			this.data = data; //store value
			this.next = null; //next initial empty
		}
	}
	
	Node head; //Node fixed to be at head

	// 1.Insert at the beginning
	void insertAtbeginning(int data)
	{
		//Create a new node
		Node newNode = new Node(data);

		//New node's => next -> current head
		newNode.next = head; 

		//Move head pointer to new node
		head = newNode;
	}
	
	// 2.Insert at the end
		void insertAtEnd(int data)
		{
			//Create a new node
			Node newNode = new Node(data);
			//If list empty -> head = newNode
			if(head == null)
			{
				head = newNode; //adding the element
				return;
			}
			//Else traverse to last node (where next = null)
			//Attach newNode at end
			Node temp = head;
			while(temp.next != null)
			{
				temp = temp.next;
			}
			temp.next = newNode;
		}
		
//	 Delete a node:
//			
//case 1: Delete head node
//If head contains the key:
//head = head.next
//
//case 2: Delete middle or last
//Keep two pointers:
//temp -> current node
//prev -> previous node
//
//when key found:
//prev.next = temp.next
		
		// Node gets removed from chain.
		
		void delete(int key) 
		{
			Node temp = head, prev = null;
			if(temp != null && temp.data == key)
			{
				head = temp.next;
				return;
			}
			while(temp!=null && temp.data!=key)
			{
				prev = temp;
				temp = temp.next;
			}
			if(temp == null)
			{
				System.out.println("Element not found");
				return;
			}
			prev.next = temp.next;
		}
	
	
	//Search an element 
	 //Start from head
	 //Traverse node by node
	 //If match found -> return true
	 //If traversed entire list and not found -> return false

	 boolean search(int key)
	 {
	 	Node temp = head;
	 	while(temp != null)
	 	{
	 		if(temp.data == key)
	 		{
	 			return true;
	 		}
	 	}
	 	return false;
	 }
	
	// Length of the list:

	 	int length() //user defined
	 	{
	 		int count = 0;
	 		Node temp = head;
	 		while(temp != null)
	 		{
	 			count ++;
	 			temp = temp.next;
	 		}
	 		return count;
	 	}
	
	//Display List(DSA)
	void display()
	{
		Node temp = head;
		while(temp != null)
		{
			System.out.println(temp.data+ " -> ");
			temp = temp.next;
		}
		System.out.println("null");
	}
	
	//Reverse a list
	void reverse()
	{
		Node prev = null, curr = head, next;
		while(curr != null)
		{
			next = curr.next; //save next
			curr.next = prev; //reverse pointer
			prev = curr; //move prev forward
			curr = next;
		} //move curr forward
		head = prev;
	}

	public static void main(String[] args) {
		
		LinkedListExample list = new LinkedListExample();
		list.insertAtbeginning(10);
		list.insertAtbeginning(20);
		list.insertAtEnd(30);
		list.display();

		System.out.println("Length " + list.length());
		list.delete(20);
		list.display();

		System.out.println("Search 10  " + list.search(10));
		list.reverse();
		list.display();

	}

}
