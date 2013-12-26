import java.util.*;

public class ZellerCongruence {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Introduceti anul: ");
		int an = input.nextInt();

		System.out.print("Introduceti luna: ");
		int luna = input.nextInt();
		if (luna == 1) {
			luna = 13;
			an--;
		} else if (luna == 2) {
			luna = 14;
			an--;
		}

		System.out.print("Introduceti ziua: ");
		int zi = input.nextInt();

		int k = an % 100;
		int j = an / 100;

		int nrZi = (zi + (int) ((luna + 1) * 26.0D / 10.0D) + k
				+ (int) (k / 4.0D) + (int) (j / 4.0D) + 5 * j) % 7;

		System.out.println(nrZi);
	}
}
