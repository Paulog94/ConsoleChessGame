package chess53;

public class Pawn extends ChessPiece {
	private final char symbol = 'p';
	private boolean doubleFirstMove;
	private boolean promoted;
	

	public Pawn(int row, int column, char color) {
		super(row,column,color);
		this.doubleFirstMove = false;
		this.promoted = false;
	}
	
	public char getSymbol(){
		return symbol;
	}
	
	public void setDoubleFirstMove(boolean dfm){
		this.doubleFirstMove = dfm;
	}
	
	public boolean getDoubleFirstMove(){
		return doubleFirstMove;
	}
	
	public void setPromoted(boolean promoted){
		this.promoted = promoted;
	}
	
	public boolean getPromoted(){
		return promoted;
	}


	@Override
	public boolean isValid(int column, int row, ChessSpace[][] cb){


		//Implements eating opponent pieces
		//-----------------------------------------------------------------------------------------
		if(		(super.getColor()=='w' && column == (super.getColumn()+1)) ||
				(super.getColor()=='b' && column == (super.getColumn()-1)) ) {

			int C1 = Math.abs(super.getColumn()-column);
			int R1 = Math.abs(super.getRow()- row);

			if( (C1==1 && R1==1) && cb[column][row].getIsOccupied() &&
					cb[column][row].getPieceOn().getColor()!=super.getColor()) {
				return true;
			}
			else
				if((R1 == 0 && C1 == 1) && !cb[column][row].getIsOccupied()){
					return true;
				}

		}
		else
		//-----------------------------------------------------------------------------------------
			if(		(super.getColor()=='w' && column > super.getColumn()) ||
					(super.getColor()=='b' && column < super.getColumn()) ) {

				if (!super.getHasMoved()) {
					if (super.getRow() == row && (Math.abs(super.getColumn() - column) <= 2 && Math.abs(super.getColumn() - column) > 0))
						return true;
				} else if ((super.getColor() == 'w' && super.getRow() == row && column - super.getColumn() == 1) ||
						(super.getColor() == 'b' && super.getRow() == row && super.getColumn() - column == 1)) {
					return true;
				}
			}

		return false;
	}


}
