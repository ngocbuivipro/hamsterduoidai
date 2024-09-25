package exercise02;

import java.util.Scanner;

public class RunwayLength {
	public static void main(String[] args) {
    
	Scanner sc = new Scanner(System.in);
	System.out.println("The Acceleration a of the plane is (m/s2): ");
	double a = sc.nextDouble();
	
	System.out.println("The speed of the plane is (m/s): ");
	double v = sc.nextDouble();	
	
	double l = (Math.pow(v, 2) / ( 2 * a ));
	
	System.out.println("The Min runway length needed for this airplane is: " + l);
	
	
	}

}
