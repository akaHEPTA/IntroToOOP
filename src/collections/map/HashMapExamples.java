package collections.map;

import java.util.HashMap;
import java.util.Map;

public class HashMapExamples {
    public static void main(String[] args) {
        Map<String, String> acronyms = new HashMap<>();

        acronyms.put("Lol", "Laughing out loud");
        acronyms.put("Yolo", "You only live once");
        acronyms.put("Smh", "Shake my head");
        acronyms.put("STFU", "Shut The Fu*k Up");
        acronyms.put("Lmk", "Let me know");
        acronyms.put("Brb", "Be right back");
        acronyms.put("Lmao", "Laughing my ass off");

        System.out.println(acronyms.get("Lol"));
        System.out.println(acronyms.containsKey("Brb"));
        System.out.println(acronyms.size());

    }
}
