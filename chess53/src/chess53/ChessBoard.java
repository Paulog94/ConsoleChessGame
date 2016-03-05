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
		System.out.println(" a  b  c  d  e  f  g  h \n test");
	}
}
