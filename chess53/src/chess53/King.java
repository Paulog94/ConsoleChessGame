package chess53;

//import com.sun.rowset.internal.Row;

public class King extends ChessPiece {
	private final char symbol = 'K';
	public King(int row, int column, char color) {
		super(row,column,color);
	}
	
	public char getSymbol(){
		return symbol;
	}

	@Override
	public boolean isValid(int row, int column, ChessSpace[][] cb){

		int C1 = Math.abs(super.getColumn()-column);
		int R1 = Math.abs(super.getRow()- row);

		//Checks if the King Has moved before
		if(!super.getHasMoved() && !super.isChecked()){

			//Checks for CastleQueenSide
			if((R1 == 0 && column == 2) &&
					cb[row][0].getPieceOn().getSymbol() == 'R' &&
					cb[row][0].getPieceOn().getColor()==super.getColor() &&
					!cb[row][0].getPieceOn().getHasMoved() &&
					!cb[row][1].getIsOccupied() &&
					!cb[row][2].getIsOccupied() &&
					!cb[row][3].getIsOccupied()){

				CastleQueenSide(row,cb);
				return true;

			}
			//Checks for CastleKingSide
			else
			if((R1 == 0 && column == 6) &&
					cb[row][7].getPieceOn().getSymbol() == 'R' &&
					cb[row][7].getPieceOn().getColor()==super.getColor() &&
					!cb[row][7].getPieceOn().getHasMoved() &&
					!cb[row][6].getIsOccupied() &&
					!cb[row][5].getIsOccupied()){

				CastleKingsSide(row,cb);
				return true;

			}
			else
			if((R1 == 0 && C1 ==1)||(R1 == 1 && C1 ==0)||(R1 == 1 && C1 ==1)){

				if(!cb[row][column].getIsOccupied()){
					return true;
				}
				else
					if(cb[row][column].getColor() != super.getColor()){
						return true;
					}
			}
		}
		else
			//Logic for a King's movement for 1 space at a time
		if((R1 == 0 && C1 ==1)||(R1 == 1 && C1 ==0)||(R1 == 1 && C1 ==1)){

			if(!cb[row][column].getIsOccupied()){
				return true;
			}
			else
			if(cb[row][column].getColor() != super.getColor()){
				return true;
			}
		}

		return false;
	}

	public void CastleQueenSide(int row, ChessSpace[][] chessBoard){
		chessBoard[row][3].setPieceOn(chessBoard[row][0].getPieceOn());
		chessBoard[row][3].setIsOccupied(true);
		chessBoard[row][3].getPieceOn().setHasMoved(true);
		chessBoard[row][3].getPieceOn().setPosition(row,3);

		chessBoard[row][0].setPieceOn(null);
		chessBoard[row][0].setIsOccupied(false);
	}

	public void CastleKingsSide(int row, ChessSpace[][] chessBoard){
		chessBoard[row][5].setPieceOn(chessBoard[row][7].getPieceOn());
		chessBoard[row][5].setIsOccupied(true);
		chessBoard[row][5].getPieceOn().setHasMoved(true);
		chessBoard[row][5].getPieceOn().setPosition(row,5);

		chessBoard[row][7].setPieceOn(null);
		chessBoard[row][7].setIsOccupied(false);
	}

}
