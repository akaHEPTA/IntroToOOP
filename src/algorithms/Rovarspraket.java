package algorithms;

import java.util.Scanner;

public class Rovarspraket {
    public static void main(String[] args) {
        // get input word
        Scanner in = new Scanner(System.in);
        String word = in.nextLine();
        String consonants     = "bcdfghjklmnpqrstvwxyz";
        String closetVowels   = "aaeeeiiiiooooouuuuuuu";
        String nextConsonants = "cdfghjklmnpqrstvwxyzz";

        String converted = "";
        // Time Complexity: 21 * n => O(n)
        for(int i = 0; i < word.length(); i++) {
            char currentLetter = word.charAt(i);
            // ".contains()"
            if (!consonants.contains(currentLetter + "")) {
                converted += currentLetter;
            } else {
                // consonant: itself + closest vowel + next consonant
                // "indexOf()"
                converted += currentLetter;
                int index = consonants.indexOf(currentLetter);
                converted += closetVowels.charAt(index);
                converted += nextConsonants.charAt(index);
            }
        }
        System.out.println(converted);
        // rules:
        //  - if the char is consonant
        //     - replace by three letters (itself + 'closest vowel' + 'next' consonant)
        //  - if the char is vowel
        //     - nothing (itself)
        // ex) joy -> jikoyuz
        //       ^
        //     j: j + i + k
        //     o: o
        //     y: y + u + z

        // ex) ham -> hijamon
        //     ^
        //     h: h + i + j
        //     a: a
        //     m: m + o + n

    }
}
