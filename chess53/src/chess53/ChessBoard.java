package chess53;

public class ChessBoard {
	//Creates chessboard with an array of the chess Space object
	static ChessSpace [][] chessBoard = new ChessSpace [8][8];
	public static int turn = 0;

	public ChessBoard(){

		int total = 0;
		for(int i = 0; i < 8; i++){
			for (int j = 0; j < 8; j++){
				if(total % 2 == 0){
					chessBoard[i][j] = new ChessSpace(i,j,'b');
				}else{
					chessBoard[i][j] = new ChessSpace(i,j,'w');
				}
				total++;
			}
			total --;
		}
	}

	public void drawBoard(){
		for(int i = 7; i >= 0; i--){
			for (int j = 0; j < 8; j++){
				ChessSpace currentSpace = chessBoard[i][j];
				if (!currentSpace.getIsOccupied()){
					if (currentSpace.getColor() == 'b'){
						System.out.print("## ");
					}else{
						System.out.print("   ");
					}
				}else{
					System.out.print(currentSpace.getPieceOn().getColor());
					System.out.print(currentSpace.getPieceOn().getSymbol());
					System.out.print(' ');
					
				}
			}
			System.out.println(i+1);
		}
		System.out.println(" a  b  c  d  e  f  g  h");
	}
	
