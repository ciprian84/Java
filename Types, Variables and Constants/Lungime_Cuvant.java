import java.util.Scanner;
public class LungimeCuvant {

	public static void main(String[] args) {
		System.out.println("Introduceti un cuvant: ");
		Scanner sc = new Scanner(System.in);
		String cuvant = sc.next();
		int lungimeCuvant = cuvant.length();
		System.out.println("Cuvantul are " + lungimeCuvant + " caractere");
	}

}
