package chess53;

public class Queen extends ChessPiece {
	private final char symbol = 'Q';

	public Queen(int row, int column, char color) {
		super(row,column,color);
	}
	
	public char getSymbol(){
		return symbol;
	}

	public boolean isValid(int column, int row, ChessSpace[][] cb){

		int cR = super.getRow();
		int cC = super.getColumn();
		int dR = row;
		int dC = column;
		if((Math.abs(cR - dR) == Math.abs(cC - dC))|| ((cR == dR ) || (cC == dC))){
			if ((dR > cR)&&(dC == cC)){
				for(int i = (cR+1); i < dR; i++){
					if(cb[i][cC].getIsOccupied()){
						return false;
					}
				}
			}
			if ((cR > dR) && (cC == dC)){
				for(int i = (cR-1); i > dR; i--){
					if(cb[i][cC].getIsOccupied()){
						return false;
					}
				}	
			}
			if ((dC > cC) && (dR == cR)){
				for(int i = (cC+1); i < dC; i++){
					if(cb[cR][i].getIsOccupied()){
						return false;
					}
				}
			}
			if ((cC > dC) && (dR == cR)){
				for(int i = (cC-1); i > dC; i--){
					if(cb[cR][i].getIsOccupied()){
						return false;
					}
				}	
			}
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
