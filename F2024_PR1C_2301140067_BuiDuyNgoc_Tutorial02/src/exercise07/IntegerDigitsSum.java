package exercise07;

import java.util.Scanner;

public class IntegerDigitsSum {
    public static void main( String[] args){
        Scanner input= new Scanner(System.in);
        System.out.println("Enter a number between 0 and 1000");
        int x = input.nextInt();
        int x1;
        x1 = x % 10;
        x = x / 10;
        int x2;
        x2 = x % 10;
        x = x / 10;
        int x3;
        x3 = x;
        int sum;
        sum = x1 + x2 + x3;
        System.out.println("The sum of the digits:"+sum);

    }
}
