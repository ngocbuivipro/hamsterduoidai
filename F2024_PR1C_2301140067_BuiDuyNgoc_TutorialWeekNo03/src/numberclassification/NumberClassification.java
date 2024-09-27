package numberclassification;

import java.util.Scanner;

public class NumberClassification {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter an integer: ");
		int n = sc.nextInt();
		
		if (n < 0) {
			System.out.println("Negative Number");
		} else if (n == 0) {
			System.out.println("Zero");
			
		} else if (n > 0 && n % 2 != 0) {
			System.out.println("Positive Odd Number");
			
		} else if (n > 0 && n % 2 == 0) {
			System.out.println("Positive Even Number");
		}
		
		
		
		sc.close();
	}

}
