import java.util.Scanner;

public class GreatestCommonDivisor {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		System.out.println("first number: ");
		int n1 = s.nextInt();
		System.out.println("second number: ");
		int n2 = s.nextInt();
		int gcd = 1; // initial gcd = 1
		int k = 2; // possible gcd
		while (k <= n1 && k <= n2) {
			if (n1 % k == 0 && n2 % k == 0)
				gcd = k;
			k++;
		}
		System.out.println(gcd);

	}
}
