import java.util.Scanner;

public class SummingSeries1 {

	public static void main(String[] args) {
		// calculate 1 + 1/2 + 1/3 + ... + 1/n
		double sum = 0.0D;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int number = sc.nextInt();
		for (int i = 1; i <= number; i++) {
			sum = sum + 1.0D / i;
		}
		System.out.println(sum);
	}

}
