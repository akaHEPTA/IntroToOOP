package collections.queue;

import java.util.*;

public class QueueExample {

    /**
     * Write a function stutter that accepts a queue of integers
     * and replaces every element with two copies of itself
     *
     * [1, 2, 3] becomes [1, 1, 2, 2, 3, 3]
     * @param q
     */
    public static void stutter(Queue<Integer> q) {
        int length = q.size();
        for (int i = 0; i < length; ++i) {
            Integer elem = q.poll();
            q.offer(elem);
            q.offer(elem);
        }
    }

    /**
     * Write a function mirror that accepts a queue of strings and
     * appends the queue's contents to itself in reverse order.
     *
     * ["a", "b", "c"] becomes ["a", "b", "c", "c", "b", "a"]
     * @param q
     */
    public static void mirror(Queue<String> q) {
        Deque<String> stack = new ArrayDeque<>();
        int length = q.size();
        while (length --> 0) {
            String elem = q.poll();
            q.offer(elem);
            stack.push(elem);
        }
        while (!stack.isEmpty()) {
            q.offer(stack.pop());
        }
    }

    public static void main(String[] args) {
        Queue<Integer> myQueue = new LinkedList<>();
        for (int i = 0; i <= 6; i++) {
            myQueue.add(i);
        }
        for (int i = 0; i < myQueue.size(); i++) {
            System.out.print(myQueue.poll() + " ");
        }
        System.out.println(myQueue + " size: " + myQueue.size());

        Deque<String> q = new ArrayDeque<>(Arrays.asList("a", "b", "c"));
        mirror(q);
        System.out.println(q);
    }
}
