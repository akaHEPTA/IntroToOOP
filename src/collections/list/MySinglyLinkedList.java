package collections.list;
// * Relationships
// inheritance (is-a)
// - Shape -> Circle, Rectangle
// - Employee -> Developer, Designer

// composition (has-a) - "inner class"
// - College -> Department
// - LinkedList -> Node

import java.util.NoSuchElementException;

// class LinkList<E> implements List<E>, Deque<E>
public class MySinglyLinkedList<E> {

    private Node<E> head, tail; // null;
    private int size; // 0;

    public MySinglyLinkedList() {
    }

    public void addFirst(E e)  {
        final Node<E> h = head;
        final Node<E> newNode = new Node<>(e, h);
        head = newNode;
        if (h == null) {
            // adding new node to the empty linked list
            // tail should also point to newNode
            tail = newNode;
        }
        size++;
    }

    public void addLast(E e) {
        final Node<E> t = tail;
        final Node<E> newNode = new Node<>(e, null);
        tail = newNode;
        if (t == null) {
            head = newNode;
        } else {
            t.next = newNode;
        }
        size++;
    }

    public void add(int index, E e) {
        if (index < 0 || index > size) {
            throw new IndexOutOfBoundsException();
        }
        if (index == 0) {
            addFirst(e);
        } else if (index == size) {
            addLast(e);
        } else {
            Node<E> cur = head;
            for (int i = 0; i < index - 1; i++) {
                cur = cur.next;
            }
            cur.next = new Node<>(e, cur.next);
            size++;
        }
    }

    public E removeFirst() {
        final Node<E> h = head;
        if (h == null) {
            throw new NoSuchElementException();
        }
        final E elem = h.item;
        final Node<E> next = h.next;
        h.item = null;
        h.next = null; // helping Garbage Collector
        head = next;
        if (next == null) {
            tail = null;
        }
        size--;
        return elem;
    }

    /**
     * This method can be improved by using Doubly-Linked List.
     * (Doubly-Linked List has `prev` pointer.)
     * ex) tail.prev (second last node)
     */
    public E removeLast() {
        final Node<E> h = head;
        if (h == null) {
            throw new NoSuchElementException();
        }
        /// edge case when you have a single node
        if (size == 1) {
            return removeFirst();
        }
        Node<E> nodeBefore = h;
        /* doubly linked list is faster here */
        for (int i = 0; i < size - 2; i++) {
            nodeBefore = nodeBefore.next;
        }
        Node<E> nodeToRemove = nodeBefore.next;
        nodeBefore.next = null;
        tail = nodeBefore;
        size--;
        return nodeToRemove.item;
    }

    public E getFirst() {
        if (head == null) {
            throw new NoSuchElementException();
        }
        return head.item;
    }

    public E getLast() {
        if (tail == null) {
            throw new NoSuchElementException();
        }
        return tail.item;
    }

    public int size() {
        return size;
    }

    private Node<E> getNodeAt(int index) {
        // index validation
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException();
        }
        // navigate to the right node (index)
        Node<E> cur = head;
        for (int i = 0; i < index; i++) {
            cur = cur.next;
        }
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
                if (x.item == null) {
                    return index;
                }
                index++;
            }
        } else {
            for (Node<E> x = head; x != null; x = x.next) {
                if (o.equals(x.item)) {
                    return index;
                }
                index++;
            }
        }
        return -1;
    }

    public boolean remove(Object o) {
        // TODO: question 1
        return false;
    }

    public boolean remove(int index) {
        // TODO: question 2
        return false;
    }

    /**
     * This can be improved by using doubly-linked list
     */
    public int lastIndexOf(Object o) {
        // TODO: question 3
        int index = 0;
        int lastIndex = -1;
        if (o == null) {
            for (Node<E> x = head; x != null; x = x.next) {
                if (x.item == null) {
                    lastIndex = index;
                }
                index++;
            }
        } else {
            for (Node<E> x = head; x != null; x = x.next) {
                if (o.equals(x.item)) {
                    lastIndex = index;
                }
                index++;
            }
        }
        if (lastIndex != -1){
            return lastIndex;
        }
        return -1;
    }

    /**
     * Reverses the current linked list
     * "A" -> "B" -> "C"
     * should be
     * "C" -> "B" -> "A"
     */
    public void reverse() {
        // TODO: question 5
    }

    public boolean contains(Object o) {
        return indexOf(o) >= 0;
    }

    @Override
    public String toString() {
        // TODO: question 4
        int length = size - 1;
        if (length < 0) {
            return "[]";
        }
        StringBuilder s = new StringBuilder();
        s.append("[");
        for (int i = 0; i < length; i++) {
            s.append(get(i)).append(", ");
        }
        s.append(get(length)).append("]");
        return s.toString();
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
