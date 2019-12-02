package fridayexercises1.Week2.Arrays;

import java.util.Arrays;

public class CopyingArrays {
    public static void main(String[] args) {
        int[] arr = new int[10];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * 100) + 1;
        }

        int[] copiedArr = Arrays.copyOf(arr, arr.length);
        arr[arr.length - 1] = -7;

        printArray(arr, 1);
        printArray(copiedArr, 2);
    }

    private static void printArray(int[] arr, int num) {
        System.out.print("Array " + num + ": ");
        int i = 0;
        for (; i < arr.length - 1; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println(arr[i]);
    }
}
