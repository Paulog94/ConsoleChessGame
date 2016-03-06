package chess53;

public class King extends ChessPiece {
	private final char symbol = 'K';

	public King(int row, int column, char color) {
		super(row,column,color);
	}
	
	public char getSymbol(){
		return symbol;
	}

}
