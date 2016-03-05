package chess53;

public class Rook extends ChessPiece {
	private final char symbol = 'R';
	private boolean beenCastled;

	

	public Rook(int row, int column, char color) {
		super(row,column,color);
		this.beenCastled = false;
	}
	
	public char getSymbol(){
		return symbol;
	}
	
	public void setBeenCastled(boolean beenCastled){
		this.beenCastled = beenCastled;
	}
	
	public boolean getBeenCastled(){
		return beenCastled;
	}
	
}
