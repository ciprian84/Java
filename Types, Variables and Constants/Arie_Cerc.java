import java.util.Scanner;

public class ArieCerc {
	public static void main(String[] args) {
		final double PI = 3.1459;
		System.out.println("Introduceti raza cercului:");
		Scanner sc = new Scanner(System.in);
		double razaCerc = sc.nextDouble();
		double ariaCerc = razaCerc * razaCerc * PI;
		System.out.println("Aria cercului este: " + ariaCerc);
	}
}
