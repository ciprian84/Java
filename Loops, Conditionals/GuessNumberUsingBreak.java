import java.util.Random;
import java.util.Scanner;

public class GuessNumberUsingBreak {

	public static void main(String[] args) {

		Random rand = new Random();
		int number = rand.nextInt(10) + 1;
		Scanner s = new Scanner(System.in);
		System.out.println("Enter number between 0 and 10: ");
		while (true) {
			System.out.println("\nEnter your guess");
			int guess = s.nextInt();
			if (guess == number) {
				System.out.println("yes! the number is " + number);
				break;
			} else if (guess > number)
				System.out.println("your guess is too high");
			else
				System.out.println("your guess is too low");
		}
	}

}
