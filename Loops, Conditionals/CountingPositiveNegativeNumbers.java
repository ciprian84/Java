import java.util.Scanner;

public class CountingPositiveNegativeNumbers {

	public static void main(String[] args) {

		int countPositive = 0;
		int countNegative = 0;
		int totalNumbers = 0;
		int count = 0;

		Scanner s = new Scanner(System.in);
		System.out.println("Introdu nr.: ");
		int numere = s.nextInt();
		while (numere != 0) {
			if (numere > 0)
				countPositive++;
			else if (numere < 0) {
				countNegative++;
			}
			totalNumbers += numere;
			count++;
			numere = s.nextInt();

		}
		System.out.println("nr pozitive sunt: " + countPositive);
		System.out.println("nr negative sunt: " + countNegative);
		System.out.println("total nr " + totalNumbers);

	}
}
