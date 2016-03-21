package chess53;

/**
 * Chess Space class
 * Contains a row, column used for a ChessBoard
 * May contain a ChessPiece
 * Information used to draw a board
 *
 * @author Joshua Cross and Paulo Garcia
 */
public class ChessSpace {
	
	private char color;
	private boolean isOccupied;
	private int column;
	private int row;
	//private char colorOn;
	private ChessPiece pieceOn;

	/**
	 * Initializes a Chess Space (Without a Piece on)
	 *
	 * @param row row
	 * @param column column
	 * @param color space color
	 */
	public ChessSpace (int row, int column, char color){
		this.color = color;
		this.column = column;
		this.row = row;
		this.isOccupied = false;
		//this.colorOn = 'n';
		this.pieceOn = null;
	}

	/**
	 * Initializes a Chess Space (With a Piece on)
	 * @param row row
	 * @param column column
	 * @param color space color
	 * @param pieceOn Chess Piece
	 */
	public ChessSpace (int row,int column, char color, ChessPiece pieceOn){
		this.color = color;
		this.column = column;
		this.row = row;
		this.isOccupied = true;
	//	this.colorOn = colorOn;
		this.pieceOn = pieceOn;
	}

	/**
	 * Sets Space color
	 * @param color
	 */
	public void setColor(char color){
		this.color = color;
	}

	/**
	 * gets color
	 * @return space color
	 */
	public char getColor(){
		return color;
	}

	/**
	 * Lets User set if there is a piece on the chess Space
	 * @param io true or false
	 */
	public void setIsOccupied(boolean io){
		this.isOccupied = io;
	}

	/**
	 * Lets User know if there is a piece on the Chess Space
	 * @return true false
	 */
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

	/**
	 * Sets a Chess Piece on this Chess Space
	 * @param pieceOn Piece that needs to be set to this space
	 */
	public void setPieceOn(ChessPiece pieceOn){
		this.pieceOn = pieceOn;
	}

	/**
	 * Returns Piece that is set on this Chess Space
	 * @return Piece on space
	 */
	public ChessPiece getPieceOn(){
		return pieceOn;
	}
	
}
