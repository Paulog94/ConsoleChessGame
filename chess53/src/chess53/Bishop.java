package chess53;

/**
 * Bishop Class
 * Identifies the movement for the Bishop piece
 *
 * @author Joshua Cross and Paulo Garcia
 */
public class Bishop extends ChessPiece {
	private final char symbol = 'B';

	/**
	 * Initializes Bishop piece
	 *
	 * @param row starting row
	 * @param column starting column
	 * @param color starting team
	 */
	public Bishop(int row, int column, char color) {
		super(row,column,color);
	}

	/**
	 * Gets Symbol
	 * @return Symbol
	 */
	public char getSymbol(){
		return symbol;
	}

	/**
	 * Validates Bishop movement
	 *
	 * @param row destination row
	 * @param column destination column
	 * @param cb board to check
	 * @return true or false
	 */
	public boolean isValid(int row, int column, ChessSpace[][] cb){

		int cR = super.getRow();
		int cC = super.getColumn();
		int dR = row;
		int dC = column;
		if(Math.abs(cR - dR) == Math.abs(cC - dC)){
			if ((dR < cR) && (dC < cC)){
				for(int i = (cR-1), j = (cC -1); i > dR; i--, j--){
					if(cb[i][j].getIsOccupied()){
						return false;
					}
				}
			}
			if ((dR > cR) && (dC < cC)) {
				for(int i = (cR+1), j = (cC -1); i < dR; i++, j--){
					if(cb[i][j].getIsOccupied()){
						return false;
					}
				}	
			}
			if ((dR > cR) && (dC > cC)){
				for(int i = (cR+1), j = (cC +1); i < dR; i++, j++){
					if(cb[i][j].getIsOccupied()){
						return false;
					}
				}
			}
			if ((dR < cR) && (dC > cC)){
				for(int i = (cR-1), j = (cC +1); i > dR; i--, j++){
					if(cb[i][j].getIsOccupied()){
						return false;
					}
				}	
			}
			if((!cb[row][column].getIsOccupied()) ||
					(cb[row][column].getPieceOn().getColor() != super.getColor()))
				return true;
		}
		return false;
	}
}
