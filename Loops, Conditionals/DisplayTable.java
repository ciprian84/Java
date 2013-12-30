public class DisplayTable {

	public static void main(String[] args) {

		int b = 1;
		System.out.println("a " + "    " + "b" + "    " + "pow(a,b)");
		for (int a = 1; a < 6; a++) {
			b++;
			System.out.println(a + "     " + b + "    " + Math.pow(a, b));
		}
	}

}
