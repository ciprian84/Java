import java.util.Scanner;

public class AssigningGrades {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number of students");
		char grade;
		String output = " ";
		int numberOfStudents = sc.nextInt();
		int[] scores = new int[numberOfStudents];
		System.out.println("Enter " + numberOfStudents + " scores: ");
		for (int i = 0; i < scores.length; i++) {
			scores[i] = sc.nextInt();
		}
		for (int i = 0; i < scores.length; i++) {
			if (scores[i] > 90 && scores[i] <= 100) {
				grade = 'A';
			} else if (scores[i] > 80 && scores[i] <= 90) {
				grade = 'B';
			} else if (scores[i] > 70 && scores[i] <= 80) {
				grade = 'C';
			} else if (scores[i] > 60 && scores[i] <= 70) {
				grade = 'D';
			} else {
				grade = 'E';
			}
			output = output + "\n" + "Student " + (i + 1) + " score is "
					+ scores[i] + " and grade is " + grade;
		}
		System.out.println(output);
	}

}
