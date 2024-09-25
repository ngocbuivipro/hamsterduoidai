package exercise04;

import java.util.Scanner;

public class TriangleArea {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first points of the Triangle: ");
		double x1 = sc.nextDouble();
		double y1 = sc.nextDouble();
		
		System.out.println("Enter second points of the Triangle: ");
		double x2 = sc.nextDouble();
		double y2 = sc.nextDouble();
		
		System.out.println("Enter third points of the Triangle: ");
		double x3 = sc.nextDouble();
		double y3 = sc.nextDouble();
		
		
		
		double side1 = Math.sqrt(Math.pow((x2 - x1), 2) + Math.pow((y2 - y1), 2)); //Tính cạnh AB

		double side2 = Math.sqrt(Math.pow((x3 - x2), 2) + Math.pow((y3 - y2), 2)); //Tính cạnh BC
		
		double side3 = Math.sqrt(Math.pow((x3 - x1), 2) + Math.pow((y3 - y1), 2)); //Tính cạnh AC
		
		
		double s = (side1 + side2 + side3) / 2;
		
		double area = Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));
		
		System.out.println("The area of the triangle is: "+ area);
		
		sc.close();
		
	}

}
