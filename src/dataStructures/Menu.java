package dataStructures;
import java.util.Scanner;
public class Menu {
	Scanner sc = new Scanner(System.in);
	Print disp =new Print();
	
	public void ll() {						//menu for linkedlist
		LinkedList link =new LinkedList();
		disp.menu2(); 
		
		while (true) {
	    System.out.print("\nEnter your choice: ");
	    int choice;
        choice = sc.nextInt();
	    switch (choice) {
	    
	        case 1:
	            System.out.print("Enter the data for the new node: ");
	            int newData = sc.nextInt();
	            link.insert(newData);
	            System.out.println("Node added successfully.");
	            break;
	        case 2:
	        	System.out.print("Enter the data for the new node: ");
	            int key = sc.nextInt();
	            System.out.print("Enter the position for the new node: ");
	            int pos= sc.nextInt();
	            link.insertAtPosition(key,pos);
	            System.out.println("Node added successfully.");
	            break;
	        case 3:
	            System.out.print("Enter the data of the node to be deleted: ");
	            int key1 = sc.nextInt();
	            link.delete(key1);
	            System.out.println("Node deleted successfully.");
	            break;
	        case 4:
	            System.out.print("Enter the position to delete the node: ");
	            int pos2= sc.nextInt();
	            link.deleteAtPosition(pos2);
	            System.out.println("Node deleted successfully.");
	            break;
	        case 5:
	        	link.getCentre();
	            break;
	        case 6:
	            link.sort();
	            link.printList(link);
	            break;
	        case 7:
	        	link.reverse();
	        	link.printList(link);
	        	break;
	        case 8:
	        	System.out.print(link.size());
	        	break;
	        case 9:
	        	link.printList(link);
	        	break;
	        case 10:
	        	link.printList(link);
	        	break;
	        case 11:
	            System.out.println("Exiting...");
	            return ;
	        default:
	            System.out.println("Invalid choice. Try again.");
	            break;
	    }    
		}
	}
	
		public void stack() {					//menu for stack
			Stack stack =new Stack();
			disp.menu3();
			
			while (true){
		    System.out.print("\nEnter your choice: ");
		    int choice;
		    choice = sc.nextInt();
		    switch (choice){
		        case 1:
		            System.out.print("Enter the data to be pushed: ");
		            int newData = sc.nextInt();
		            stack.push(newData);
		            System.out.println("data added successfully.");
		            break;
		        case 2:
		        	System.out.println(stack.pop()+"Deleted successfully.");
		        	break;
		        case 3:
		            System.out.println(stack.peek());
		            break;
		        case 4:
		        	System.out.println("enter data to be checked");
		        	int data= sc.nextInt();
		        	System.out.println(stack.contains(data));
		            break;
		        case 5:
		        	System.out.println(stack.size());
		            break;
		        case 6:
		        	System.out.println(stack.center());
		        	break;
		        case 7:
		        	stack.sort();
		        	stack.traverse();
		        	break;
		        case 8:
		        	stack.reverse();
		        	stack.traverse();
		        	break;
		        case 9:
		        	stack.traverse();
		        	break;
		        case 10:
		        	stack.traverse();
		        	break;
		        case 11:
		            System.out.println("Exiting...");
		           return;
		        default:
		            System.out.println("Invalid choice. Try again.");
		            break;
		    }	
			}
		}
		
		public void queue() {						//menu for queue
			Queue queue =new Queue();
			disp.menu4();
			
			while (true) {
		    System.out.print("\nEnter your choice: ");
		    int choice ;
		    choice = sc.nextInt();
		    switch (choice) {
		        case 1:
		            System.out.print("Enter the data: ");
		            int newData = sc.nextInt();
		            queue.enqueue(newData);
		            System.out.println("data added successfully.");
		            break;
		        case 2:
		        	System.out.println(queue.dequeue()+"Deleted successfully.");
		        	break;
		        case 3:
		            System.out.println(queue.peek());
		            break;
		        case 4:
		        	System.out.println("enter data to be checked");
		        	int data= sc.nextInt();
		        	System.out.println(queue.contains(data));
		            break;
		        case 5:
		        	System.out.println(queue.size());
		            break;
		        case 6:
		        	System.out.println(queue.center());
		        	break;
		        case 7:
		        	queue.sort();
		        	queue.traverse();
		        	break;
		        case 8:
		        	queue.reverse();
		        	queue.traverse();
		        	break;
		        case 9:
		        	queue.traverse();
		        	break;
		        case 10:
		        	queue.traverse();
		        	break;
		        case 11:
		            System.out.println("Exiting...");
		           return;
		        default:
		            System.out.println("Invalid choice. Try again.");
		            break;
		    } 
		    }
		}
		
		@SuppressWarnings("unchecked")
		public void pqueue() {					//menu for priority queue
			@SuppressWarnings("rawtypes")
			PriorityQueue pqueue= new PriorityQueue();
			disp.menu5();
			
			while (true) {
		    System.out.print("\nEnter your choice: ");
		    int choice;
		    choice = sc.nextInt();
		    switch (choice) {
		        case 1:
		            System.out.print("Enter the data: ");
		            int newData = sc.nextInt();
		            System.out.print("enter priority");
		            int priority =sc.nextInt();
		            pqueue.enqueue(newData, priority);
		            System.out.println("data added successfully.");
		            break;
		        case 2:
		        	System.out.println(pqueue.dequeue()+"	Deleted successfully.");
		        	break;
		        case 3:
		            System.out.println(pqueue.peek());
		            break;
		        case 4:
		        	System.out.println("enter data to be checked");
		        	int data= sc.nextInt();
		        	System.out.println(pqueue.contains(data));
		            break;
		        case 5:
		        	System.out.println(pqueue.size());
		            break;
		        case 6:
		        	System.out.println(pqueue.center());
		        	break;
		        case 7:
		        	pqueue.reverse();
		        	pqueue.traverse();
		        	break;
		        case 8:
		        	pqueue.traverse();
		        	break;
		        case 9:
		        	pqueue.traverse();
		        	break;
		        case 10:
		            System.out.println("Exiting...");
		            return;
		        default:
		            System.out.println("Invalid choice. Try again.");
		            break;
		    }
			}
		}
		
		public void hasht() {							//menu for hash table
			HashTable<String, Integer> ht = new HashTable<>();
			disp.menu6();
			
			while (true) {
		    System.out.print("\nEnter your choice: ");
		    int choice ;
		    choice = sc.nextInt(); 
		    switch (choice) {
		        case 1:
		        	System.out.print("Enter the data: ");
		            int value = sc.nextInt();
		            sc.nextLine();
		            System.out.println("enter the key:");
		            String key= sc.nextLine();
		            ht.insert(key, value);
		            System.out.println("data added successfully.");
		            break;
		        case 2:
		        	System.out.println("Enter the key to delete the data: ");
		        	String key1= sc.next();
		        	ht.delete(key1);
		            break;
		        case 3:
		        	System.out.println("enter key to be checked");
		        	String key2= sc.next();
		        	System.out.println(ht.contains(key2));
		            break;
		        case 4:
		        	System.out.println("enter key to be get value");
		        	String key3= sc.next();
		        	System.out.println(ht.getValueByKey(key3));
		            break;
		        case 5:
		        	System.out.println(ht.size());
		            break;
		        case  6:
		        	ht.traverse();
		        	break;
		        case  7:
		        	ht.traverse();
		        	break;
		        case 8:
		        	System.out.println("Exiting...");
		           return;
		        default:
		            System.out.println("Invalid choice. Try again.");
		            break;
		    }
			}
		}
}