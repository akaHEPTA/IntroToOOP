package collections.set;

import java.util.HashSet;

public class HashSetExamples {
    public static void main(String[] args) {
        // Hash Table -> HashMap (HashSet)
        HashSet<String> food = new HashSet<>();
        food.add("Sushi");
        food.add("Sashimi");
        food.add("Pizza");
        food.add("Japadog");
        food.add("Sushi");
        System.out.println(food.size());

        HashSet<String> food2 = new HashSet<>();
        food2.add("Pizza");
        food2.add("Pasta");
        food2.add("Sushi");
        food2.add("Taco");
        food2.add("Burrito");
        food2.add("Nachos");
        food2.add("Feijoada");
        food2.add("Coxinha");
//        food.addAll(food2);
//        food.retainAll(food2); // common

        System.out.println(food);
        System.out.println(food.contains("Sushi"));
    }
}
