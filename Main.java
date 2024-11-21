import java.util.Scanner;

public class Main
{
	public static void main(String[] args)
	{
		// No need to touch anything in here
		Scanner sc = new Scanner(System.in);
		String str = null;

		System.out.println("Enter a sentence:");
		str = sc.nextLine();

		algorithm1(str);
		algorithm2(str);

		sc.close();
	}

	// This method should implement Algorithm 1 and print all neccessary data
	public static void algorithm1(String input)
	{
		String fix = input.toLowerCase();
		String empty = ""; // our valid string.
		for(int i = 0; i < fix.length(); i++) {
			String letter = fix.substring(i, i + 1);
			// check index.
			System.out.println(letter);
			
		}
	}

	// This method should implement Algorithm 2 and print all neccessary data
	public static void algorithm2(String input)
	{
		// TODO: Put solution to Algorithm 1 here
		System.out.println("Implement me!");
	}
}
