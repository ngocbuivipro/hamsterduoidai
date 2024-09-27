package exercise08;

import java.util.Scanner;

public class PointinaTriangle {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a point's x- and y- coordinates: ");
		double x = sc.nextDouble();
		double y = sc.nextDouble();

		boolean point = (x >= 0 && x <= 200) && (y >= 0 && y <= 100 - (0.5 * x));

		if (point) {
			System.out.println("Point (" + x + ", " + y + ") is inside the triangle.");
		} else {
			System.out.println("Point (" + x + ", " + y + ") is outside the triangle.");
		}

		sc.close();
	}

}
