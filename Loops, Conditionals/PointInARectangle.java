import java.util.Scanner;

public class PointInARectangle {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		double p1 = s.nextDouble();
		double p2 = s.nextDouble();
		double width = 10D;
		double height = 5D;

		if (p1 <= width / 2 && p2 <= height / 2)
			System.out.println("the point (" + p1 + "," + p2 + ")"
					+ "este in dreptunghi");
		else
			System.out.println("punctul nu este in dreptunghi");

	}

}
