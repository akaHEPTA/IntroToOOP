package collections.list;

import java.util.LinkedList;

public class LinkedListExamples {
    public static void main(String[] args) {
        MySinglyLinkedList<String> ll = new MySinglyLinkedList<>();
        System.out.println(ll);
        ll.addLast("Gucci");
        ll.addLast("Louis Vuitton");
        ll.addLast("Dior");
        ll.addLast("Hermes");
        ll.addLast("Chanel");
        ll.addLast("Versace");
        ll.addLast("Dolce & Gabanna");
        System.out.println(ll);
        ll.removeFirst();
        ll.removeLast();
        printLinkedList(ll);

        LinkedList<String> javaLl = new LinkedList<>();
        javaLl.addLast("Nike");
        javaLl.addLast("Adidas");
        javaLl.addLast("Under Armour");
        javaLl.addLast("Fake Supreme");
        javaLl.addLast("H&M");
        javaLl.addLast("Uniqlo"); // Unique Clothing
        javaLl.addFirst("Hollister");
        javaLl.addFirst("Zara");
        System.out.println(javaLl);
    }

    private static <E> void printLinkedList(MySinglyLinkedList<E> ll) {
        int length = ll.size() - 1;
        for (int i = 0; i < length; i++) {
            System.out.print(ll.get(i) + " -> ");
        }
        System.out.println(ll.getLast());
    }
}
