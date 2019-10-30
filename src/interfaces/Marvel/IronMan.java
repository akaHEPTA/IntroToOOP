package interfaces.Marvel;

public class IronMan extends SuperHero implements Flyable {
    private int numOfSuits;
    private int numOfGfs;

    public IronMan(int numOfGfs, int numOfSuits) {
        super("Tony Stark");
        this.numOfGfs = numOfGfs;
        this.numOfSuits = numOfSuits;
    }

    @Override
    public void fly(int distance) {
        numOfSuits -= distance;
    }

    @Override
    public void fight() {
        numOfGfs -= 1;
    }
}
