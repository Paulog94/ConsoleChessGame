package chess53;

public class Queen extends ChessPiece {
	private final char symbol = 'Q';

	public Queen(int row, int column, char color) {
		super(row,column,color);
	}
	
	public char getSymbol(){
		return symbol;
	}

}
