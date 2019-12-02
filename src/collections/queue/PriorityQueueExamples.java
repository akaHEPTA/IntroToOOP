package collections.queue;
import java.util.Iterator;
import java.util.PriorityQueue;
import java.util.Queue;

// LinkedList, HashTable(HashMap), PriorityQueue
public class PriorityQueueExamples {
    public static void main(String[] args) {
        Queue<String> pq = new PriorityQueue<>();
        pq.add("Java");
        pq.add("Python");
        pq.add("PHP");
        pq.add("Ruby");
        pq.add("C/C++");
        pq.add("JavaScript");
        pq.add("Go");
        pq.add("Lua");
        pq.add("ArnoldC");

        // Collections.reverse(pq); (x)
        // PQ -> Binary Heap
        while (!pq.isEmpty()) {
            // poll or remove: O(log n)
            System.out.println(pq.poll());
        }

        // Iterator (Cursor)
        Iterator<String> cursor = pq.iterator();
        while (cursor.hasNext()) {
            System.out.println(cursor.next());
        }

        Object[] arr = pq.toArray();
        for (Object lang: arr) {
            System.out.println((String) lang);
        }

        Student dan = new Student("Dan", (int) (Math.random() * 100));
        Student douglas = new Student("Douglas", (int) (Math.random() * 100));
        Student bianca = new Student("Bianca", (int) (Math.random() * 100));
        Student tae = new Student("Tae", (int) (Math.random() * 100));
        Student anzus = new Student("Anzus", (int) (Math.random() * 100));

        PriorityQueue<Student> students = new PriorityQueue<>();
        students.add(dan);
        students.add(douglas);
        students.add(bianca);
        students.add(tae);
        students.add(anzus);

        while (!students.isEmpty()) {
            System.out.println(students.poll());
        }

    }
}
