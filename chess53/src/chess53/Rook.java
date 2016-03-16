package chess53;

public class Rook extends ChessPiece {
	private final char symbol = 'R';
	private boolean beenCastled;



	public Rook(int row, int column, char color) {
		super(row,column,color);
		this.beenCastled = false;
	}

	public char getSymbol(){
		return symbol;
	}

	public void setBeenCastled(boolean beenCastled){
		this.beenCastled = beenCastled;
	}

	public boolean getBeenCastled(){
		return beenCastled;
	}

	public boolean isValid(int column, int row, ChessSpace[][] cb){

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
