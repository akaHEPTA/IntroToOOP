package basics;

import java.sql.SQLOutput;
import java.util.Scanner;

public class IOExample {
    public static void main(String[] args) {
        // Write a program to say hello in each language!
        // en - English, br - Portuguese, mx - Spanish, cn - Chinese
        // ir - Farsi, jp - Japanese, kr - Korean, ph - Tagalog

        // Getting user input using Scanner
        // 1. Create a new Scanner Object

        Scanner myScanner = new Scanner(System.in);
        while (true) {
            System.out.println("Choose the language (en, br, mx, cn, ir, jp, kr, ph");
            String input = myScanner.nextLine();
            if (input.equals("en")) {
                System.out.println("Hello");
            } else if (input.equals("br")) {
                System.out.println("Oi");
            } else if (input.equals("mx")) {
                System.out.println("Hola");
            } else if (input.equals("cn")) {
                System.out.println("Nihao");
            } else if (input.equals("ir")) {
                System.out.println("Salam");
            } else if (input.equals("jp")) {
                System.out.println("Konnichiwa");
            } else if (input.equals("kr")) {
                System.out.println("Annyeong");
            } else if (input.equals("ph")) {
                System.out.println("hoy");
            }
        }
    }
}


