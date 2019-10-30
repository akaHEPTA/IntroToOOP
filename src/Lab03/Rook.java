package Lab03;

public class Rook extends Piece {

    public Rook() {
        this.value = ROOK;
    }

    public Rook(boolean isWhite) {
        this.value = ROOK;
        this.isWhite = isWhite;
    }

    @Override
    protected void move() {
        System.out.println("Horizontally or vertically");
    }

    @Override
    public String toString() {
        return "Rook{value=" + value + ", isWhite=" + isWhite + '}';
    }

}
