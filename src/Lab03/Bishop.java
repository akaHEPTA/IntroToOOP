package Lab03;

public class Bishop extends Piece {

    public Bishop() {
        this.value = BISHOP;
    }

    public Bishop(boolean isWhite) {
        this.value = BISHOP;
        this.isWhite = isWhite;
    }

    @Override
    protected void move() {
        System.out.println("Diagonally");
    }

    @Override
    public String toString() {
        return "Bishop{value=" + value + ", isWhite=" + isWhite + '}';
    }

}
