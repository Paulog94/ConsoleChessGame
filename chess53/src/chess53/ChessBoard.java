package chess53;

public class ChessBoard {
	//Creates chessboard with an array of the chess Space object
	static ChessSpace [][] chessBoard = new ChessSpace [8][8];

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
		
		ChessPiece bp2 = new Pawn(6,1,'b');
		chessBoard[6][1].setIsOccupied(true);
		chessBoard[6][1].setPieceOn(bp2);
		
		ChessPiece bp3 = new Pawn(6,2,'b');
		chessBoard[6][2].setIsOccupied(true);
		chessBoard[6][2].setPieceOn(bp3);
		
		ChessPiece bp4 = new Pawn(6,3,'b');
		chessBoard[6][3].setIsOccupied(true);
		chessBoard[6][3].setPieceOn(bp4);
		
		ChessPiece bp5 = new Pawn(6,4,'b');
		chessBoard[6][4].setIsOccupied(true);
		chessBoard[6][4].setPieceOn(bp5);
		
		ChessPiece bp6 = new Pawn(6,5,'b');
		chessBoard[6][5].setIsOccupied(true);
		chessBoard[6][5].setPieceOn(bp6);
		
		ChessPiece bp7 = new Pawn(6,6,'b');
		chessBoard[6][6].setIsOccupied(true);
		chessBoard[6][6].setPieceOn(bp7);
		
		ChessPiece bp8 = new Pawn(6,7,'b');
		chessBoard[6][7].setIsOccupied(true);
		chessBoard[6][7].setPieceOn(bp8);
		
		ChessPiece bR1 = new Rook(7,0,'b');
		chessBoard[7][0].setIsOccupied(true);
		chessBoard[7][0].setPieceOn(bR1);
		
		ChessPiece bR2 = new Rook(7,7,'b');
		chessBoard[7][7].setIsOccupied(true);
		chessBoard[7][7].setPieceOn(bR2);
		
		ChessPiece bN1 = new Knight(7,1,'b');
		chessBoard[7][1].setIsOccupied(true);
		chessBoard[7][1].setPieceOn(bN1);
		
		ChessPiece bN2 = new Knight(7,6,'b');
		chessBoard[7][6].setIsOccupied(true);
		chessBoard[7][6].setPieceOn(bN2);
		
		ChessPiece bB1 = new Bishop(7,2,'b');
		chessBoard[7][2].setIsOccupied(true);
		chessBoard[7][2].setPieceOn(bB1);
		
		ChessPiece bB2 = new Bishop(7,5,'b');
		chessBoard[7][5].setIsOccupied(true);
		chessBoard[7][5].setPieceOn(bB2);
		
		ChessPiece bQ1 = new Queen(7,3,'b');
		chessBoard[7][3].setIsOccupied(true);
		chessBoard[7][3].setPieceOn(bQ1);
		
		ChessPiece bK1 = new King(7,4,'b');
		chessBoard[7][4].setIsOccupied(true);
		chessBoard[7][4].setPieceOn(bK1);
		
		ChessPiece wp1 = new Pawn(1,0,'w');
		chessBoard[1][0].setIsOccupied(true);
		chessBoard[1][0].setPieceOn(wp1);
		
		ChessPiece wp2 = new Pawn(1,1,'w');
		chessBoard[1][1].setIsOccupied(true);
		chessBoard[1][1].setPieceOn(wp2);
		
		ChessPiece wp3 = new Pawn(1,2,'w');
		chessBoard[1][2].setIsOccupied(true);
		chessBoard[1][2].setPieceOn(wp3);
		
		ChessPiece wp4 = new Pawn(1,3,'w');
		chessBoard[1][3].setIsOccupied(true);
		chessBoard[1][3].setPieceOn(wp4);
		
		ChessPiece wp5 = new Pawn(1,4,'w');
		chessBoard[1][4].setIsOccupied(true);
		chessBoard[1][4].setPieceOn(wp5);
		
		ChessPiece wp6 = new Pawn(1,5,'w');
		chessBoard[1][5].setIsOccupied(true);
		chessBoard[1][5].setPieceOn(wp6);
		
		ChessPiece wp7 = new Pawn(1,6,'w');
		chessBoard[1][6].setIsOccupied(true);
		chessBoard[1][6].setPieceOn(wp7);
		
		ChessPiece wp8 = new Pawn(1,7,'w');
		chessBoard[1][7].setIsOccupied(true);
		chessBoard[1][7].setPieceOn(wp8);
		
		ChessPiece wR1 = new Rook(0,0,'w');
		chessBoard[0][0].setIsOccupied(true);
		chessBoard[0][0].setPieceOn(wR1);
		
		ChessPiece wR2 = new Rook(0,7,'w');
		chessBoard[0][7].setIsOccupied(true);
		chessBoard[0][7].setPieceOn(wR2);
		
		ChessPiece wN1 = new Knight(0,1,'w');
		chessBoard[0][1].setIsOccupied(true);
		chessBoard[0][1].setPieceOn(wN1);
		
		ChessPiece wN2 = new Knight(0,6,'w');
		chessBoard[0][6].setIsOccupied(true);
		chessBoard[0][6].setPieceOn(wN2);
		
		ChessPiece wB1 = new Bishop(0,2,'w');
		chessBoard[0][2].setIsOccupied(true);
		chessBoard[0][2].setPieceOn(wB1);
		
		ChessPiece wB2 = new Bishop(0,5,'w');
		chessBoard[0][5].setIsOccupied(true);
		chessBoard[0][5].setPieceOn(wB2);
		
		ChessPiece wQ1 = new Queen(0,3,'w');
		chessBoard[0][3].setIsOccupied(true);
		chessBoard[0][3].setPieceOn(wQ1);
		
		ChessPiece wK1 = new King(0,4,'w');
		chessBoard[0][4].setIsOccupied(true);
		chessBoard[0][4].setPieceOn(wK1);
		
	}

	public void move(int c1,int r1,int c2,int r2){
		System.out.println("Piece on "+r1+","+c1+": "
						+chessBoard[r1][c1].getPieceOn().getColor()
						+chessBoard[r1][c1].getPieceOn().getSymbol()
						+"\t move to:"+r2+","+c2);

		chessBoard[r2][c2].setPieceOn(chessBoard[r1][c1].getPieceOn());
		chessBoard[r2][c2].setIsOccupied(true);
		chessBoard[r1][c1].setPieceOn(null);
		chessBoard[r1][c1].setIsOccupied(false);

	}

}
