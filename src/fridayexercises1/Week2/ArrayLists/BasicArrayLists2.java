package fridayexercises1.Week2.ArrayLists;

import java.util.ArrayList;

public class BasicArrayLists2 {
    public static void main(String[] args) {
        ArrayList<Integer> al = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            al.add((int) (Math.random() * 100) + 1);
        }
        System.out.println("ArrayList: " + al);
    }
}
