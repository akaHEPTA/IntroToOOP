package Lab03;

public class Pawn extends Piece {

    boolean promoted = false;
    Piece newPiece;

    public Pawn() {
        this.value = PAWN;
    }

    public Pawn(boolean isWhite, boolean promoted, Piece newPiece) {
        this.value = PAWN;
        this.isWhite = isWhite;
        this.promoted = promoted;
        this.newPiece = newPiece;
    }

    public void promote(Piece newPiece) {
        promoted = true;
        this.newPiece = newPiece;
        this.newPiece.isWhite = this.isWhite;
    }

    @Override
    protected void move() {
        System.out.println("Forward 1");
    }

    @Override
    public String toString() {
        return "Pawn{value=" + value + ", isWhite=" + isWhite + '}';
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Pawn) { // 폰 객체인지 먼저 확인
            if (this.newPiece != null && ((Pawn) obj).newPiece != null) {
                return this.isWhite == ((Pawn) obj).isWhite
                        && this.newPiece.value == ((Pawn) obj).newPiece.value;
            } else {
                return this.isWhite == ((Pawn) obj).isWhite
                        && this.promoted == ((Pawn) obj).promoted;
            }
        } else {
            return false;
        }
    }
}
