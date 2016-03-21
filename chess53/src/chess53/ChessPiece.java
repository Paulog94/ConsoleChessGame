package chess53;

/**
 * Parent Class for all Chess Pieces
 *
 * @author Joshua Cross and Paulo Garcia
 */
public class ChessPiece {
	private char color;
	private boolean hasMoved = false;
	private int row;
	private int column;
	private char symbol;
	private boolean check = false;
	private boolean captured = false;
	private int turnMoved;

	/**
	 * Initializes Chess Piece
	 * @param row initial row
	 * @param column initial column
	 * @param color 'b' or 'w'
	 */
	public ChessPiece(int row, int column, char color){
		this.row = row;
		this.column = column;
		this.color = color;
		this.hasMoved = false;
		this.captured = false;
	}

	/**
	 * Sets if the Piece can be eaten by a Piece
	 * on the other team
	 * @param c true or false
	 */
	public void setCheck(boolean c){this.check = c;}

	/**
	 * Returns if the piece can be eaten
	 * @return true false
	 */
	public boolean isChecked(){return this.check;}

	/**
	 * Set team color for the piece
	 * @param color 'b' or 'w'
	 */
	public void setColor(char color){
		this.color = color;
	}

	/**
	 * Returns Team color for the Piece
	 * @return 'b' or 'w'
	 */
	public char getColor(){
		return this.color;
	}

	/**
	 * Sets if the Piece has moved before
	 * @param hm true or false
	 */
	public void setHasMoved(boolean hm){
		this.hasMoved = hm;
	}

	/**
	 * returns if the piece has moved before
	 * @return true false
	 */
	public boolean getHasMoved(){
		return hasMoved;
	}

	/**
	 * Sets Column
	 * @param column
	 */
	public void setColumn(int column){
		this.column = column;
	}

	/**
	 * gets column
	 * @return column
	 */
	public int getColumn(){
		return column;
	}

	/**
	 * Sets Row
	 * @param row
	 */
	public void setRow(int row){
		this.row = row;
	}

	/**
	 * Returns row
	 * @return row
	 */
	public int getRow(){
		return row;
	}

	/**
	 * Sets Piece Position (row, column)
	 * @param row new row
	 * @param column new column
	 */
	public void setPosition(int row, int column){
		this.column = column;this.row = row;
	}

	/**
	 * Sets the turn that the Piece has moved on
	 * @param t turn
	 */
	public void setTurnMoved(int t){this.turnMoved = t;}

	/**
	 * returns the turn number that the
	 * piece previously moved on
	 * @return turn Moved
	 */
	public int getTurnMoved(){return turnMoved;}

	/**
	 * Returns Symbol
	 * @return symbol
	 */
	public char getSymbol(){
		return this.symbol;
	}

	/**
	 * Checks if destination position is valid
	 * @param row destination row
	 * @param column destination column
	 * @param cb board to check on
	 * @return true false
	 */
	public boolean isValid(int row, int column, ChessSpace[][] cb){
		return true;
	}

	/**
	 * Used for pawn piece
	 * @param row destination row
	 * @param column destination column
	 * @param cb board to check
	 * @return true false
	 */
	public boolean eatPiece(int row, int column, ChessSpace[][] cb){return true;};

	/**
	 * gets if the piece has been captured
	 * @return true false
	 */
	public boolean getCaptured(){
		return captured;
	}

	/**
	 * Sets if piece has been captured
	 * @param sc true false
	 */
	public void setCaptured(boolean sc){
		this.captured = sc;
	}


}
