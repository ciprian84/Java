import java.util.Random;
import java.util.Scanner;

public class SumOfTwoGeneratedNumbers {

	public static void main(String[] args) {
		Random rand = new Random();
		int num1 = rand.nextInt(50) + 1;
		int num2 = rand.nextInt(50) + 1;
		Scanner sc = new Scanner(System.in);
		System.out.print(num1 + " + " + num2 + " = ?");
		int myNumber = sc.nextInt();
		while (num1 + num2 != myNumber) {
			System.out.println(num1 + " + " + num2 + " = ");
			myNumber = sc.nextInt();
		}
		System.out.println("Correct!");
	}

}
