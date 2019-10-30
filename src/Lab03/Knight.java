package Lab03;

public class Knight extends Piece {

    public Knight() {
        this.value = KNIGHT;
    }

    public Knight(boolean isWhite) {
        this.value = KNIGHT;
        this.isWhite = isWhite;
    }

    @Override
    protected void move() {
        System.out.println("Like an L");
    }

    @Override
    public String toString() {
        return "Knight{value=" + value + ", isWhite=" + isWhite + '}';
    }

}
