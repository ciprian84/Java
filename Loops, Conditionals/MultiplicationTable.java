public class MultiplicationTable {

	public static void main(String[] args) {
		System.out.println("      Multiplication table");
		// System.out.print("   ");
		for (int j = 1; j <= 9; j++)
			System.out.print("   " + j);
		System.out.println("\n覧覧覧覧覧覧覧覧覧覧覧覧覧覧覧覧覧覧覧�");

		for (int i = 1; i <= 9; i++) {
			System.out.println(i + " | ");
			for (int j = 1; j <= 9; j++) {
				System.out.printf("%4d", i * j);
			}
			System.out.println();

		}
	}
}