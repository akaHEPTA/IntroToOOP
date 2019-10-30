package Lab03;

import java.util.ArrayList;

public class Driver {
    public static void main(String[] args) {
        ArrayList<Piece> pieces = new ArrayList<>();

        pieces.add(new Pawn());
        pieces.add(new Knight());
        pieces.add(new Bishop());
        pieces.add(new Rook());
        pieces.add(new Queen());
        pieces.add(new King());

        for (Piece piece : pieces)
            piece.move();

        Pawn p1 = new Pawn(true, true, new Queen());  // White promoted Queen
        Pawn p2 = new Pawn(true, false, null);  // White Pawn
        Pawn p3 = new Pawn(false, false, null);  // Black Pawn
        Pawn p4 = new Pawn(false, true, new Queen()); // Black promoted Queen
        Pawn p5 = new Pawn(true, true, new Knight()); // White promoted Knight

        System.out.println(p1.equals(p2));
        System.out.println(p1.equals(p4));
        System.out.println(p1.equals(p5));
        System.out.println(p2.equals(p3));
        System.out.println(p4.equals(p5));

    }
}
