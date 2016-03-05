package chess53;

public class ChessBoard {
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
				}
			}
			System.out.println(i+1);
		}
		System.out.println(" a  b  c  d  e  f  g  h");
	}
	
	public void setBoard(){
		ChessPiece bp1 = new Pawn(6,0,'b');
		ChessPiece bp2 = new Pawn(6,1,'b');
		ChessPiece bp3 = new Pawn(6,2,'b');
		ChessPiece bp4 = new Pawn(6,3,'b');
		ChessPiece bp5 = new Pawn(6,4,'b');
		ChessPiece bp6 = new Pawn(6,5,'b');
		ChessPiece bp7 = new Pawn(6,6,'b');
		ChessPiece bp8 = new Pawn(6,7,'b');
		ChessPiece bR1 = new Rook(7,0,'b');
		ChessPiece bR2 = new Rook(7,7,'b');
		ChessPiece bN1 = new Knight(7,1,'b');
		ChessPiece bN2 = new Knight(7,6,'b');
		ChessPiece bB1 = new Bishop(7,2,'b');
		ChessPiece bB2 = new Bishop(7,5,'b');
		ChessPiece bQ1 = new Queen(7,3,'b');
		ChessPiece bK1 = new King(7,4,'b');
		
		ChessPiece wp1 = new Pawn(1,0,'w');
		ChessPiece wp2 = new Pawn(1,1,'w');
		ChessPiece wp3 = new Pawn(1,2,'w');
		ChessPiece wp4 = new Pawn(1,3,'w');
		ChessPiece wp5 = new Pawn(1,4,'w');
		ChessPiece wp6 = new Pawn(1,5,'w');
		ChessPiece wp7 = new Pawn(1,6,'w');
		ChessPiece wp8 = new Pawn(1,7,'w');
		ChessPiece wR1 = new Rook(0,0,'w');
		ChessPiece wR2 = new Rook(0,7,'w');
		ChessPiece wN1 = new Knight(0,1,'w');
		ChessPiece wN2 = new Knight(0,6,'w');
		ChessPiece wB1 = new Bishop(0,2,'w');
		ChessPiece wB2 = new Bishop(0,5,'w');
		ChessPiece wQ1 = new Queen(0,3,'w');
		ChessPiece wK1 = new King(0,4,'w');
		
		
	}
}
