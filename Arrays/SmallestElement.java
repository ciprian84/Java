import java.util.Scanner;

public class SmallestElement {

	public static void main(String[] args) {
		int[] numbers = new int[10];
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 10 numbers: ");
		for (int i = 0; i < numbers.length; i++) {
			numbers[i] = sc.nextInt();
		}
		int min = numbers[0];
		for (int j = 0; j < numbers.length; j++) {
			if (min <= numbers[j])
				continue;
			min = numbers[j];

		}
		System.out.println("Smallest number is " + min);
	}

}
