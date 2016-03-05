package chess53;

public class Bishop extends ChessPiece {
	private final char symbol = 'B';

	public Bishop(int row, int column, char color) {
		super(row,column,color);
	}
	
	public char getSymbol(){
		return symbol;
	}

}
