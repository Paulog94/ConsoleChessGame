package chess53;

public class Pawn extends ChessPiece {
	private final char symbol = 'p';

	

	public Pawn(int row, int column, char color) {
		super(row,column,color);

	}
	
	public char getSymbol(){
		return symbol;
	}

	@Override
	public boolean isValid(int row, int column, ChessSpace[][] cb){

		if(eatPiece(row,column,cb))
			return true;

		else if(movePawn(row,column,cb))
				return true;

		return false;
	}

	//Pawns movement for eating opponent pieces
	public boolean eatPiece(int row, int column, ChessSpace[][] cb){
		if(		(super.getColor()=='w' && row == (super.getRow()+1)) ||
				(super.getColor()=='b' && row == (super.getRow()-1)) ) {

			int C1 = Math.abs(super.getColumn()-column);
			int R1 = Math.abs(super.getRow()- row);

			if( (C1==1 && R1==1) && cb[row][column].getIsOccupied() &&
					cb[row][column].getPieceOn().getColor()!=super.getColor()) {
				return true;
			}
			else
			if((R1 == 1 && C1 == 0) && !cb[row][column].getIsOccupied()){
				return true;
			}

		}
		return false;
	}

	//Pawns movement for double move
	public boolean movePawn(int row, int column, ChessSpace[][] cb){
		if(		((super.getColor()=='w' && row > super.getRow() ) ||
				(super.getColor()=='b' && row < super.getRow() )) &&
				!cb[row][column].getIsOccupied()) {

			if (!super.getHasMoved()) {
				if (super.getColumn() == column && (Math.abs(super.getRow() - row) == 2)){
					if( (super.getColor()== 'w' && !(cb[super.getRow()+1][column].getIsOccupied()))){
						return true;
					}
					if(	(super.getColor()== 'b' && !(cb[super.getRow()-1][column].getIsOccupied()))) {
						return true;
					}
				}
			}
			else if ((super.getColor() == 'w' && super.getColumn() == column && row - super.getRow() == 1) ||
					(super.getColor() == 'b' && super.getColumn() == column && super.getRow() - row == 1)) {
				return true;
			}
		}

		return false;
	}

}
