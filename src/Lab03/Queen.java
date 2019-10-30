package Lab03;

public class Queen extends Piece {

    public Queen() {
        this.value = QUEEN;
    }

    public Queen(boolean isWhite) {
        this.value = QUEEN;
        this.isWhite = isWhite;
    }

    @Override
    protected void move() {
        System.out.println("Like bishop and rook");
    }

    @Override
    public String toString() {
        return "Queen{value=" + value + ", isWhite=" + isWhite + '}';
    }

}
