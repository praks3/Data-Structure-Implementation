package dataStructures;

public class Queue {					//queue and its operation
    private Node front;
    private Node rear;
    private int size=0;
    Menu menu= new Menu();

    public void enqueue(int data) {
        Node node = new Node(data);
        if (isEmpty()) {
            front = node;
            rear = node;
        } else {
            rear.next = node;
            rear = node;
        }
        size++;
    }

    public int dequeue() {
        if (isEmpty()) {
        	System.out.println("Queue is empty.First add some elements");
            menu.stack();
        }
        int data = front.data;
        front = front.next;
        if (front == null) {
            rear = null;
        }
        size--;
        return data;
    }

    public int peek() {

        if (isEmpty()) {
        	System.out.println("Queue is empty.First add some elements");
            menu.stack();
        }
        return front.data;
    }

    public boolean contains(int data) {
       Node current = front;
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
        	System.out.println("Queue is empty.First add some elements");
            menu.stack();
        }
        Node slow = front;
        Node fast = front;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow.data;
    }

    public void sort() {
        if (isEmpty()) {
        	System.out.println("Queue is empty.First add some elements");
            menu.stack();
        }
        if (size <= 1) {
            return;
        }
        boolean swapped;
        do {
            swapped = false;
            Node current = front;
            Node previous = null;
            while (current.next != null) {
                if (current.data > current.next.data) {
                    Node next = current.next;
                    current.next = next.next;
                    next.next = current;
                    if (previous == null) {
                        front = next;
                    } else {
                        previous.next = next;
                    }
                    swapped = true;
                } else {
                    previous = current;
                    current = current.next;
                }
            }
            rear = current;
        } while (swapped);
    }
    
    public void reverse() {
        if (isEmpty()) {
        	System.out.println("Queue is empty.First add some elements");
            menu.stack();
        }
        Node current = front;
        Node previous = null;
        Node next = null;
        while (current != null) {
            next = current.next;
            current.next = previous;
            previous = current;
            current = next;
        }
        rear = front;
        front = previous;
    }

    public void traverse() {
        if (isEmpty()) {
        	System.out.println("Queue is empty.First add some elements");
            menu.stack();
        }
        Node current = front;
        while (current != null) {
          System.out.print(current.data + " ");
          current = current.next;
        }
        System.out.println();
      }

    private boolean isEmpty() {
        return front == null;
    }

    private static class Node {
        private int data;
        private Node next;

        private Node(int data) {
            this.data = data;
        }
    }
}
