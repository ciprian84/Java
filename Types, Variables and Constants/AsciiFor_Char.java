import java.util.*;
public class AsciiForChar {

	public static void main(String[] args) {
	 Scanner sc = new Scanner(System.in);
	 System.out.println("Introduceti un caracter: ");
	 char caracter = sc.next().charAt(0);
	 int ascii = (int)caracter;
	 System.out.println("Codul ASCII pentru " + caracter + " este " + ascii);

	}

}
