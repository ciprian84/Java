import java.util.Scanner;

public class ScissorsRockPaper {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number = (int) (Math.random() * 3);
		Scanner s = new Scanner(System.in);
		System.out.println(" scissor (0), rock (1), paper (2): ");
		int myNumber = s.nextInt();
		System.out.println(number);
		if (myNumber == 0 && number == 1)
			System.out.println(" computer is rock. you are scissor. you lost");
		else if (myNumber == 0 && number == 2)
			System.out.println("computer is paper. you are scissor. you won");
		else if (myNumber == 1 && number == 0)
			System.out.println("computer is scissor. you are rock. you won ");
		else if (myNumber == 1 && number == 2)
			System.out.println("computer is paper. you are rock. you lost");
		else if (myNumber == 2 && number == 1)
			System.out.println("computer is rock. you are paper. you won");
		else if (myNumber == 2 && number == 0)
			System.out.println("computer is scissor. you are paper. you lost");
		else if (myNumber == number)
			System.out.println("egalitate");

	}

}
