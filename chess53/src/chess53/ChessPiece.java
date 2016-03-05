package chess53;

public class ChessPiece {
	private char color;
	private boolean hasMoved;
	private int row;
	private int column;
	private char symbol;
	
	public ChessPiece(int row, int column, char color){
		this.row = row;
		this.column = column;
		this.color = color;
		this.hasMoved = false;
	}
	
	public void setColor(char color){
		this.color = color;
	}
	public char getColor(){
		return this.color;
	}
	
	public void setHasMoved(boolean hm){
		this.hasMoved = hm;
	}
	public boolean getHasMoved(){
		return hasMoved;
	}

	public void setColumn(int column){
		this.column = column;
	}
	public int getColumn(){
		return column;
	}
	
	public void setRow(int row){
		this.row = row;
	}
	public int getRow(){
		return row;
	}
	
	public char getSymbol(){
		return this.symbol;
	}
	
}
