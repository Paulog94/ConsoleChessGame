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


}
