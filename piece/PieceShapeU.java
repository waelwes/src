package piece;

import java.awt.Color;

import game.FieldSquare;

public class PieceShapeU extends PieceShape {
    private static final Color COLOR = Color.ORANGE;
    private static final FieldSquare[][][] SHAPES = {
            {
                    { FieldSquare.PIECE, FieldSquare.EMPTY, FieldSquare.PIECE, FieldSquare.EMPTY },
                    { FieldSquare.PIECE, FieldSquare.EMPTY, FieldSquare.PIECE, FieldSquare.EMPTY },
                    { FieldSquare.PIECE, FieldSquare.PIECE, FieldSquare.PIECE, FieldSquare.EMPTY },
                    { FieldSquare.EMPTY, FieldSquare.EMPTY, FieldSquare.EMPTY, FieldSquare.EMPTY }
            },
            {
                    { FieldSquare.EMPTY, FieldSquare.EMPTY, FieldSquare.EMPTY, FieldSquare.EMPTY },
                    { FieldSquare.PIECE, FieldSquare.PIECE, FieldSquare.PIECE, FieldSquare.EMPTY },
                    { FieldSquare.EMPTY, FieldSquare.PIECE, FieldSquare.EMPTY, FieldSquare.EMPTY },
                    { FieldSquare.EMPTY, FieldSquare.EMPTY, FieldSquare.EMPTY, FieldSquare.EMPTY }
            },
            {
                    { FieldSquare.PIECE, FieldSquare.PIECE, FieldSquare.PIECE, FieldSquare.PIECE },
                    { FieldSquare.EMPTY, FieldSquare.EMPTY, FieldSquare.EMPTY, FieldSquare.EMPTY },
                    { FieldSquare.EMPTY, FieldSquare.EMPTY, FieldSquare.EMPTY, FieldSquare.EMPTY },
                    { FieldSquare.PIECE, FieldSquare.PIECE, FieldSquare.PIECE, FieldSquare.PIECE }
            },
            {
                    { FieldSquare.EMPTY, FieldSquare.PIECE, FieldSquare.EMPTY, FieldSquare.EMPTY },
                    { FieldSquare.PIECE, FieldSquare.PIECE, FieldSquare.PIECE, FieldSquare.EMPTY },
                    { FieldSquare.EMPTY, FieldSquare.EMPTY, FieldSquare.EMPTY, FieldSquare.EMPTY },
                    { FieldSquare.EMPTY, FieldSquare.EMPTY, FieldSquare.EMPTY, FieldSquare.EMPTY }

            },
    };

    public PieceShapeU() {
        super();
    }

    @Override
    public Color getColor() {
        return PieceShapeU.COLOR;
    }

    @Override
    protected FieldSquare[][][] getShapes() {
        return PieceShapeU.SHAPES;
    }
}
