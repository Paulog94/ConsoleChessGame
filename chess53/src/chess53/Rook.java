package chess53;

/**
 *
 * King Piece Class
 * identifies movements that are valid to a specific King
 * Allows Castling
 *
 * @author Joshua Cross and Paulo Garcia
 */
public class Rook extends ChessPiece {
	private final char symbol = 'R';
	private boolean beenCastled;

	/**
	 * Initializes Rook Piece
	 *
	 * @param row initial row
	 * @param column initial column
	 * @param color team color
	 */
	public Rook(int row, int column, char color) {
		super(row,column,color);
		this.beenCastled = false;
	}

	/**
	 * Returns Symbol
	 * @return 'R'
	 */
	public char getSymbol(){
		return symbol;
	}


	public void setBeenCastled(boolean beenCastled){
		this.beenCastled = beenCastled;
	}

	public boolean getBeenCastled(){
		return beenCastled;
	}

	/**
	 * Validates Rook Movement
	 *
	 * @param row destination row
	 * @param column destination column
	 * @param cb board to check on
	 * @return true false
	 */
	public boolean isValid(int row, int column, ChessSpace[][] cb){

		int cR = super.getRow();
		int cC = super.getColumn();
		int dR = row;
		int dC = column;
		if((cR == dR ) || (cC == dC)){
			if (dR > cR){
				for(int i = (cR+1); i < dR; i++){
					if(cb[i][cC].getIsOccupied()){
						return false;
					}
				}
			}
			if (cR > dR){
				for(int i = (cR-1); i > dR; i--){
					if(cb[i][cC].getIsOccupied()){
						return false;
					}
				}	
			}
			if (dC > cC){
				for(int i = (cC+1); i < dC; i++){
					if(cb[cR][i].getIsOccupied()){
						return false;
					}
				}
			}
			if (cC > dC){
				for(int i = (cC-1); i > dC; i--){
					if(cb[cR][i].getIsOccupied()){
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
