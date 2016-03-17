package chess53;

//import com.sun.deploy.util.BlackList;

import java.util.Scanner;

public class chess {

	//converts row letters to row numbers
	public static int LtoNum(char L){
		switch(L){
			case 'a':{
				return 0;
			}
			case 'b':{
				return 1;
			}
			case 'c':{
				return 2;
			}
			case 'd':{
				return 3;
			}
			case 'e':{
				return 4;
			}
			case 'f':{
				return 5;
			}
			case 'g':{
				return 6;
			}
			case 'h':{
				return 7;
			}
			default:
				return 0;
		}
	}

	//Checks if promotion Symbol is a correct symbol
	public static Boolean isSymbol(char s){
		switch(s){

			case 'R':
				return true;

			case 'N':
				return true;

			case 'B':
				return true;

			case 'Q':
				return true;

			default:
				return false;
		}

	}

	//Checks if Input String is Valid
	public static Boolean isValid(String move){
		if(move.length()==5){
			char[] parser = move.toCharArray();

			if((parser[0]>='a'&& parser[0]<='h') && (parser[3]>='a'&& parser[3]<='h') && parser[2]==' '){
				if(Character.isDigit(parser[1]) && (parser[1]-'0'<9 && parser[1]-'0' > 0) &&
						Character.isDigit(parser[4]) && (parser[4]-'0'<9 && parser[4]-'0'>0))
					return true;
			}
		}
		else
		if(move.length()==7){

			char[] parser = move.toCharArray();

			if((parser[0]>='a'&& parser[0]<='h') && (parser[3]>='a'&& parser[3]<='h') && parser[2]==' ' && parser[5]==' '){
				if(Character.isDigit(parser[1]) && (parser[1]-'0'<9 && parser[1]-'0' > 0) &&
						Character.isDigit(parser[4]) && (parser[4]-'0'<9 && parser[4]-'0'>0) &&
						isSymbol(parser[6]))
					return true;
			}
		}
		return false;
	}

	//Helper Function to set User Input up for the Chess game
	public static int[] parseMove(String move){
		char[] parser = move.toCharArray();
		return new int[]{LtoNum(parser[0]),(parser[1]-'0'-1),LtoNum(parser[3]),(parser[4]-'0'-1)};
	}

	public static void main(String[] args) {

		boolean checkMate = false;
		boolean resign = false;
		boolean draw = false;

		ChessBoard cb = new ChessBoard();
		cb.setBoard();
		cb.drawBoard();

		Scanner user = new Scanner(System.in);

		//Starts the Game
		//continues game until checkMate, resign or draw
		while(!checkMate && !resign &&!draw) {
			String Player;

			//Checks whose turn it is;
			if (cb.turn%2==0) {
				Player = "White";
				System.out.print("\n"+Player+"'s move: ");
			} else {
				Player = "Black";
				System.out.print("\n"+Player+"'s move: ");
			}

			String input = user.nextLine();

			//Checks for a resignation
			if(input.equals("resign")){
				resign = true;
			}

			//Checks if Player Uses Draw
			else if(input.equals("draw?")){
				input = user.next();
				if(input.equals("draw")) {
					break;
				}
			}
			//Checks if the input is valid
			else if(isValid(input)){
				if(input.length()==5) {
					int[] moves = parseMove(input);
					cb.move(moves[0], moves[1], moves[2], moves[3]);
				}
				else {
					int[] moves = parseMove(input.substring(0,5));
					cb.move(moves[0], moves[1], moves[2], moves[3],input.charAt(6));
				}

			}
			else
				System.out.println(input+"\nIllegal move, try again");
		}
	}
	
}
