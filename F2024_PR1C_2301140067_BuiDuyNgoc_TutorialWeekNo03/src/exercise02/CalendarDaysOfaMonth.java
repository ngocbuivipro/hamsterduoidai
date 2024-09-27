package exercise02;

import java.util.Scanner;

public class CalendarDaysOfaMonth {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a year: ");
		int year = sc.nextInt();
		
		System.out.println("Enter the first three letters of a month name (e.g., Jan, Feb): ");
		String month = sc.next();
		
		int days = 0;
		switch (month) {
		case "Jan":
		case "jan":
			days = 31;
			break;
		case "Feb":
		case "feb":
			if ((year % 4 == 0 && year % 100 !=0) || ( year % 400 == 0)) {
				days = 29; //This is leap year
			} else { 
				days = 28;
			}
			break;
		case "Mar":
		case "mar":
			days = 31;
			break;
		case "Apr":
		case "apr":
			days = 30;
			break;
		case "May":
		case "may":
			days = 31;
			break;
		case "Jun":
		case "jun":
			days = 30;
			break;
		case "Jul":
		case "jul":
			days = 31;
			break;
		case "Aug":
		case "aug":
			days = 31;
			break;
		case "Sep":
		case "sep":
			days = 30;
			break;
		case "Oct":
		case "oct":
			days = 31;
			break;
		case "Nov":
		case "nov":
			days = 30;
			break;
		case "Dec":
		case "dec":
			days = 31;
			break;
		default:
			System.out.println("Unknown month name");
			sc.close();
			break;	
	
		}
		System.out.println(year +" "+ month +" has " + days + " days");
	}

}
