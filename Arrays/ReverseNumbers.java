import java.util.Scanner;

public class ReverseNumbers {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number:");
		int number = sc.nextInt();
		int[] arrayOfNumbers = new int[number];
		for (int i = 0; i < arrayOfNumbers.length; i++) {
			arrayOfNumbers[i] = sc.nextInt();
		}
		System.out.println("Reverse array is: ");
		for (int i = arrayOfNumbers.length - 1; i >= 0; i--) {
			System.out.print(arrayOfNumbers[i] + " ");
		}

	}

}
