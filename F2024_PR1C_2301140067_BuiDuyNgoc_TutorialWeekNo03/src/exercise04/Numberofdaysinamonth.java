package exercise04;

import java.util.Scanner;

public class Numberofdaysinamonth {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter month (1-12): ");
		int month = sc.nextInt();
		System.out.print("Enter year: ");
		int year = sc.nextInt();

		int daysInMonth = 0;

		switch (month) {
		case 1:
		case 3:
		case 5:
		case 7:
		case 8:
		case 10:
		case 12:
			daysInMonth = 31;
			break;
		case 4:
		case 6:
		case 9:
		case 11:
			daysInMonth = 30;
			break;
		case 2:
			if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
				daysInMonth = 29;
			} else {
				daysInMonth = 28;
				break;
			}
		default:
			System.out.println("Invalid month. Please enter a month between 1 and 12.");
			sc.close();
			break;
		}

		System.out.println("The month " + month + " in the year " + year + " has " + daysInMonth + " days.");

		sc.close();

	}
}