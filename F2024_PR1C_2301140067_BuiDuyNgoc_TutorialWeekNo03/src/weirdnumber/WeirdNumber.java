package weirdnumber;

import java.util.Scanner;

public class WeirdNumber {
	public static void main(String[] args) {
		
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter an integer: ");
    int n = sc.nextInt();
    
    if (n % 2 != 0 ) {
    	System.out.println("Weird");
    } else if (n % 2 == 0 && 2 <= n && n <= 5) {
    	System.out.println("Not Weird");
    } else if (n % 2 == 0 && 6 <= n && n <= 20) {
    	System.out.println("Weird");
    } else if (n % 2 == 0 && 20 < n ) {
    	System.out.println("Not Weird");
    }
    sc.close();
	}

}
