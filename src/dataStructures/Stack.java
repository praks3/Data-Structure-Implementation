package dataStructures;

public class Stack {						//stack and its operation
    private Node top;
    private int size;
    Menu menu= new Menu();

    private static class Node {
        private int data;
        private Node next;

        public Node(int data) {
            this.data = data;
        }
    }

    public Stack() {
        top = null;
        size = 0;
    }

    public void push(int data) {
        Node newNode = new Node(data);
        newNode.next = top;
        top = newNode;
        size++;
    }

    public int pop() {
        if (isEmpty()) {
            System.out.println("Stack is empty.First add some elements");
            menu.stack();
        }
        int data = top.data;
        top = top.next;
        size--;
        return data;
    }

    public int peek() {
        if (isEmpty()) {
        	 System.out.println("Stack is empty.First add some elements");
             menu.stack();
         }
        return top.data;
    }

    public boolean contains(int data) {
        Node current = top;
        while (current != null) {
            if (current.data==data) {
                return true;
            }
            current = current.next;
        }
        return false;
    }

    public int size() {
        return size;
    }

    public int center() {
        if (isEmpty()) {
        	 System.out.println("Stack is empty.First add some elements");
             menu.stack();
        }
        int middle = size / 2;
        Node current = top;
        for (int i = 0; i < middle; i++) {
            current = current.next;
        }
        return current.data;
    }

    public void sort() {
    	 if (isEmpty()) {
        	 System.out.println("Stack is empty.First add some elements");
             menu.stack();
        }
    	int size1=-1;
        Stack tempStack = new Stack();
        while (!isEmpty()) {
        	++size1;
            int data = pop();
            while (!tempStack.isEmpty() && tempStack.peek()<data ) {
                push(tempStack.pop());
            }
            tempStack.push(data);
        }
        top = tempStack.top; 
        size=size1;
    }

    public void reverse() {
    	 if (isEmpty()) {
        	 System.out.println("Stack is empty.First add some elements");
             menu.stack();
        }
        Node prev = null;
        Node current = top;
        while (current != null) {
            Node next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        top = prev;
    }

     public void traverse() {
    	 if (isEmpty()) {
        	 System.out.println("Stack is empty.First add some elements");
             menu.stack();
        }
        Node current = top;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }

    public boolean isEmpty() {
        return top == null;
    }
}