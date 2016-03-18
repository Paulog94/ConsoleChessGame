package chess53;

public class Knight extends ChessPiece {
	private final char symbol = 'N';

	public Knight(int row, int column, char color) {
		super(row,column,color);
	}
	
	public char getSymbol(){
		return symbol;
	}

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
