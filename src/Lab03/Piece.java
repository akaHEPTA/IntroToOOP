package Lab03;

public abstract class Piece {
    // Constants
    protected static final int PAWN = 1;
    protected static final int KNIGHT = 2;
    protected static final int BISHOP = 3;
    protected static final int ROOK = 5;
    protected static final int QUEEN = 9;
    protected static final int KING = 1000;

    // Fields
    protected int value;
    protected boolean isWhite;

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    // Methods
    protected abstract void move();

    @Override
    public String toString() {
        return "Piece{value=" + value + ", isWhite=" + isWhite + '}';
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Piece) {
            return this.value == ((Piece) obj).value && this.isWhite == ((Piece) obj).isWhite;
        } else {
            return false;
        }
    }
}
