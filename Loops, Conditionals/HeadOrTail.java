import java.util.Scanner;

public class HeadOrTail {

	public static void main(String[] args) {

		int n = (int) (Math.random() * 2);
		int head = 0;
		int tail = 1;
		Scanner s = new Scanner(System.in);
		System.out.println("Enter guess ");
		int number = s.nextInt();
		if (number == n)
			System.out.println("correct");
		else
			System.out.println("wrong");

	}

}
