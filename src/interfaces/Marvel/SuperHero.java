package interfaces.Marvel;

public abstract class SuperHero {
    private int strength;
    private int health;
    private String realName;

    public SuperHero(String realName) {
        this.strength = 100;
        this.health = 100;
        this.realName = realName;
    }

    public SuperHero(int strength, int health, String realName) {
        this.strength = strength;
        this.health = health;
        this.realName = realName;
    }

    public abstract void fight();
}
