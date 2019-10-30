package interfaces.ex1;

public class Caravan implements Movable, Habitable {
    private int maxCapacity;
    // distance from 0 (home) to current location
    private int location;

    public Caravan(int maxCapacity) {
        this.maxCapacity = maxCapacity;
    }

    public Caravan(int maxCapacity, int location) {
        this.maxCapacity = maxCapacity;
        this.location = location;
    }

    @Override
    public void move(int distance) {
        location = location + distance;
    }

    @Override
    public boolean canMove() {
        return true;
    }

    @Override
    public boolean canFit(int inhabitants) {
        return inhabitants <= maxCapacity;
    }


}
