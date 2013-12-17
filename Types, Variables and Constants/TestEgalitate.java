import java.util.*;
public class TestEgalitate {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduceti doua numere: ");
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		boolean egalitate = num1 == num2;
		System.out.println(num1 + "=" + num2 + " " + egalitate);
	}

}
