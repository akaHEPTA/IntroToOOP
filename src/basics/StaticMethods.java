package basics;

import java.util.Arrays;

public class StaticMethods {
    public static void main(String[] args) {
        StaticMethods temp = new StaticMethods();
        temp.printCity("Victoria");

        printName("Vancouver");

        int x = 10;
        int y = 20;
        swap(x, y);

        int[] arr = {1, 2, 3};
        changeFirst2(arr);
        System.out.println(Arrays.toString(arr));
    }

    // pass by value type (primitive)
    public static void swap(Integer a, Integer b) {
        int temp = a;
        a = b;
        b = temp;
    }

    // pass by reference type (int[] -> reference)
    public static void changeFirst (int[] arr) {
        arr[0] = 100;
    }

    // pass by reference type (int[] -> reference)
    public static void changeFirst2 (int[] arr) {
        int[] arr1 = {100, 1, 2};
        arr = arr1;
    }

    // non-static (instance method)
    // we need to create an object to call this method
    public void printCity (String city) {
        System.out.println("Hello, " + city);
    }

    // method(function) prototype, header
    public static void printName(String name) {
        // public: means this method can be called from outside of this class.
        // static: means we can call this method without creating an object.
        // void: no return value
        // String name: a parameter (Type paramName, , , )

        System.out.println("Hello, " + name);

    }
}
