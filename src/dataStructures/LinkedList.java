package dataStructures;
import java.util.Scanner;

public class LinkedList { 				//linked list and its operation
	Scanner sc = new Scanner(System.in);
	Menu menu= new Menu();
    private class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    private Node head;
    private int size;
 
    public LinkedList() {
        this.head = null;
        this.size = 0;
    }

    public int size() {
        return this.size;
    }

    public void insert(int data) {
        Node node = new Node(data);
        if (head == null) {
            head = node;
        } else {
            Node current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = node;
        }
        size++;
    }
    
    public void insertAtPosition(int data, int position) {
    	/* if (head == null) {
             System.out.println("*EMPTY LINKEDLIST.FIRST ADD SOME DATA*");
         	menu.ll();
         }*/
        if (position < 0 || position > size) {
            System.out.println("*Invalid position*");
            System.out.print("Enter the position for the new node: ");
            int pos= sc.nextInt();
            insertAtPosition(data,pos);
            return ;
        }
        Node node = new Node(data);
        if (position == 0) {
            node.next = head;
            head = node;
        } else {
            Node current = head;
            for (int i = 0; i < position - 1; i++) {
                current = current.next;
            }
            node.next = current.next;
            current.next = node;
        }
        size++;
    }

    public void delete( int data) {
        if (head == null) {
            System.out.println("*EMPTY LINKEDLIST.FIRST ADD SOME DATA*");
        	menu.ll();
        }
        if (head.data ==data) {
            head = head.next;
            size--;
            return;
        }
        Node current = head;
        while (current.next != null && !(current.next.data ==data)) {
            current = current.next;
        }
        if (current.next != null) {
            current.next = current.next.next;
            size--;
        }
    }

    public void deleteAtPosition(int position) {
    	 if (head == null) {
             System.out.println("*EMPTY LINKEDLIST.FIRST ADD SOME DATA*");
         	menu.ll();
         }
        if (position < 0 || position >= size) {
            System.out.println("*Invalid position*");
            System.out.print("Enter the position to delete the node: ");
            int pos2= sc.nextInt();
            deleteAtPosition(pos2);
            return;
        }
        if (position == 0) {
            head = head.next;
        } else {
            Node current = head;
            for (int i = 0; i < position - 1; i++) {
                current = current.next;
            }
            current.next = current.next.next;
        }
        size--;
    }

    public void getCentre() {
        if (head == null) {
        	System.out.println("*EMPTY LINKEDLIST.FIRST ADD SOME DATA*");
         	menu.ll();
        }
        Node slow = head;
        Node fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        System.out.println(slow.data);
    }

    public void sort() {							//using insertion sort
        if (head == null || head.next == null) {
        	System.out.println("*EMPTY LINKEDLIST.FIRST ADD SOME DATA*");
         	menu.ll();
        }
        Node current = head;
        while (current != null) {  					
            Node min = current;
            Node inner = current.next;
            while (inner != null) {
                if ( inner.data <min.data) {
                    min = inner;
                }
                inner = inner.next;
            }
            int temp = current.data;
            current.data = min.data;
            min.data = temp;
            current = current.next;
        }
    }

    public void reverse() {
        Node previous = null;
        Node current = head;
        Node next = null;
        while (current != null) {
            next = current.next;
            current.next = previous;
            previous = current;
            current = next;
        }
        head = previous;
    }
    
    public void printList(LinkedList list) { 
    	 if (head == null) {
             System.out.println("*EMPTY LINKEDLIST.FIRST ADD SOME DATA*");
         	menu.ll();
         }
        Node currNode = list.head;
        while (currNode != null) { 
            System.out.print(currNode.data + " "); 
            currNode = currNode.next; 
        } 
        System.out.println();
    } 
}