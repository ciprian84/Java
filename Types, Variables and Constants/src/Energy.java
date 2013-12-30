import java.util.Scanner;

public class Energy {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter amount of water in kg: ");
		double m = sc.nextDouble();
		System.out.println(" Enter initial temp");
		double initialTemp = sc.nextDouble();
		System.out.println(" Enter final temp");
		double finalTemp = sc.nextDouble();

		double energy = m * (finalTemp - initialTemp) * 4184;
		System.out.println(energy);
	}

}
