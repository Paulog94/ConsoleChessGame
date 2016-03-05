package chess53;

public class ChessSpace {
	
	private char color;
	private boolean isOccupied;
	private int column;
	private int row;
	//private char colorOn;
	private ChessPiece pieceOn;
	
	public ChessSpace (int row, int column, char color){
		this.color = color;
		this.column = column;
		this.row = row;
		this.isOccupied = false;
		//this.colorOn = 'n';
		this.pieceOn = null;
	}
	
	public ChessSpace (int row,int column, char color, char colorOn, ChessPiece pieceOn){
		this.color = color;
		this.column = column;
		this.row = row;
		this.isOccupied = true;
	//	this.colorOn = colorOn;
		this.pieceOn = pieceOn;
	}

	
	public void setColor(char color){
		this.color = color;
	}
	public char getColor(){
		return color;
	}
	
	public void setIsOccupied(boolean io){
		this.isOccupied = io;
	}
	public boolean getIsOccupied(){
		return isOccupied;
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
	
/*	public void setColorOn(char colorOn){
		this.colorOn = colorOn;
	}
	public char getColorOn(){
		return colorOn;
	}
*/
	public void setPieceOn(ChessPiece pieceOn){
		this.pieceOn = pieceOn;
	}
	public ChessPiece getPieceOn(){
		return pieceOn;
	}
	
}
