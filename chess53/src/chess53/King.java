package chess53;

import com.sun.rowset.internal.Row;

public class King extends ChessPiece {
	private final char symbol = 'K';
	private boolean castleKingSide;
	private boolean castleQueensSide;
	public King(int row, int column, char color) {
		super(row,column,color);
	}
	
	public char getSymbol(){
		return symbol;
	}

	@Override
	public boolean isValid(int column, int row, ChessSpace[][] cb){

		int C1 = Math.abs(super.getColumn()-column);
		int R1 = Math.abs(super.getRow()- row);

		//Checks if the King Has moved before
		if(!super.getHasMoved() && !super.isChecked()){
			if((C1 == 0 && row == 2) &&
					cb[column][0].getPieceOn().getSymbol() == 'R' &&
					cb[column][0].getPieceOn().getColor()==super.getColor() &&
					!cb[column][0].getPieceOn().getHasMoved() &&
					!cb[column][1].getIsOccupied() &&
					!cb[column][2].getIsOccupied() &&
					!cb[column][3].getIsOccupied()){

				CastleQueenSide(column,cb);
				return true;

			}
			else
			if((C1 == 0 && row == 6) &&
					cb[column][7].getPieceOn().getSymbol() == 'R' &&
					cb[column][7].getPieceOn().getColor()==super.getColor() &&
					!cb[column][7].getPieceOn().getHasMoved() &&
					!cb[column][6].getIsOccupied() &&
					!cb[column][5].getIsOccupied()){

				CastleKingsSide(column,cb);
				return true;

			}
			else
			if((R1 == 0 && C1 ==1)||(R1 == 1 && C1 ==0)||(R1 == 1 && C1 ==1)){

				if(!cb[column][row].getIsOccupied()){
					return true;
				}
				else
					if(cb[column][row].getColor() != super.getColor()){
						return true;
					}
			}
		}
		else
			//Logic for a King's movement for 1 space at a time
		if((R1 == 0 && C1 ==1)||(R1 == 1 && C1 ==0)||(R1 == 1 && C1 ==1)){

			if(!cb[column][row].getIsOccupied()){
				return true;
			}
			else
			if(cb[column][row].getColor() != super.getColor()){
				return true;
			}
		}

		return false;
	}
	public void CastleQueenSide(int column, ChessSpace[][] chessBoard){
		chessBoard[column][3].setPieceOn(chessBoard[column][0].getPieceOn());
		chessBoard[column][3].setIsOccupied(true);
		chessBoard[column][3].getPieceOn().setHasMoved(true);

		chessBoard[column][0].setPieceOn(null);
		chessBoard[column][0].setIsOccupied(false);
	}

	public void CastleKingsSide(int column, ChessSpace[][] chessBoard){
		chessBoard[column][5].setPieceOn(chessBoard[column][7].getPieceOn());
		chessBoard[column][5].setIsOccupied(true);
		chessBoard[column][5].getPieceOn().setHasMoved(true);

		chessBoard[column][7].setPieceOn(null);
		chessBoard[column][7].setIsOccupied(false);
	}

}
