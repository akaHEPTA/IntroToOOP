package fridayexercises1.Week1.ForLoops;

import java.util.Scanner;

public class CountingMachine {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Count to: ");
        int to = in.nextInt();
        for (int i = 0; i < to; i++) {
            System.out.print(i + " ");
        }
        System.out.println(to);
    }
}
