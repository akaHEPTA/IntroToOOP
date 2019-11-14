package collections.list;

import java.util.NoSuchElementException;
import java.util.Objects;

// class LinkedList<E> implements List<E>, Deque<E>
public class MySinglyLinkedList<E> {
    private Node<E> head, tail;
    private int size;

    public MySinglyLinkedList() {
    }

    public void addFirst(E e) {
        final Node<E> h = head;
        final Node<E> newNode = new Node<>(e, h);
        head = newNode;

        // adding new node to the empty linked list - tail should also point to newNode
        if (h == null) tail = newNode;

        size++;
    }

    public void addLast(E e) {
        final Node<E> t = tail;
        final Node<E> newNode = new Node<>(e, null);
        tail = newNode;

        // update the previous node to point right one added
        if (t == null) head = newNode;
        else t.next = newNode;

        size++;
    }

    public void add(int index, E e) {
        if (index < 0 || index > size) throw new IndexOutOfBoundsException();
        if (index == 0) addFirst(e);
        else if (index == size) addLast(e);
        else {
            Node<E> cur = head;
            for (int i = 0; i < index - 1; i++) cur = cur.next;
            cur.next = new Node<>(e, cur.next);
            size++;
        }
    }

    public E removeFirst() {
        final Node<E> h = head;
        if (h == null) throw new NoSuchElementException();
        final E e = h.item;
        final Node<E> next = h.next;

        // helping Garage Collector
        h.item = null;
        h.next = null;

        head = next;
        if (next == null) tail = null;
        size--;

        return e;
    }

    /**
     * This method can be improved by using Doubly-Linked list.
     * (Doubly-Linked List has `prev` pointer.
     * ex) tail.prev (second last node)
     *
     * @return
     */
    public E removeLast() {
        final Node<E> h = head;
        if (h == null) throw new NoSuchElementException();

        // edge case when you have a single node
        if (size == 1) return removeFirst();

        Node<E> nodeBefore = h;

        // doubly linked list is faster
        for (int i = 0; i < size - 2; i++) nodeBefore = nodeBefore.next;

        Node<E> nodeToRemove = nodeBefore.next;
        nodeBefore.next = null;
        tail = nodeBefore;
        size--;

        return nodeToRemove.item;
    }

    public E getFirst() {
        if (head == null) throw new NoSuchElementException();
        return head.item;
    }

    public E getLast() {
        if (tail == null) throw new NoSuchElementException();
        return tail.item;
    }

    public int size() {
        return this.size;
    }

    private Node<E> getNodeAt(int index) {
        if (index < 0 || index >= size) throw new IndexOutOfBoundsException();
        Node<E> cur = head;
        for (int i = 0; i < index; i++) cur = cur.next;
        return cur;
    }

    public E get(int index) {
        return getNodeAt(index).item;
    }

    public E set(int index, E e) {
        Node<E> cur = getNodeAt(index);
        E oldValue = cur.item;
        cur.item = e;
        return oldValue;
    }

    public int indexOf(Object o) {
        int index = 0;
        if (o == null) {
            for (Node<E> x = head; x != null; x = x.next) {
                if (x.item != null) return index;
                index++;
            }
        } else {
            for (Node<E> x = head; x != null; x = x.next) {
                if (o.equals(x.item)) return index;
                index++;
            }
        }
        return -1;
    }

    public boolean remove(Object o) {
        // todo
        return false;
    }

    public boolean remove(int index) {
        // Index check
        if (index < 0 || index >= size) throw new IndexOutOfBoundsException();

        boolean result = false;
        if (index == 0) {
            if (removeFirst() != null) result = true;
        } else if (index == size - 1) {
            if (removeLast() != null) result = true;
        } else {
            // linear search
            Node<E> prev = head;
            for (int i = 0; i < index - 1; i++) prev = prev.next;
            // reconnect link
            prev.next = prev.next.next;
            size--;
            result = true;
        }
        return result;
    }

    public int lastIndexOf(Object o) {
        // todo
        return 0;
    }

    public void reverse() {
        // todo
    }

    public boolean contains(Object o) {
        return indexOf(0) >= 0;
    }

    @Override
    public String toString() {
        // todo
        return super.toString();
    }

    private static class Node<E> {
        E item;
        Node<E> next;

        public Node(E item, Node<E> next) {
            this.item = item;
            this.next = next;
        }
    }


}

// * Relationships

// inheritance (is-a)
// - Shape -> Circle, Rectangle
// - Employee -> Developer, Designer

// Composition (has-a) - "inner class"
// - College -> Department
// - LinkedList -> Node