package exercise06;

import java.util.Scanner;

public class PointinaCircle {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a point with two coordinates: ");

		double x = sc.nextDouble();
		double y = sc.nextDouble();

		double distance = Math.sqrt(x * x + y * y);

		if (distance > 10) {
			System.out.println("Point (" + x + ", " + y + ") is outside the circle.");
		} else {
			System.out.println("Point (" + x + ", " + y + ") is inside the circle.");
		}
		sc.close();
	}

}
