package fridayexercises1.Week2.ArrayLists;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class GettingTheLargestValue {
    public static void main(String[] args) {
        ArrayList<Integer> al = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            al.add((int) (Math.random() * 100) + 1);
        }
        System.out.println("ArrayList: " + al);
        int max = Collections.max(al);
        System.out.println("\nThe largest value is " + max);
    }
}

