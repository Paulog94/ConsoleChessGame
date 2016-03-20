package chess53;

import java.util.ArrayList;

public class ChessBoard {
	//Creates chessboard with an array of the chess Space object
	static ChessSpace [][] chessBoard = new ChessSpace [8][8];
	static ArrayList<ChessPiece> blackPieces = new ArrayList<ChessPiece>();
	static ArrayList<ChessPiece> whitePieces = new ArrayList<ChessPiece>();
	static ChessPiece whiteKing;
	static ChessPiece blackKing;
	public static int turn = 0;
	static ArrayList<ChessPiece> checkers = new ArrayList<ChessPiece>();
	public static ChessPiece takenPiece = null;

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

	//Draws Board
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

	//Sets Pieces for initial game
	public void setBoard(){
		ChessPiece bp1 = new Pawn(6,0,'b');
		chessBoard[6][0].setIsOccupied(true);
		chessBoard[6][0].setPieceOn(bp1);
		//blackPieces[0] = bp1;

		ChessPiece bp2 = new Pawn(6,1,'b');
		chessBoard[6][1].setIsOccupied(true);
		chessBoard[6][1].setPieceOn(bp2);
		//blackPieces[1] = bp2;

		ChessPiece bp3 = new Pawn(6,2,'b');
		chessBoard[6][2].setIsOccupied(true);
		chessBoard[6][2].setPieceOn(bp3);
		//blackPieces[2] = bp3;

		ChessPiece bp4 = new Pawn(6,3,'b');
		chessBoard[6][3].setIsOccupied(true);
		chessBoard[6][3].setPieceOn(bp4);
		//blackPieces[3] = bp4;

		ChessPiece bp5 = new Pawn(6,4,'b');
		chessBoard[6][4].setIsOccupied(true);
		chessBoard[6][4].setPieceOn(bp5);
		//blackPieces[4] = bp5;

		ChessPiece bp6 = new Pawn(6,5,'b');
		chessBoard[6][5].setIsOccupied(true);
		chessBoard[6][5].setPieceOn(bp6);
		//blackPieces[5] = bp6;

		ChessPiece bp7 = new Pawn(6,6,'b');
		chessBoard[6][6].setIsOccupied(true);
		chessBoard[6][6].setPieceOn(bp7);
		//blackPieces[6] = bp7;

		ChessPiece bp8 = new Pawn(6,7,'b');
		chessBoard[6][7].setIsOccupied(true);
		chessBoard[6][7].setPieceOn(bp8);
		//blackPieces[7] = bp8;

		ChessPiece bR1 = new Rook(7,0,'b');
		chessBoard[7][0].setIsOccupied(true);
		chessBoard[7][0].setPieceOn(bR1);
		//blackPieces[8] = bR1;

		ChessPiece bR2 = new Rook(7,7,'b');
		chessBoard[7][7].setIsOccupied(true);
		chessBoard[7][7].setPieceOn(bR2);
		//blackPieces[9] = bR2;

		ChessPiece bN1 = new Knight(7,1,'b');
		chessBoard[7][1].setIsOccupied(true);
		chessBoard[7][1].setPieceOn(bN1);
		//blackPieces[10] = bN1;

		ChessPiece bN2 = new Knight(7,6,'b');
		chessBoard[7][6].setIsOccupied(true);
		chessBoard[7][6].setPieceOn(bN2);
		//blackPieces[11] = bN2;

		ChessPiece bB1 = new Bishop(7,2,'b');
		chessBoard[7][2].setIsOccupied(true);
		chessBoard[7][2].setPieceOn(bB1);
		//blackPieces[12] = bB1;

		ChessPiece bB2 = new Bishop(7,5,'b');
		chessBoard[7][5].setIsOccupied(true);
		chessBoard[7][5].setPieceOn(bB2);
		//blackPieces[13] = bB2;

		ChessPiece bQ1 = new Queen(7,3,'b');
		chessBoard[7][3].setIsOccupied(true);
		chessBoard[7][3].setPieceOn(bQ1);
		//blackPieces[14] = bQ1;

		ChessPiece bK1 = new King(7,4,'b');
		chessBoard[7][4].setIsOccupied(true);
		chessBoard[7][4].setPieceOn(bK1);
		//blackPieces[15] = bK1;

		ChessPiece wp1 = new Pawn(1,0,'w');
		chessBoard[1][0].setIsOccupied(true);
		chessBoard[1][0].setPieceOn(wp1);
		//whitePieces[0] = wp1;

		ChessPiece wp2 = new Pawn(1,1,'w');
		chessBoard[1][1].setIsOccupied(true);
		chessBoard[1][1].setPieceOn(wp2);
		///whitePieces[1] = wp2;

		ChessPiece wp3 = new Pawn(1,2,'w');
		chessBoard[1][2].setIsOccupied(true);
		chessBoard[1][2].setPieceOn(wp3);
		//whitePieces[2] = wp3;

		ChessPiece wp4 = new Pawn(1,3,'w');
		chessBoard[1][3].setIsOccupied(true);
		chessBoard[1][3].setPieceOn(wp4);
		//whitePieces[3] = wp4;

		ChessPiece wp5 = new Pawn(1,4,'w');
		chessBoard[1][4].setIsOccupied(true);
		chessBoard[1][4].setPieceOn(wp5);
		//whitePieces[4] = wp5;

		ChessPiece wp6 = new Pawn(1,5,'w');
		chessBoard[1][5].setIsOccupied(true);
		chessBoard[1][5].setPieceOn(wp6);
		//whitePieces[5] = wp6;

		ChessPiece wp7 = new Pawn(1,6,'w');
		chessBoard[1][6].setIsOccupied(true);
		chessBoard[1][6].setPieceOn(wp7);
		///whitePieces[6] = wp7;

		ChessPiece wp8 = new Pawn(1,7,'w');
		chessBoard[1][7].setIsOccupied(true);
		chessBoard[1][7].setPieceOn(wp8);
		//whitePieces[7] = wp8;

		ChessPiece wR1 = new Rook(0,0,'w');
		chessBoard[0][0].setIsOccupied(true);
		chessBoard[0][0].setPieceOn(wR1);
		//whitePieces[8] = wR1;

		ChessPiece wR2 = new Rook(0,7,'w');
		chessBoard[0][7].setIsOccupied(true);
		chessBoard[0][7].setPieceOn(wR2);
		//whitePieces[9] = wR2;

		ChessPiece wN1 = new Knight(0,1,'w');
		chessBoard[0][1].setIsOccupied(true);
		chessBoard[0][1].setPieceOn(wN1);
		//whitePieces[10] = wN1;

		ChessPiece wN2 = new Knight(0,6,'w');
		chessBoard[0][6].setIsOccupied(true);
		chessBoard[0][6].setPieceOn(wN2);
		//whitePieces[11] = wN2;

		ChessPiece wB1 = new Bishop(0,2,'w');
		chessBoard[0][2].setIsOccupied(true);
		chessBoard[0][2].setPieceOn(wB1);
		//whitePieces[12] = wB1;

		ChessPiece wB2 = new Bishop(0,5,'w');
		chessBoard[0][5].setIsOccupied(true);
		chessBoard[0][5].setPieceOn(wB2);
		//whitePieces[13] = wB2;

		ChessPiece wQ1 = new Queen(0,3,'w');
		chessBoard[0][3].setIsOccupied(true);
		chessBoard[0][3].setPieceOn(wQ1);
		//whitePieces[14] = wQ1;

		ChessPiece wK1 = new King(0,4,'w');
		chessBoard[0][4].setIsOccupied(true);
		chessBoard[0][4].setPieceOn(wK1);
		//whitePieces[15] = wK1;
	}

