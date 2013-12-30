import java.util.Scanner;

public class QuadraticEcuations {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		System.out.println("Enter a: ");
		double a = s.nextDouble();
		System.out.println("Enter b");
		double b = s.nextDouble();
		System.out.println("Enter c");
		double c = s.nextDouble();

		if (b * b - 4.0D * a * c == 0) {
			double r1 = -b / 2 * a;
			System.out.println("the root is " + r1);
		} else if (b * b - 4.0D * a * c < 0) {
			System.out.println("no real roots");
		} else if (b * b - 4.0D * a * c > 0) {
			double r1 = (-b - Math.pow((b * b - 4 * a * c), 0.5)) / (2.0D * a);
			double r2 = (-b + Math.pow((b * b - 4 * a * c), 0.5)) / (2.0D * a);
			System.out.println("the roots are: " + r2 + " and " + r1);
		}

	}
}
