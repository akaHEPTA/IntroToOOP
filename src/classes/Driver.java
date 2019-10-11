package classes;

public class Driver {
    public static void main(String[] args) {
        // create a new instance(object)
        Pokemon pikachu = new Pokemon("Pikachu", "Electric", 55, 35);
        Pokemon mewtwo = new Pokemon("Mewtwo", "Psychic", 35, 50);
        Pokemon charizard = new Pokemon("Charizard", "Fire/Fly", 78, 80);
        Pokemon magikarp = null;
        magikarp = new Pokemon();

        System.out.println(charizard.name);
        System.out.println(charizard.type);

        pikachu.attack(mewtwo);
        System.out.println(mewtwo.healthPoint);
        pikachu.evolve();
        System.out.println(pikachu.healthPoint);



    }
}
