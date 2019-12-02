package fridayexercises1.Week1.KeyboardInput;

import java.util.Scanner;

public class AgeInFiveYears {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Hello.  What is your name? ");

        String name = in.nextLine();
        System.out.print("\nHi, " + name + "!  How old are you? ");

        int age = in.nextInt();
        System.out.println("\nDid you know that in five years you will be " + (age + 5) + " years old?");
        System.out.println("And five years ago you were " + (age - 5) + "! Imagine that!");
    }
}
