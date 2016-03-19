package chess53;

public class ChessPiece {
	private char color;
	private boolean hasMoved = false;
	private int row;
	private int column;
	private char symbol;
	private boolean check = false;
	private boolean captured = false;
	private int turnMoved;

	public ChessPiece(int row, int column, char color){
		this.row = row;
		this.column = column;
		this.color = color;
		this.hasMoved = false;
		this.captured = false;
	}
	public void setCheck(boolean c){this.check = c;}
	public boolean isChecked(){return this.check;}

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

	public void setPosition(int row, int column){
		this.column = column;this.row = row;
	}

	public void setTurnMoved(int t){this.turnMoved = t;}
	public int getTurnMoved(){return turnMoved;}

	public char getSymbol(){
		return this.symbol;
	}

	public boolean isValid(int row, int column, ChessSpace[][] cb){
		return true;
	}

	public boolean eatPiece(int row, int column, ChessSpace[][] cb){return true;};
	
	public boolean getCaptured(){
		return captured;
	}
	
	public void setCaptured(boolean sc){
		this.captured = sc;
	}


}
