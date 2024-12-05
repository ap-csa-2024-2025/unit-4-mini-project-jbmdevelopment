import java.util.Scanner;

public class Main
{ // use this to save this file for now
	public static void main(String[] args)
	{
		playGame();
	}
	public int getPlayer2Move(int round) {
		int result;
		if(round % 3 == 0) {
			result = 3;
		} else if(round % 2 == 0) {
			result = 2;
		} else {
			result = 1;
		}
		return result;
	}
	public static void playGame() {
		int coins1 = 10; // player 1 
		int coints2 = 10; // player 2
		int currentRound = 1;
		int maxRounds = 5;
		boolean gameEnd = (currentRound >= maxRounds)// || (true);
		while(!gameEnd) {
			
		}
	}
}