	public void setBoard(){
		ChessPiece bp1 = new Pawn(6,0,'b');
		chessBoard[6][0].setIsOccupied(true);
		chessBoard[6][0].setPieceOn(bp1);
		chessBoard[6][0].getPieceOn().setPosition(6,0);

		ChessPiece bp2 = new Pawn(6,1,'b');
		chessBoard[6][1].setIsOccupied(true);
		chessBoard[6][1].setPieceOn(bp2);
		chessBoard[6][1].getPieceOn().setPosition(6,1);

		ChessPiece bp3 = new Pawn(6,2,'b');
		chessBoard[6][2].setIsOccupied(true);
		chessBoard[6][2].setPieceOn(bp3);
		chessBoard[6][2].getPieceOn().setPosition(6,2);

		ChessPiece bp4 = new Pawn(6,3,'b');
		chessBoard[6][3].setIsOccupied(true);
		chessBoard[6][3].setPieceOn(bp4);
		chessBoard[6][3].getPieceOn().setPosition(6,3);

		ChessPiece bp5 = new Pawn(6,4,'b');
		chessBoard[6][4].setIsOccupied(true);
		chessBoard[6][4].setPieceOn(bp5);
		chessBoard[6][4].getPieceOn().setPosition(6,4);

		ChessPiece bp6 = new Pawn(6,5,'b');
		chessBoard[6][5].setIsOccupied(true);
		chessBoard[6][5].setPieceOn(bp6);
		chessBoard[6][5].getPieceOn().setPosition(6,5);

		ChessPiece bp7 = new Pawn(6,6,'b');
		chessBoard[6][6].setIsOccupied(true);
		chessBoard[6][6].setPieceOn(bp7);
		chessBoard[6][6].getPieceOn().setPosition(6,6);

		ChessPiece bp8 = new Pawn(6,7,'b');
		chessBoard[6][7].setIsOccupied(true);
		chessBoard[6][7].setPieceOn(bp8);
		chessBoard[6][7].getPieceOn().setPosition(6,7);
		
		ChessPiece bR1 = new Rook(7,0,'b');
		chessBoard[7][0].setIsOccupied(true);
		chessBoard[7][0].setPieceOn(bR1);
		chessBoard[7][0].getPieceOn().setPosition(7,0);

		ChessPiece bR2 = new Rook(7,7,'b');
		chessBoard[7][7].setIsOccupied(true);
		chessBoard[7][7].setPieceOn(bR2);
		chessBoard[7][7].getPieceOn().setPosition(7,7);

		ChessPiece bN1 = new Knight(7,1,'b');
		chessBoard[7][1].setIsOccupied(true);
		chessBoard[7][1].setPieceOn(bN1);
		chessBoard[7][1].getPieceOn().setPosition(7,1);
		
		ChessPiece bN2 = new Knight(7,6,'b');
		chessBoard[7][6].setIsOccupied(true);
		chessBoard[7][6].setPieceOn(bN2);
		chessBoard[7][6].getPieceOn().setPosition(7,6);

		ChessPiece bB1 = new Bishop(7,2,'b');
		chessBoard[7][2].setIsOccupied(true);
		chessBoard[7][2].setPieceOn(bB1);
		chessBoard[7][2].getPieceOn().setPosition(7,2);
		
		ChessPiece bB2 = new Bishop(7,5,'b');
		chessBoard[7][5].setIsOccupied(true);
		chessBoard[7][5].setPieceOn(bB2);
		chessBoard[7][5].getPieceOn().setPosition(7,5);
		
		ChessPiece bQ1 = new Queen(7,3,'b');
		chessBoard[7][3].setIsOccupied(true);
		chessBoard[7][3].setPieceOn(bQ1);
		chessBoard[7][3].getPieceOn().setPosition(7,3);

		ChessPiece bK1 = new King(7,4,'b');
		chessBoard[7][4].setIsOccupied(true);
		chessBoard[7][4].setPieceOn(bK1);
		chessBoard[7][4].getPieceOn().setPosition(7,4);
		
		ChessPiece wp1 = new Pawn(1,0,'w');
		chessBoard[1][0].setIsOccupied(true);
		chessBoard[1][0].setPieceOn(wp1);
		chessBoard[1][0].getPieceOn().setPosition(1,0);

		ChessPiece wp2 = new Pawn(1,1,'w');
		chessBoard[1][1].setIsOccupied(true);
		chessBoard[1][1].setPieceOn(wp2);
		chessBoard[1][1].getPieceOn().setPosition(1,1);

		ChessPiece wp3 = new Pawn(1,2,'w');
		chessBoard[1][2].setIsOccupied(true);
		chessBoard[1][2].setPieceOn(wp3);
		chessBoard[1][2].getPieceOn().setPosition(1,2);

		ChessPiece wp4 = new Pawn(1,3,'w');
		chessBoard[1][3].setIsOccupied(true);
		chessBoard[1][3].setPieceOn(wp4);
		chessBoard[1][3].getPieceOn().setPosition(1,3);

		ChessPiece wp5 = new Pawn(1,4,'w');
		chessBoard[1][4].setIsOccupied(true);
		chessBoard[1][4].setPieceOn(wp5);
		chessBoard[1][4].getPieceOn().setPosition(1,4);

		ChessPiece wp6 = new Pawn(1,5,'w');
		chessBoard[1][5].setIsOccupied(true);
		chessBoard[1][5].setPieceOn(wp6);
		chessBoard[1][5].getPieceOn().setPosition(1,5);

		ChessPiece wp7 = new Pawn(1,6,'w');
		chessBoard[1][6].setIsOccupied(true);
		chessBoard[1][6].setPieceOn(wp7);
		chessBoard[1][6].getPieceOn().setPosition(1,6);

		ChessPiece wp8 = new Pawn(1,7,'w');
		chessBoard[1][7].setIsOccupied(true);
		chessBoard[1][7].setPieceOn(wp8);
		chessBoard[1][7].getPieceOn().setPosition(1,7);
		
		ChessPiece wR1 = new Rook(0,0,'w');
		chessBoard[0][0].setIsOccupied(true);
		chessBoard[0][0].setPieceOn(wR1);
		chessBoard[0][0].getPieceOn().setPosition(0,0);
		
		ChessPiece wR2 = new Rook(0,7,'w');
		chessBoard[0][7].setIsOccupied(true);
		chessBoard[0][7].setPieceOn(wR2);
		chessBoard[0][7].getPieceOn().setPosition(0,7);
		
		ChessPiece wN1 = new Knight(0,1,'w');
		chessBoard[0][1].setIsOccupied(true);
		chessBoard[0][1].setPieceOn(wN1);
		chessBoard[0][1].getPieceOn().setPosition(0,1);
		
		ChessPiece wN2 = new Knight(0,6,'w');
		chessBoard[0][6].setIsOccupied(true);
		chessBoard[0][6].setPieceOn(wN2);
		chessBoard[0][6].getPieceOn().setPosition(0,6);
		
		ChessPiece wB1 = new Bishop(0,2,'w');
		chessBoard[0][2].setIsOccupied(true);
		chessBoard[0][2].setPieceOn(wB1);
		chessBoard[0][2].getPieceOn().setPosition(0,2);
		
		ChessPiece wB2 = new Bishop(0,5,'w');
		chessBoard[0][5].setIsOccupied(true);
		chessBoard[0][5].setPieceOn(wB2);
		chessBoard[0][5].getPieceOn().setPosition(0,5);
		
		ChessPiece wQ1 = new Queen(0,3,'w');
		chessBoard[0][3].setIsOccupied(true);
		chessBoard[0][3].setPieceOn(wQ1);
		chessBoard[0][3].getPieceOn().setPosition(0,3);
		
		ChessPiece wK1 = new King(0,4,'w');
		chessBoard[0][4].setIsOccupied(true);
		chessBoard[0][4].setPieceOn(wK1);
		chessBoard[0][4].getPieceOn().setPosition(0,4);
		
	}

