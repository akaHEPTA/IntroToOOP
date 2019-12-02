package fridayexercises1.Week1.IfStatements;

import java.util.Scanner;

public class HowOldAreYouSpecifically {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Hey, what's your name? (Sorry, I keep forgetting.) ");

        String name = in.nextLine();
        System.out.print("Ok, " + name + ", how old are you? ");

        int age = in.nextInt();
        String message;
        if (age < 16) {
            message = "You can't drive";
        } else if (age < 18) {
            message = "You can drive but not vote";
        } else if (age < 25) {
            message = "You can vote but not rent a car";
        } else {
            message = "You can do pretty much anything";
        }
        System.out.println("\n" + message + ", " + name + ".");
    }
}
