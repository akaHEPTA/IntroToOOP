package collections.exercise;

import java.util.LinkedList;
import java.util.Queue;

public class Stutter {
    public static Queue<Integer> stutter(Queue<Integer> q) {
        int size = q.size();

        for (int i = 0; i < size; i++) {
            q.add(q.peek());
            q.add(q.poll());
        }

        return q;
    }

    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<>();

        queue.add(1);
        queue.add(2);
        queue.add(3);
        queue.add(4);
        queue.add(5);
        queue.add(6);

        System.out.println(queue);
        System.out.println(stutter(queue));

    }


}
