package exercise03;

import java.util.Scanner;

public class AlgebraQuadraticEquations {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		
	System.out.println("Enter a: ");
	double a = sc.nextDouble();
	System.out.println("Enter b: ");
	double b = sc.nextDouble();
	System.out.println("Enter c: ");
	double c = sc.nextDouble();
	
	
//Tinh dinh thuc delta cua phuong trinh bac 2
	double dis = b*b - 4*a*c;
	
	if ( dis > 0 ) {
		double r1 = (-b + Math.sqrt(dis)) / (2*a);
		double r2 = (-b - Math.sqrt(dis)) / (2*a);
	System.out.println("The equation has two roots " + r1 + " and " + r2);
    
	} else if ( dis == 0) {
		double r = -b / (2*a);
		System.out.println("The equation has one root " + r);
		
	} else {
		System.out.println("The equation has no real roots.");
	}
	
	sc.close();
	}

}
