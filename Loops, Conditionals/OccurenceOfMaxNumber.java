import java.util.Scanner;

public class OccurenceOfMaxNumber {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		System.out.println("enter integers");
		int number = s.nextInt();
		int max = number;
		int count = 1;

		while (number != 0) {
			System.out.println("enter integers");
			number = s.nextInt();

			if (number > max) {
				max = number;
				count = 1;
			} else if (number == max) {
				count++;
			}
		}

		System.out.println("max is " + max + "\n" + "the occurrence count is "
				+ count);
	}

}
