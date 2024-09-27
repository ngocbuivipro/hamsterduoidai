package exercise10;

import java.util.Scanner;

public class Twocircles {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter 1st circle's x-, y- coordinates: ");
		double x1 = sc.nextDouble();
		double y1 = sc.nextDouble();
		System.out.println("Enter 1st circle's radius: ");
		double r1 = sc.nextDouble();
		

		System.out.println("Enter 2st circle's x-, y- coordinates: ");
		double x2 = sc.nextDouble();
		double y2 = sc.nextDouble();
		System.out.println("Enter 2st circle's radius: ");
		double r2 = sc.nextDouble();
		
		//Tinh toan khoang cach giua 2 circles
		double distance = Math.sqrt(Math.pow((x2-x1), 2) + Math.pow((y2 - y1), 2));
		
		//Kiem tra vi tri giua hai duong tron
		if (distance < Math.abs(r1 - r2)) {                                     
			System.out.println("2nd circle is inside the 1st circle");
		} else if (distance <= Math.abs(r1 + r2)) {                              
			System.out.println("2nd circle is overlap with the 1st circle");
		} else {
			System.out.println("2nd circle is outside the 1st circle");
		}
		sc.close();
	}

}


//**Circle 2 is inside circle 1**: (d < |r₁ - r₂|)
//**Circle 2 overlaps with circle 1**: (d <= r₁ + r₂)
//**Circle 2 does not overlap and is not inside circle 1**: (d > r₁ + r₂) or (d > |r₁ - r₂|)

