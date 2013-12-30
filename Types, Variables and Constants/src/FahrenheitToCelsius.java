import java.util.Scanner;

public class FahrenheitToCelsius {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Fahrenheit: ");
		double fahr = sc.nextDouble();
		double cels = (5.0 / 9) * (fahr - 32);
		System.out
				.println(fahr + " fahrenheit reprezinta " + cels + " celsius");
	}

}
