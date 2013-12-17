import java.util.Scanner;
public class ArieDreptunghi {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduceti lungimea si latimea dreptunghiului: ");
		double lungime = sc.nextDouble();
		double latime = sc.nextDouble();
		double aria = lungime * latime;
		System.out.println("Aria este: " + aria);
	}

}
