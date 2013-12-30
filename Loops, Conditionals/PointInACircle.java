import java.util.Scanner;

public class PointInACircle {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("enter two points: ");
		double point1 = s.nextDouble();
		double point2 = s.nextDouble();
		double distance = Math.pow(point1 * point1 + point2 * point2, 0.5D);

		if (distance <= 10D)
			System.out.println("Point(" + point1 + "," + point2
					+ ") is in the circle");
		else
			System.out.println("Point(" + point1 + "," + point2
					+ ") is not in the circle");

	}

}
