package exercise07;

import java.util.Scanner;

public class PointinaRectangle {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a point with two coordinates: ");
		double x = sc.nextDouble();
		double y = sc.nextDouble();
		
		double horizontal = 10 / 2;
		double vertical = 5 / 2;
		
		if (Math.abs(x) <= horizontal && Math.abs(y) <= vertical) {
			System.out.println("Point (" + x + ", " + y + ") is in the rectangle.");
		} else {
			System.out.println("Point (" + x + ", " + y + ") is not in the rectangle.");
			
		}
		sc.close();
	}

}
