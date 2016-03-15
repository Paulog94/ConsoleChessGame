package chess53;

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

}
