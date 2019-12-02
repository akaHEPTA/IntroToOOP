package miniproject2;

import java.util.Scanner;

public class InputController {

    public static String getOptionalInput(String prompt) {
        Scanner in = new Scanner(System.in);
        System.out.println(prompt);
        String userInput = in.nextLine();

        return userInput;
    }

    public static String getMandatoryInput(String prompt) {
        Scanner in = new Scanner(System.in);
        String userInput;
        while (true) {
            System.out.println(prompt);
            userInput = in.nextLine();
            if (userInput.isEmpty()) {
                System.out.println("You must enter this field.");
            } else {
                break;
            }
        }

        return userInput;
    }

    public static int getMandatoryInputAsInt(String prompt, int min, int max) {
        while (true) {
            String input = getMandatoryInput(prompt);
            try {
                int intInput = Integer.parseInt(input);
                if (intInput < min || intInput > max) {
                    System.out.printf("Invalid Input. Enter number between %d and %d.\n", min, max);
                    continue;
                }
                return intInput;
            } catch (NumberFormatException e) {
                System.out.println("Invalid Input. Please enter number.");
            }
        }
    }

    public static int getMandatoryInputAsInt(String prompt, int max) {
        return getMandatoryInputAsInt(prompt, 0, max);
    }
}
