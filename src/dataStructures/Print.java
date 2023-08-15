package dataStructures;

public class Print {		//prints the menu of various data structures.

	public void menu1() {
		System.out.println("Menu:");
		System.out.println("1.Linked List");
		System.out.println("2.Stack");
		System.out.println("3.Queue");
		System.out.println("4.Priority Queue");
		System.out.println("5.HashTable");
		System.out.println("6.EXIT");
		System.out.print("To choose your Data Structure, Please select from 1 to 6 :");
	}
	
	public void menu2() {
		System.out.println("\nData structure chosen: LinkedList");
		System.out.println("Menu:");
	    System.out.println("1. Add a node");
	    System.out.println("2. Add a node at a specific position");
	    System.out.println("3. Delete a node");
	    System.out.println("4. Delete a node in a specific position");
	    System.out.println("5. centre");
	    System.out.println("6. sort");
	    System.out.println("7. reverse");
	    System.out.println("8. size");
	    System.out.println("9. Iterator");
	    System.out.println("10. Print");
	    System.out.println("11. Exit");
	}
	
	public void menu3() {
		System.out.println("\nData structure chosen: Stack");
		System.out.println("Menu:");
	    System.out.println("1. Push");
	    System.out.println("2. Pop");
	    System.out.println("3. peek");
	    System.out.println("4. contains");
	    System.out.println("5. size"); 
	    System.out.println("6. centre");
	    System.out.println("7. sort");
	    System.out.println("8. reverse");
	    System.out.println("9. Iterator");
	    System.out.println("10. Print");
	    System.out.println("11. Exit");
	}
	
	public void menu4() {
		System.out.println("\nData structure chosen: Queue");
		System.out.println("Menu:");
	    System.out.println("1. enqueue");
	    System.out.println("2. dequeue");
	    System.out.println("3. peek");
	    System.out.println("4. contains");
	    System.out.println("5. size");
	    System.out.println("6. centre");
	    System.out.println("7. sort");
	    System.out.println("8. reverse");
	    System.out.println("9. Iterator");
	    System.out.println("10. Print");
	    System.out.println("11. Exit");
	}	
	
	public void menu5() {
		System.out.println("\nData structure chosen: Priority Queue");
		System.out.println("Menu:");
	    System.out.println("1. enqueue");
	    System.out.println("2. dequeue");
	    System.out.println("3. peek");
	    System.out.println("4. contains");
	    System.out.println("5. size");
	    System.out.println("6. centre");
	    System.out.println("7. reverse");
	    System.out.println("8. Iterator");
	    System.out.println("9. Print");
	    System.out.println("10. Exit");
	}
	
	public void menu6() {
		System.out.println("\nData structure chosen: Hash Table");
		System.out.println("Menu:");
	    System.out.println("1. insert");
	    System.out.println("2. delete"); 
	    System.out.println("3. contains");
	    System.out.println("4. get value by key");
	    System.out.println("5. size");
	    System.out.println("6. iterator");
	    System.out.println("7. Print");
	    System.out.println("8. Exit");
	}
}
