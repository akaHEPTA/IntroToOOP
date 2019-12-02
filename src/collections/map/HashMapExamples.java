package collections.map;

import java.util.HashMap;
import java.util.Map;

public class HashMapExamples {

    public static int hash(String acronym) {
        int h = 0;
        for (char ch : acronym.toCharArray()) {
            h += ch;
        }
        return h;
    }

    public static int hashFunction(String acronym) {
        int h = 0;
        for (char ch : acronym.toCharArray()) {
            h += ch;
        }
        return h & 7;
    }

    public static void main(String[] args) {

        Map<String, String> acronyms = new HashMap<>();
        acronyms.put("Lol", "Laughing out loud");
        acronyms.put("Yolo", "You only live once");
        acronyms.put("Smh", "Shake my head");
        acronyms.put("STFU", "Shut The Fxxx Up");
        acronyms.put("Lmk", "Let me know");
        acronyms.put("Brb", "Be right back");
        acronyms.put("Lmao", "Laughing my ass off");

        System.out.println(acronyms.get("Lol"));
        System.out.println(acronyms.containsKey("Brb"));
        System.out.println(acronyms.size());
    }
}












