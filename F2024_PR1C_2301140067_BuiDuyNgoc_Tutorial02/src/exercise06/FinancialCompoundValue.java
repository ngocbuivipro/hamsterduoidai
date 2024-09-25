package exercise06;

import java.util.Scanner;

public class FinancialCompoundValue {
    public static void main(String[] args) {    	
        Scanner input= new Scanner(System.in);
        
        System.out.println("Enter money saving:");
        double x= input.nextDouble();
        double monthlyRates= 0.5 / 12;
        
        double value1;
        value1= x * (1 + monthlyRates);
        double value2;
        value2= (x + value1) * (1 + monthlyRates);
        double value3;
        value3= (x + value2) * (1 + monthlyRates);
        double value4;
        value4= (x + value3) * (1 + monthlyRates);
        double value5;
        value5= (x + value4) * (1 + monthlyRates);
        double value6;
        value6= (x + value5) * (1 + monthlyRates);
        
        System.out.println("The account value after sixth month:"+value6);

    }
}
