package exercise09;

import java.util.Scanner;

public class Tworectangles {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		// HCN thu 1
		System.out.println("Enter r1's center x-coordinate :");
		double x1 = sc.nextDouble();
		System.out.println("Enter r1's center y-coordinate :");
		double y1 = sc.nextDouble();
		System.out.println("Enter r1's width: ");
		double w1 = sc.nextDouble();
		System.out.println("Enter r1's height: ");
		double h1 = sc.nextDouble();

		// HCN thu 2
		System.out.println("Enter r2's center x-coordinate :");
		double x2 = sc.nextDouble();
		System.out.println("Enter r2's center y-coordinate :");
		double y2 = sc.nextDouble();
		System.out.println("Enter r2's width: ");
		double w2 = sc.nextDouble();
		System.out.println("Enter r2's height: ");
		double h2 = sc.nextDouble();

		// Tinh toan cac canh cua hinh chu nhat
		double l1 = x1 - w1 / 2;
		double r1 = x1 + w1 / 2;
		double b1 = y1 - h1 / 2;
		double t1 = y1 + h1 / 2;

		double l2 = x2 - w2 / 2;
		double r2 = x2 + w2 / 2;
		double b2 = y2 - h2 / 2;
		double t2 = y2 + h2 / 2;

		// Kiem tra xem HCN2 nam dau ngoai hay trong so voi HCN1
		boolean locate = (l2 >= l1 && r2 <= r1 && b2 >= b1 && t2 <= t1);

		// Kiem tra xem co overlaps khong ?
		boolean overlap = !(l2 > r1 || r2 < l1 || t2 < b1 || b2 > t1);

		// Ket qua
		if (locate) {
			System.out.println("The 2nd rectangle is inside the 1st rectangle. ");
		} else if (overlap) {
			System.out.println("The 2nd rectangle is overlaps the 1st rectangle. ");
		} else {
			System.out.println("The 2nd rectangle is outside the 1st rectangle");
		}

		sc.close();
	}

}
