package interfaces.ex1;

public class Car implements Movable {
    private int fuel;
    private String brand;

    public Car(String brand) {
        this.brand = brand;
    }

    public Car(int fuel, String brand) {
        this.fuel = fuel;
        this.brand = brand;
    }

    @Override
    public void move(int distance) {
        fuel -= distance / 2;
    }

    @Override
    public boolean canMove() {
        return fuel > 0;
    }
}
