package exercise05;

import java.util.Scanner;

public class CheckISBN10 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the first 9 digits of an ISBN as interger:");
		int input = sc.nextInt();
		
		//Tach cac chu so
		int d1 = (input / 100000000) % 10;
		int d2 = (input / 10000000) % 10;
		int d3 = (input / 1000000) % 10;
		int d4 = (input / 100000) % 10;
		int d5 = (input / 10000) % 10;
		int d6 = (input / 1000) % 10;
		int d7 = (input / 100) % 10;
		int d8 = (input / 10) % 10;
		int d9 = input / 1 % 10;
		
		//Tinh chu so cuoi can kiem tra
		int checksum = (d1*1 + d2*2 + d3*3 + d4*4 + d5*5 + d6*6 + d7*7 + d8*8 + d9*9) % 11;
		
		
		if (checksum == 10) {
			System.out.println("The ISBN-10 is "+ input + "X");
		} else {
			System.out.println("The ISBN-10 is "+ input + checksum);
		}
		sc.close();	
		}

}
