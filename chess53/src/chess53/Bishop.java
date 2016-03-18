package chess53;

public class Bishop extends ChessPiece {
	private final char symbol = 'B';

	public Bishop(int row, int column, char color) {
		super(row,column,color);
	}
	
	public char getSymbol(){
		return symbol;
	}

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
