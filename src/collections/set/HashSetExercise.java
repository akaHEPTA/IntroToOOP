package collections.set;

import java.util.*;
import java.util.stream.Collectors;

public class HashSetExercise {
    public static void main(String[] args) {
    }

    public static void usingHashSetSolution1() {
        /* we do not need to validate input because of the input spec */
        Scanner in = new Scanner(System.in);
        int year = in.nextInt();
        in.nextLine(); // consume newline character
        for (int y = year + 1; y < 10235; ++y) {
            String strYear = String.valueOf(y);
            Set<Character> setYear = new HashSet<>();
            for (Character ch: strYear.toCharArray()) {
                if (!setYear.add(ch)) {
                    break;
                }
            }
            if (strYear.length() == setYear.size()) {
                System.out.println(strYear);
                break;
            }
        }
        in.close();
    }

    public static void usingStreamSetSolution2() {
        /* we do not need to validate input because of the input spec */
        Scanner in = new Scanner(System.in);
        int year = in.nextInt();
        in.nextLine(); // consume newline character
        for (int y = year + 1; y < 10235; ++y) {
            String strYear = String.valueOf(y);
            /* using java stream API (you can do this without using stream) */
            Set<Character> setYear = strYear.chars().mapToObj(ch -> (char) ch)
                    .collect(Collectors.toSet());
            if (strYear.length() == setYear.size()) {
                System.out.println(strYear);
                break;
            }
        }
        in.close();
    }
}
