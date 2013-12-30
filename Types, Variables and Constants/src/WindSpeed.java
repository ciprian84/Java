import java.util.Scanner;

import javax.swing.JOptionPane;

public class WindSpeed {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		double temp;
		double speed;

		System.out.println("Enter temp: ");

		temp = sc.nextDouble();

		System.out.println("Enter speed: ");
		speed = sc.nextDouble();
		double windTmp = 35.74 + 0.6215 * temp - 35.75
				* (Math.pow(speed, 0.16)) + 0.4275 * temp
				* (Math.pow(speed, 0.16));
		System.out.println(windTmp);

	}

}
