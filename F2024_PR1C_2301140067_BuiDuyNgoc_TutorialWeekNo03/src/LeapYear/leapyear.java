package LeapYear;
import java.util.Scanner;

public class leapyear {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a year: ");
		int year = sc.nextInt();
		
		if ( year % 4 !=0 )                   {
			System.out.println("This is not a leap year !");
		} else if ( year % 100 != 0)          {
			System.out.println("This is a leap year");
		} else if ( year % 400 != 0 )         {
			System.out.println("This is not a leap year");
		} else {
			System.out.println("This is a leap year");
			
		}
		
		
		sc.close();
	}
}
