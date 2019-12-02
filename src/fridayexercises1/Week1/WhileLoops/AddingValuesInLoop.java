package fridayexercises1.Week1.WhileLoops;

import java.util.Scanner;

public class AddingValuesInLoop {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("I will add up the numbers you give me.");

        int total = 0;
        while (true) {
            System.out.print("Number: ");
            int input = in.nextInt();
            if (input == 0) {
                break;
            }
            total += input;
            System.out.println("The total so far is " + total);
        }
        System.out.println("\nThe total is " + total + ".");
    }
}
