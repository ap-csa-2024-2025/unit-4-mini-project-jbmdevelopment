import java.util.Scanner;
/* 

public class Main
{
    public static void main(String[] args) {
        System.out.println(isSelfDivisor(555));
    }
    public static boolean isSelfDivisor(int number) {
        String numString = number + "";
        System.out.println(numString);
        int copy = number;
        int divisCount = 0;
        while(copy > 0) {
            int digit = copy % 10;
            if(digit % number == 0) {
                divisCount++;
            }
            copy /= 10;
        }
        if(divisCount == numString.length()) {
            return true;
        }
        return false;
    }
}
*/
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
		boolean gameEnd = (currentRound >= maxRounds) || (coins1 < 3 || coins2 < 3);
		while(!gameEnd) {
			
		}
		// loop break
		if(coins1 == coins2) { // same at the end of the game.
			System.out.println("Tie Game");
		} else if(coins1 > coins2) {
			System.out.println("player 1 wins");
		} else {
			System.out.println("player 1 wins");
		}
	}
}
