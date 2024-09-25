package exercise05;

import java.util.Scanner;

public class CountingMonetaryUnits {
	
    public static void main(String[] args){
    	
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the amount in dollars and cents:");
        double x= input.nextDouble();
        
        int totalCents = (int) Math.round(x*100);
        int dollars = totalCents / 100;
        int remainingC = totalCents % 100;
        int quarters = remainingC / 25;
        remainingC = remainingC % 25;
        int dimes = remainingC / 10;
        remainingC = remainingC % 10;
        int nickels = remainingC / 5;
        remainingC = remainingC % 5;
        int pennies = remainingC;
        
        System.out.println("Monetary equivalent:");
        System.out.println("Dollars: " + dollars);
        System.out.println("Quarters: " + quarters);
        System.out.println("Dimes: " + dimes);
        System.out.println("Nickels: " + nickels);
        System.out.println("Pennies: " + pennies);
    }
}
