package collections.list2;

public class LinkedListExamples {
    public static void main(String[] args) {
        MySinglyLinkedList<String> ll = new MySinglyLinkedList<>();
        ll.addLast("Gucci");
        ll.addLast("Louis Vuitton");
        ll.addLast("Dior");
        ll.addLast("Hermes");
        ll.addLast("Chanel");
        ll.addLast("Versace");
        ll.addLast("Dolce & Gabanna");
        printLinkedList(ll);
        System.out.println(ll.size());
        ll.remove(3);
        printLinkedList(ll);
        System.out.println(ll.size());

    }

    private static <E> void printLinkedList(MySinglyLinkedList<E> ll) {
        int length = ll.size() - 1;
        for (int i = 0; i < length; i++) {
            System.out.print(ll.get(i) + " -> ");
        }
        System.out.println(ll.getLast());
    }
}
