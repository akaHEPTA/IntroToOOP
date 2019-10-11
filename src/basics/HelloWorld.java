package basics;

import java.util.Scanner;
import java.util.concurrent.ExecutionException;

public class HelloWorld {
    Scanner myScan = null;

    public static void main(String[] args) {
        System.out.println("Hello world!");
        System.out.print("Bye!");
        System.out.print("Bye!");
        System.out.print("Bye!");
    }

    public int getInt() {
        myScan = new Scanner(System.in);
        int temp = 0;
        try {
            System.out.println("Input the integer value. ");
            temp = myScan.nextInt();
        } catch (Exception e) {
            System.out.println("Input value is not correct. Try it again.");
            myScan = new Scanner(System.in);
        }

        return temp;
    }

}

/*
Shortcuts for IntelliJ Idea
    psbm: public static void main
    sout: System.out.println()


Python - Interpreted language
Java - compiled language
     - source code -> Byte code
     - portable -> runs on JVM (Java Virtual Machine)

 */