	public void updatePieces() {
		whitePieces.clear();
		blackPieces.clear();
		for (int i = 0; i < 8; i++) {
			for (int j = 0; j < 8; j++) {
				if(chessBoard[i][j].getIsOccupied()){
					if(chessBoard[i][j].getPieceOn().getColor()=='w'){
						whitePieces.add(chessBoard[i][j].getPieceOn());
						if(chessBoard[i][j].getPieceOn() instanceof King)
							whiteKing = chessBoard[i][j].getPieceOn();
					}
					else{
						blackPieces.add(chessBoard[i][j].getPieceOn());
						if(chessBoard[i][j].getPieceOn() instanceof King)
							blackKing = chessBoard[i][j].getPieceOn();
					}
				}
			}
		}
	}

	//White Check
	public boolean WhiteCheck() {
		for (ChessPiece p : whitePieces) {
			if (p.isValid(blackKing.getRow(), blackKing.getColumn(), chessBoard)) {
				if (p instanceof Pawn) {
					if (p.eatPiece(blackKing.getRow(), blackKing.getColumn(), chessBoard)) {
						return true;
					}
				}
				else {
					return true;
				}
			}
		}
		return false;
	}

	//Black Check
	public boolean BlackCheck(){
		for (ChessPiece p : blackPieces) {
			if (p.isValid(whiteKing.getRow(), whiteKing.getColumn(), chessBoard)) {
				if (p instanceof Pawn) {
					if (p.eatPiece(whiteKing.getRow(), whiteKing.getColumn(), chessBoard)) {
						return true;
					}
				}
				else {
					return true;
				}
			}
		}
		return false;
	}

