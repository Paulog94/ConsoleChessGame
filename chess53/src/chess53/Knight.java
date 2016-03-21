package chess53;

/**
 *
 * Knight Piece Class
 * Identifies movements that are valid to a specific Knight
 *
 * @author Joshua Cross and Paulo Garcia
 */
public class Knight extends ChessPiece {
	private final char symbol = 'N';

	/**
	 * Constructs Knight
	 *
	 * @param row Starting row
	 * @param column Starting column
	 * @param color Team
	 */
	public Knight(int row, int column, char color) {
		super(row,column,color);
	}

	/**
	 * Gets symbol
	 *
	 * @return symbol
	 */
	public char getSymbol(){
		return symbol;
	}

	/**
	 * Validates movement according to this Knight piece
	 *
	 * @param row destination row
	 * @param column destination column
	 * @param cb board to use
	 * @return if move is valid
	 */
	@Override
	public boolean isValid(int row, int column, ChessSpace[][] cb){

		int R = Math.abs((super.getRow()-row));
		int C = Math.abs((super.getColumn()-column));

		if((R == 1 && C == 2) || (R == 2 && C == 1)){

			if((!cb[row][column].getIsOccupied()) ||
					(cb[row][column].getPieceOn().getColor() != super.getColor()))
				return true;
		}

		return false;
	}

}
