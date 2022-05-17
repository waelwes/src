package piece;

import java.util.Random;

import game.Game;

public final class PieceGenerator {
	private static final Random random = new Random();

	private PieceGenerator() {
	}

	public static Piece generatePiece(int x, int y) {
		int randomNumber = random.nextInt(8);

		if (randomNumber == 0) {
			return new Piece(x, y, new PieceShapeI());
		} else if (randomNumber == 1) {
			return new Piece(x, y, new PieceShapeJ());
		} else if (randomNumber == 2) {
			return new Piece(x, y, new PieceShapeL());
		} else if (randomNumber == 3) {
			return new Piece(x, y, new PieceShapeO());
		} else if (randomNumber == 4) {
			return new Piece(x, y, new PieceShapeS());
		} else if (randomNumber == 5) {
			return new Piece(x, y, new PieceShapeT());
		} else if (randomNumber == 6) {
			return new Piece(x, y, new PieceShapeZ());

		}else
			return new Piece(x, y, new PieceShapeU());





	}

		public static Piece generatePiece() {
			return generatePiece(Game.STARTING_PIECE_X, Game.STARTING_PIECE_Y);
		}
	}
