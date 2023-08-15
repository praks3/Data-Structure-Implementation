package dataStructures;
import java.util.*;

public class HashTable<K, V>  {							//hash table and its operation
    private static final int DEFAULT_CAPACITY = 10;
    private List<Node<K, V>> buckets;
    private int size;

    public HashTable() {
        this(DEFAULT_CAPACITY);
    }

    public HashTable(int capacity) {
        buckets = new ArrayList<>(Collections.nCopies(capacity, null));
        size = 0;
    }

    public void insert(K key, V value) {
        int index = hash(key);
        Node<K, V> head = buckets.get(index);
        while (head != null) {
            if (head.key.equals(key)) {
                head.value = value;
                return;
            }
            head = head.next;
        }
        head = buckets.get(index);
        Node<K, V> newNode = new Node<>(key, value);
        newNode.next = head;
        buckets.set(index, newNode);
        size++;
    }

    public boolean contains(K key) {
        int index = hash(key);
        Node<K, V> head = buckets.get(index);
        while (head != null) {
            if (head.key.equals(key)) {
                return true;
            }
            head = head.next;
        }
        return false;
    }

    public V getValueByKey(K key) {
        int index = hash(key);
        Node<K, V> head = buckets.get(index);
        while (head != null) {
            if (head.key.equals(key)) {
                return head.value;
            }
            head = head.next;
        }
        return null;
    }

    public void delete(K key) {
        int index = hash(key);
        Node<K, V> head = buckets.get(index);
        Node<K, V> prev = null;
        while (head != null) {
            if (head.key.equals(key)) {
                if (prev == null) {
                    buckets.set(index, head.next);
                } else {
                    prev.next = head.next;
                }
                size--;
                return;
            }
            prev = head;
            head = head.next;
        }
    }

    public int size() {
        return size;
    }

    public void traverse() {
        for (Node<K, V> head : buckets) {
            while (head != null) {
                System.out.println(head.value);
                head = head.next;
            }
        }
    }

    private int hash(K key) {
        return Math.abs(key.hashCode() % buckets.size());
    }

    private static class Node<K, V> {
        K key;
        V value;
        Node<K, V> next;

        public Node(K key, V value) {
            this.key = key;
            this.value = value;
            this.next = null;
        }
    }
    }