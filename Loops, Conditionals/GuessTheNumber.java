import java.util.Random;
import java.util.Scanner;

public class GuessTheNumber {

	public static void main(String[] args) {
		Random rand = new Random();
		int numToGuess = rand.nextInt(100) + 1;
		Scanner sc = new Scanner(System.in);
		int myNumber = -1;
		while (myNumber != numToGuess) {
			System.out.println("Guess a number between 0 and 100");
			myNumber = sc.nextInt();
			if (myNumber == numToGuess) {
				System.out.println("Yes! The number is " + myNumber);
			} else if (myNumber > numToGuess) {
				System.out.println("Your number is too high! Try again!");
			} else
				System.out.println("Your number is too low! Try again!");
		}
	}
}
