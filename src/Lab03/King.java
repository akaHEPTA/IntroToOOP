package Lab03;

public class King extends Piece {

    public King() {
        this.value = KING;
    }

    public King(boolean isWhite) {
        this.value = KING;
        this.isWhite = isWhite;
    }

    @Override
    protected void move() {
        System.out.println("One square");
    }

    @Override
    public String toString() {
        return "King{value=" + value + ", isWhite=" + isWhite + '}';
    }

}
