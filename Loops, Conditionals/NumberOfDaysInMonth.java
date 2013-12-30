import java.util.Scanner;

public class NumberOfDaysInMonth {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);

		System.out.println("Enter month: ");
		int month = s.nextInt();
		System.out.println("Enter year");
		int year = s.nextInt();
		int numberOfDaysInMonth = 0;
		switch (month) {
		case 1:
			System.out.println("January " + year);
			numberOfDaysInMonth = 31;
			break;
		case 2:
			System.out.println("February " + year);
			numberOfDaysInMonth = 28;
			break;
		case 3:
			System.out.println("March " + year);
			numberOfDaysInMonth = 31;
			break;
		case 4:
			System.out.println("April " + year);
			numberOfDaysInMonth = 30;
			break;
		case 5:
			System.out.println("May " + year);
			numberOfDaysInMonth = 31;
			break;
		case 6:
			System.out.println("June " + year);
			numberOfDaysInMonth = 30;
			break;
		case 7:
			System.out.println("July " + year);
			numberOfDaysInMonth = 31;
			break;
		case 8:
			System.out.println("August " + year);
			numberOfDaysInMonth = 31;
			break;
		case 9:
			System.out.println("September " + year);
			numberOfDaysInMonth = 30;
			break;
		case 10:
			System.out.println("October " + year);
			numberOfDaysInMonth = 31;
			break;
		case 11:
			System.out.println("November " + year);
			numberOfDaysInMonth = 30;
			break;
		case 12:
			System.out.println("December " + year);
			numberOfDaysInMonth = 31;
			break;

		}
		System.out.print("has " + numberOfDaysInMonth + " days");

	}

}
