package fridayexercises1.Week2.Arrays;

import java.util.Arrays;
import java.util.Collections;

public class FindingTheLargestValue {
    public static void main(String[] args) {
        Integer[] arr = new Integer[10];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * 100) + 1;
        }
        printArray(arr);
        int max = Collections.max(Arrays.asList(arr));
        System.out.println("\nThe largest value is " + max);

    }

    private static void printArray(Integer[] arr) {
        System.out.print("Array: ");
        int i = 0;
        for (; i < arr.length - 1; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println(arr[i]);
    }
}
