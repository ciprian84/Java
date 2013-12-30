import java.util.Scanner;

public class SumaCifreNr {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Introdu nr:");
		int number = sc.nextInt();
		int lastDigit = number % 10;
		int remainingNumber = number / 10;
		int secondLastDigit = remainingNumber % 10;
		remainingNumber /= 10;
		int thirdLastDigit = remainingNumber % 10;
		int s = lastDigit + secondLastDigit + thirdLastDigit;

		System.out.println("Suma cifrelor numarului este: " + s);
	}

}
