import java.util.Scanner;

public class DivisibleTestBoolean {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		System.out.println(" enter an integer");
		int number = s.nextInt();

		boolean divBoth = (number % 5 == 0 && number % 6 == 0);
		boolean divOne = (number % 5 == 0 || number % 6 == 0);
		boolean noDiv = (number % 5 != 0 && number % 6 != 0);

		System.out.println("is " + number + " div by 5 and 6 " + divBoth);
		System.out.println("is " + number + " div by 5 or 6 " + divOne);

	}
}
