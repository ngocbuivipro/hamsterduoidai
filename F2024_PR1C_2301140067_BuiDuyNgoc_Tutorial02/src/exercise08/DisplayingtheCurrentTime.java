package exercise08;

import java.util.Scanner;

public class DisplayingtheCurrentTime {
    public static void main( String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter currentTimeMillis:");
        double ms = input.nextDouble();
        long s;
        s = (long) (ms / 1000) ;
        long min;
        min = (s / 60) ;
        long hour;
        hour = (min / 60) % 24;
        s = s % 60;
        min = min % 60;
        System.out.printf("Current time (GMT): %2s:%2s:%2s", +hour, +min, +s);

    }
}
