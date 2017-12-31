package com.company;
import java.util.Scanner;
/* Credit Limit: takes in an account number, beginning balance, total charge for the month, total credit for the month, and an allowed limit

 */
public class CreditLimit {
    public static void main(String[] args) {
        //Declare variables all of type int
        int accountNumber;
        int beginBalance;
        int totalchargeMonth;
        int totalcreditMonth;
        int allowedLimit;
        int newBalance;
        //Input all as integers: probably a better way to I/O but I'll do it traditional way
        Scanner input = new Scanner(System.in);
        System.out.printf("Please enter value for account number: ");
        accountNumber= input.nextInt();
        System.out.printf("Please enter value for begin balance: ");
        beginBalance= input.nextInt();
        System.out.printf("Please enter value for total charge month: ");
        totalchargeMonth= input.nextInt();
        System.out.printf("Please enter in value for total credit month: ");
        totalcreditMonth= input.nextInt();
        System.out.printf("Please enter value for allowed credit limits: ");
        allowedLimit= input.nextInt();
        //new balance is just the beginning balance plus total charge for the month minus credit
        newBalance= beginBalance + totalchargeMonth - totalcreditMonth;
        //Determines if one has passed the allowed limit.
        if(newBalance > allowedLimit){
            System.out.println("You have exceeded limit!");
        }
        else{
            System.out.printf("Account number: %d\n, Begining balance: %d\n, Total charge: %d\n, Total credit: %d\n, Credit Limit: %d\n",accountNumber, beginBalance, totalchargeMonth, totalcreditMonth, allowedLimit );
        }

    }
}
