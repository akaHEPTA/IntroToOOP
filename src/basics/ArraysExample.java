package basics;

import java.util.Arrays;

public class ArraysExample {
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 4, 5};
        // the length(size) of array
        System.out.println(arr1.length);

        // access elements in array
        System.out.println(arr1[0]);
        System.out.println(arr1.length - 1);

        // for-loop
        for (int i = 0; i < arr1.length; i++) {
            System.out.println(arr1[i]);
        }

        // change elements
        arr1[0] = 7;

        // for-each loop
        for (int elem: arr1) {
            System.out.println(elem);
        }

        // 2. create an array with the size
        // create a new array obj with size 10 - by default, it stores 10 zeros
        int [] arr2 = new int[10];

        System.out.println(arr2); // memory address
        System.out.println(Arrays.toString(arr2));

        String[] countries = {"Canada", "China"};
        countries[0] = "USA";

        for (String country: countries) {
            System.out.println(country);
        }


    }
}
