package finalStatic;

public class Driver {
    public static void main(String[] args) {
        System.out.println(Math.PI); // static variable;
        int max = Math.max(10, 20);
        System.out.println(max);

        // create an instance(object) of Math class.
        Math m1 = new Math("Canada");
        Math m2 = new Math("USA");
        // Math.PI = 3.15; // final (cannot change)

        // different memory
        System.out.println(m1.name);
        System.out.println(m2.name);

        // these are the same memory
        System.out.println(Math.PI);
        System.out.println(m1.PI);
        System.out.println(m2.PI);
    }
}
