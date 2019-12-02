package fridayexercises1.Week2.Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class WhereIsIt {
    public static void main(String[] args) {
        Integer[] arr = new Integer[10];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * 50) + 1;
        }
        printArray(arr);
        Scanner in = new Scanner(System.in);
        System.out.print("Value to find: ");
        int toFind = in.nextInt();
        int index = Arrays.asList(arr).lastIndexOf(toFind);
        if (index != -1) {
            System.out.println("\n" + toFind + " is in slot " + index);
        } else {
            System.out.println("\n" + toFind + " is not in the array.");
        }
        in.close();
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
