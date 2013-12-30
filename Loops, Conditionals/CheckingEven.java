import java.util.Scanner;

public class CheckingEven {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		int number = s.nextInt();
		boolean test = (number % 2 == 0);
		System.out.println(test);
	}
}
