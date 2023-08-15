package dataStructures;
public class PriorityQueue<T> {					//priority queue and its operation

    private Node<T> head;
    private int size;
    Menu menu= new Menu();

    private static class Node<T> {
        private T data;
        private int priority;
        private Node<T> next;

        public Node(T data, int priority) {
            this.data = data;
            this.priority = priority;
        }
    }

    public void enqueue(T data, int priority) {
        Node<T> newNode = new Node<>(data, priority);

        if (head == null || priority > head.priority) {
            newNode.next = head;
            head = newNode;
        } else {
            Node<T> current = head;
            while (current.next != null && priority <= current.next.priority) {
                current = current.next;
            }
            newNode.next = current.next;
            current.next = newNode;
        }
        size++;
    }

    public T dequeue() {
        if (head == null) {
        	System.out.println("Priority Queue is empty.First add some elements");
            menu.pqueue();
        }
        T data = head.data;
        head = head.next;
        size--;
        return data;
    }

    public T peek() {
        if (head == null) {
        	System.out.println("Priority Queue is empty.First add some elements");
            menu.pqueue();
        }
        return head.data;
    }

    public boolean contains(T data) {
        Node<T> current = head;
        while (current != null) {
            if (current.data.equals(data)) {
                return true;
            }
            current = current.next;
        }
        return false;
    }

    public int size() {
        return size;
    }

    public void reverse() {
    	if (head == null) {
        	System.out.println("Priority Queue is empty.First add some elements");
            menu.pqueue();
        }
        Node<T> prev = null;
        Node<T> current = head;
        Node<T> next = null;
        while (current != null) {
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        head = prev;
    }

    public T center() {
    	if (head == null) {
        	System.out.println("Priority Queue is empty.First add some elements");
            menu.pqueue();
        }
        Node<T> slow = head;
        Node<T> fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow.data;
    }

    public void traverse() {
    	if (head == null) {
        	System.out.println("Priority Queue is empty.First add some elements");
            menu.pqueue();
        }
        Node<T> current = head;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }
}
