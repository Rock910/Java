package com.company;
import java.util.Scanner;
public class GasMileage {
    /*Gas mileage has two inputs, milesDriven and gallon
    * Where milesDriven: int-> int, is the number of miles driven
    * gallon: int-> int : amount of gallons used
    * trip: gallons per miles, so gallons * miles
    * Used sentinel controlled repetition
    * (as shown by the sentinel -1)*/
    public static void main(String[] args) {
        int milesDriven;
        int gallon;
        int trip;
        int total = 0;
        int counter = 0;
        Scanner input= new Scanner(System.in);
        System.out.print("Please enter in value for gallon: ");
        gallon= input.nextInt();
        System.out.print("Please enter in value for miles driven: ");
        milesDriven= input.nextInt();
        trip= gallon * milesDriven;
        while(gallon != -1){
            total= trip + total;
            counter= counter++;
            System.out.print("Enter in gallon or -1: ");
            gallon= input.nextInt();
            System.out.print("Enter in mileage: ");
            milesDriven= input.nextInt();
        }
    System.out.printf("\n Total of %d and %d is %d\n", milesDriven, gallon, total);

    }
}