	//Used to print out check for either black or white
	public void check(){
		if(WhiteCheck() || BlackCheck())
			System.out.print("\nCheck");
	}

	//Moves pieces based on user input and Chess Rules
	public void move(int column1,int row1,int column2,int row2){

		//Checks if first position is occupied
		if(chessBoard[row1][column1].getIsOccupied()) {

			//Checks if its White's turn or Black's turn
			if(		(turn%2==0 && chessBoard[row1][column1].getPieceOn().getColor()=='w' )||
					(turn%2==1 && chessBoard[row1][column1].getPieceOn().getColor()=='b')) {
				chessBoard[row1][column1].getPieceOn().setTurnMoved(turn);

				//Checks if the move is valid based on the piece
				if ((chessBoard[row1][column1].getPieceOn().isValid(row2, column2, chessBoard))&&(!selfCheck(row1, column1, row2, column2))) {

					//Sets up white pawn promotion
					if(turn%2==0 && chessBoard[row1][column1].getPieceOn() instanceof Pawn && row2 == 7){
						chessBoard[row2][column2].setPieceOn(promotion('Q',row2,column2,'w'));
						chessBoard[row2][column2].getPieceOn().setTurnMoved(turn);
						chessBoard[row2][column2].setIsOccupied(true);
						//Sets original position to null and not occupied
						chessBoard[row1][column1].setPieceOn(null);
						chessBoard[row1][column1].setIsOccupied(false);
						//Draws New board, next turn and checks for Check
						System.out.println();
						drawBoard();
						updatePieces();
						check();
						turn++;
					}
					//Sets up black pawn default promotion
					else if (turn%2==1 && chessBoard[row1][column1].getPieceOn() instanceof Pawn && row2 == 0){
						chessBoard[row2][column2].setPieceOn(promotion('Q',row2,column2,'b'));
						chessBoard[row2][column2].getPieceOn().setTurnMoved(turn);
						chessBoard[row2][column2].setIsOccupied(true);
						//Sets original position to null and not occupied
						chessBoard[row1][column1].setPieceOn(null);
						chessBoard[row1][column1].setIsOccupied(false);
						//Draws New board, next turn and checks for Check
						System.out.println();
						drawBoard();
						updatePieces();
						check();
						turn++;
					}
					else {
						//clears captured piece if needed and marks it in case it needs to go back
						if (chessBoard[row2][column2].getIsOccupied()){
							takenPiece = chessBoard[row2][column2].getPieceOn();
							chessBoard[row2][column2].getPieceOn().setCaptured(true);
						}

						//Moves the Piece
						chessBoard[row2][column2].setPieceOn(chessBoard[row1][column1].getPieceOn());
						chessBoard[row2][column2].setIsOccupied(true);
						chessBoard[row2][column2].getPieceOn().setPosition(row2, column2);

						chessBoard[row2][column2].getPieceOn().setTurnMoved(turn);
						chessBoard[row2][column2].getPieceOn().setHasMoved(true);

						//Sets original position to null and not occupied
						chessBoard[row1][column1].setPieceOn(null);
						chessBoard[row1][column1].setIsOccupied(false);

						//Draws New board, next turn
						//Checks for any Check
						System.out.println();
						drawBoard();
						updatePieces();
						check();
						turn++;
					}
				}
				else
					System.out.println("Illegal move, try again\n");
			}
			else {
				chessBoard[row1][column1].getPieceOn().setTurnMoved(turn-1);
				System.out.println("Illegal move, try again\n");
			}
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
						chessBoard[row2][column2].getPieceOn().setTurnMoved(turn);
						chessBoard[row2][column2].setIsOccupied(true);

						//Sets original Position to Empty
						chessBoard[row1][column1].setPieceOn(null);
						chessBoard[row1][column1].setIsOccupied(false);

						//Draws New board, next turn and checks for check
						System.out.println();
						drawBoard();
						updatePieces();
						check();
						turn++;
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

	//test if you are putting yourself in check
	public boolean selfCheck (int r1, int c1, int r2, int c2){
		if (chessBoard[r2][c2].getIsOccupied()){
			takenPiece = chessBoard[r2][c2].getPieceOn();
			chessBoard[r2][c2].getPieceOn().setCaptured(true);
		}
		chessBoard[r2][c2].setPieceOn(chessBoard[r1][c1].getPieceOn());
		chessBoard[r2][c2].setIsOccupied(true);
		chessBoard[r2][c2].getPieceOn().setPosition(r2, c2);
		chessBoard[r1][c1].setPieceOn(null);
		chessBoard[r1][c1].setIsOccupied(false);
		updatePieces();
		if (((turn%2 == 0)&&(BlackCheck()))||((turn%2 == 1)&&(WhiteCheck()))) {
			//reset board after check
			chessBoard[r1][c1].setPieceOn(chessBoard[r2][c2].getPieceOn());
			chessBoard[r1][c1].setIsOccupied(true);
			chessBoard[r1][c1].getPieceOn().setPosition(r1, c1);
			// puts back the captured piece.
			if (takenPiece != null){
				chessBoard[r2][c2].setPieceOn(takenPiece);
				takenPiece.setPosition(r2, c2);
				chessBoard[r2][c2].setIsOccupied(true);
				takenPiece = null;
			}else{
				chessBoard[r2][c2].setPieceOn(null);
				chessBoard[r2][c2].setIsOccupied(false);
			}
			System.out.println("Illeagal Move! you can not leave yourself in check. try again");
			return true;
		}else {
			chessBoard[r1][c1].setPieceOn(chessBoard[r2][c2].getPieceOn());
			chessBoard[r1][c1].setIsOccupied(true);
			chessBoard[r1][c1].getPieceOn().setPosition(r1, c1);
			if (takenPiece != null){
				chessBoard[r2][c2].setPieceOn(takenPiece);
				takenPiece.setPosition(r2, c2);
				chessBoard[r2][c2].setIsOccupied(true);
				takenPiece = null;
			}else{
				chessBoard[r2][c2].setPieceOn(null);
				chessBoard[r2][c2].setIsOccupied(false);
			}
		}return false;
	}
}
