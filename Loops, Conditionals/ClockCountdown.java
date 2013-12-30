import java.util.Scanner;

public class ClockCountdown {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		System.out.println("enter number: ");
		int number = s.nextInt();
		number--;

		while (number != 0) {
			System.out.println(number + " seconds remaining");
			number--;

		}
		if (number == 0)
			System.out.println("stopped");
	}
}
