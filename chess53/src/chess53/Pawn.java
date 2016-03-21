package chess53;

/**
 *
 * Pawn Piece Class
 * identifies movements that are valid to a specific Pawn
 * Allows double move
 *Allows En Passant move
 *
 * @author Joshua Cross and Paulo Garcia
 */
public class Pawn extends ChessPiece {
	private final char symbol = 'p';
	private boolean doubleMoved = false;


	/**
	 * Constructs Pawn
	 *
	 * @param row starting row
	 * @param column starting column
	 * @param color black or white
	 */
	public Pawn(int row, int column, char color) {
		super(row,column,color);

	}

	/**
	 * Gets Symbol
	 *
	 * @return Symbol
	 */
	public char getSymbol(){
		return symbol;
	}

	/**
	 * Sees if it used double move
	 *
	 * @return boolean for double move
	 */
	public boolean getDoubleMoved(){return doubleMoved;}

	/**
	 * Validates moves that this Pawn can make
	 *
	 * @param row destination row
	 * @param column destination column
	 * @param cb board to use
	 * @return if the pawn can move there
	 */
	@Override
	public boolean isValid(int row, int column, ChessSpace[][] cb){

		if(eatPiece(row,column,cb))
			return true;

		else if(movePawn(row, column, cb))
				return true;

		return false;
	}

	/**
	 *
	 * Pawns movement for eating opponent pieces
	 * Includes En Passant
	 *
	 * @param row destination row
	 * @param column destination column
	 * @param cb board to use
	 * @return can the pawn eat a piece or go to a space
	 */
	public boolean eatPiece(int row, int column, ChessSpace[][] cb){
		if(		(super.getColor()=='w' && row == (super.getRow()+1)) ||
				(super.getColor()=='b' && row == (super.getRow()-1)) ) {

			int C1 = Math.abs(super.getColumn()-column);
			int R1 = Math.abs(super.getRow()- row);

			if( (C1==1 && R1==1)) {
				if( cb[row][column].getIsOccupied() &&
						cb[row][column].getPieceOn().getColor()!=super.getColor())
			 	{
					return true;
				}
				//checks for enPassant
				else if(enPassant(row, column, cb)){
					cb[super.getRow()][column].setPieceOn(null);
					cb[super.getRow()][column].setIsOccupied(false);
					return true;
				}
			}
		}
		return false;
	}

	/**
	 *
	 * Pawns movement for double move and normal move
	 *
	 * @param row destination row
	 * @param column destination column
	 * @param cb board to use
	 * @return if the destination is valid
	 */
	public boolean movePawn(int row, int column, ChessSpace[][] cb){
		if(		((super.getColor()=='w' && row > super.getRow() ) ||
				(super.getColor()=='b' && row < super.getRow() )) &&
				!cb[row][column].getIsOccupied()) {

			if (!super.getHasMoved()) {
				if (super.getColumn() == column && (Math.abs(super.getRow() - row) == 2)){
					if( (super.getColor()== 'w' && !(cb[super.getRow()+1][column].getIsOccupied()))){
						doubleMoved = true;
						return true;
					}
					if(	(super.getColor()== 'b' && !(cb[super.getRow()-1][column].getIsOccupied()))) {
						doubleMoved = true;
						return true;
					}
				}
				else if ((super.getColor() == 'w' && super.getColumn() == column && row - super.getRow() == 1) ||
						(super.getColor() == 'b' && super.getColumn() == column && super.getRow() - row == 1)) {
					return true;
				}
			}
			else if ((super.getColor() == 'w' && super.getColumn() == column && row - super.getRow() == 1) ||
					(super.getColor() == 'b' && super.getColumn() == column && super.getRow() - row == 1)) {
				return true;
			}
		}

		return false;
	}

	/**
	 * En Passant move will set the board according to
	 * the En Passant pawn move
	 *
	 * @param row destination row
	 * @param column destination column
	 * @param cb board to modify
	 * @return true or false
	 */
	public boolean enPassant(int row, int column, ChessSpace[][] cb){

		if(cb[super.getRow()][column].getIsOccupied() || cb[super.getRow()][column].getIsOccupied()){

			if(cb[super.getRow()][column].getPieceOn() instanceof Pawn ){
				if(((Pawn) cb[super.getRow()][column].getPieceOn()).getDoubleMoved() &&
						cb[super.getRow()][column].getPieceOn().getTurnMoved() == (super.getTurnMoved()-1)) {
				return true;
				}
			}
		}
		return false;
	}
}
