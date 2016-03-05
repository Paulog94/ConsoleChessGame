package chess53;

public class Knight extends ChessPiece {
	private final char symbol = 'N';

	

	public Knight(int row, int column, char color) {
		super(row,column,color);
	}
	
	public char getSymbol(){
		return symbol;
	}

}
