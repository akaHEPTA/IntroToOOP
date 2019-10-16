package userInteraction;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class WordCounter {
    public static void main(String[] args) { // throws FileNotFoundException {
        int wordCounter = 0;

        try {
            File myFile = new File("vancouver.txt");
            Scanner myScan = new Scanner(myFile);

            while (myScan.hasNextLine()) {
                String line = myScan.nextLine();
                // "Hello World".split(" ") -> arr {"Hello", "World"}
                wordCounter += line.split(" ").length;
            }

            System.out.println("The file contains " + wordCounter + " words.");

        } catch (FileNotFoundException e) {
            System.out.println(e.getLocalizedMessage());
            System.out.println("File not found!");
        }

    }

}
