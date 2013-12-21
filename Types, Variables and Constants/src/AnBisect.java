import java.util.Scanner;
public class AnBisect {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	Scanner sc = new Scanner(System.in);
	System.out.println("Introduceti anul: ");
	int an = sc.nextInt();
	boolean EsteAnBisect = 
			(an % 4 == 0 && an % 100 != 0) || (an % 400 == 0);
	System.out.println(an + " este an bisect " + EsteAnBisect);

	}

}
