package basics;

public class StringExample {
    public static void main(String[] args) {
        // String - A sequence of characters (reference type)
        String name = "Derrick"; // string literal - stored on data segment when the execution
        String name1 = "Derrick";
        String name2 = new String("Derrick"); // stored on heap segment when the runtime
        String name3 = new String("Derrick");

        // == compares references (addresses)
        System.out.println(name == name1); // false - comparing references
        System.out.println(name2 == name3);
        // always use .equals() to compare string object!
        System.out.println(name.equals(name2)); // true - comparing contents


        String coffee = "Starbucks";

        // Get the length of string
        System.out.println(coffee.length());
        // Get the substring
        System.out.println(coffee.substring(0, 4));

        // Get the index of a string t
        String t = "bucks";
        System.out.println(coffee.indexOf(t));

        // for-loop to print all characters in string
        for (int i = 0; i < coffee.length(); i++) {
            System.out.println(coffee.substring(i, i+1)); // return String type
            System.out.println(coffee.charAt(i)); // return char type
        }

        for (char ch: coffee.toCharArray()) { // return char[]
            System.out.println(ch);
        }



    }
}
