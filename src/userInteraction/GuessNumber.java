package userInteraction;

import java.util.Random;
import java.util.Scanner;

public class GuessNumber {
    public static void main(String[] args) {
        // Math.random() : returns double from 0.0 to 1.0
        // 1. generate a random number from 1 to 100
        int magicNumber = (int) (Math.random() * 100) + 1; // 1.0 <=   < 101.0
        boolean correct = false;
        System.out.println("I have generated a random number between 1 to 100");

        // 2. create a Scanner object to get user input.
        Scanner in = new Scanner(System.in);
        for (int i = 10; i > 0; i--) {
            System.out.println("You have " + i + " guess(es) left.");
            int input = in.nextInt(); // get user input as int
            if (magicNumber == input) {
                correct = true;
                break;
            } else if (magicNumber > input) {
                System.out.println("The magic number is greater than " + input);
            } else {
                System.out.println("The magic number is less than " + input);
            }
        }

        if (correct) {
            System.out.println("Correct! The magic number is " + magicNumber);
        } else {
            System.out.println("Game over... You failed!");
            System.out.println("The magic number was " + magicNumber);
        }


    }
}
