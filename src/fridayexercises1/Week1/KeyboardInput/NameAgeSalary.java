package fridayexercises1.Week1.KeyboardInput;

import java.util.Scanner;

public class NameAgeSalary {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Hello. What is your name?");

        String name = in.nextLine();
        System.out.println("\nHi, " + name + "!  " + "How old are you?");

        int age = in.nextInt();
        System.out.printf("\nSo you're %d, eh?  That's not old at all!\n" +
                "How much do you make, %s?\n", age, name);

        double wage = in.nextDouble();
        System.out.printf("\n%.1f!  I hope that's per hour and not per year! LOL!\n", wage);
    }
}