	public void move(int column1,int row1,int column2,int row2){


		//Checks if first position is occupied
		if(chessBoard[row1][column1].getIsOccupied()) {

			//Checks if its White's turn or Black's turn
			if(		(turn%2==0 && chessBoard[row1][column1].getPieceOn().getColor()=='w' )||
					(turn%2==1 && chessBoard[row1][column1].getPieceOn().getColor()=='b')) {

				//Checks if the move is valid based on the piece
				if (chessBoard[row1][column1].getPieceOn().isValid(row2, column2, chessBoard)) {

					//Sets up white pawn promotion
					if(turn%2==0 && chessBoard[row1][column1].getPieceOn() instanceof Pawn && row2 == 7){
						chessBoard[row2][column2].setPieceOn(promotion('Q',row2,column2,'w'));
						chessBoard[row2][column2].setIsOccupied(true);
						//Sets original position to null and not occupied
						chessBoard[row1][column1].setPieceOn(null);
						chessBoard[row1][column1].setIsOccupied(false);
						//Draws New board, next turn
						System.out.println();
						drawBoard();
						this.turn++;
					}
					//Sets up black pawn default promotion
					else if (turn%2==1 && chessBoard[row1][column1].getPieceOn() instanceof Pawn && row2 == 0){
						chessBoard[row2][column2].setPieceOn(promotion('Q',row2,column2,'b'));
						chessBoard[row2][column2].setIsOccupied(true);
						//Sets original position to null and not occupied
						chessBoard[row1][column1].setPieceOn(null);
						chessBoard[row1][column1].setIsOccupied(false);
						//Draws New board, next turn
						System.out.println();
						drawBoard();
						this.turn++;
					}
					else {
						//Moves the Piece
						chessBoard[row2][column2].setPieceOn(chessBoard[row1][column1].getPieceOn());
						chessBoard[row2][column2].setIsOccupied(true);
						chessBoard[row2][column2].getPieceOn().setPosition(row2, column2);
						chessBoard[row2][column2].getPieceOn().setHasMoved(true);

						//Sets original position to null and not occupied
						chessBoard[row1][column1].setPieceOn(null);
						chessBoard[row1][column1].setIsOccupied(false);

						//Draws New board, next turn
						System.out.println();
						drawBoard();
						this.turn++;
					}
				}
				else
					System.out.println("Illegal move, try again\n");
				}
			else
				System.out.println("Illegal move, try again\n");
			}
		else
			System.out.println("Illegal move, try again\n");
	}

	//Accepts Promotion for Pawn
	public void move(int column1,int row1,int column2,int row2,char Symbol){

		//Checks if first position is occupied
		if(chessBoard[row1][column1].getIsOccupied()) {

			//Checks if a destination is a valid destination for a promotion
			if(		(turn%2==0 && chessBoard[row1][column1].getPieceOn().getColor()=='w' && row2 == 7)||
					(turn%2==1 && chessBoard[row1][column1].getPieceOn().getColor()=='b' && row2 == 0)) {

				//Checks if its a Pawn that is set to move
				if (chessBoard[row1][column1].getPieceOn() instanceof Pawn) {

					//Checks if the move is valid
					if (chessBoard[row1][column1].getPieceOn().isValid(row2, column2, chessBoard)) {

						//Promotes the Pawn according to the symbol associated with the move
						chessBoard[row2][column2].setPieceOn(promotion(Symbol, row2, column2, chessBoard[row1][column1].getPieceOn().getColor()));
						chessBoard[row2][column2].setIsOccupied(true);

						//Sets original Position to Empty
						chessBoard[row1][column1].setPieceOn(null);
						chessBoard[row1][column1].setIsOccupied(false);

						//Draws New board, next turn
						System.out.println();
						drawBoard();
						this.turn++;
					}
					else
						System.out.println("Illegal move, try again\n");
				}
				else
					System.out.println("Illegal move, try again\n");
			}
			else
				System.out.println("Illegal move, try again\n");
		}
		else
			System.out.println("Illegal move, try again\n");
	}

	//Promotes Pawn and sets the new Promoted piece
	public ChessPiece promotion(char S,int row, int column, char color){
		switch(S){

			case 'N':
				return new Knight(row,column,color);

			case 'B':
				return new Bishop(row,column,color);

			case 'R':
				return new Rook(row,column,color);

			default:
				return new Queen(row,column,color);
		}
	}

}
