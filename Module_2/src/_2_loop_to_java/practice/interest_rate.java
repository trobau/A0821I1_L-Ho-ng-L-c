package _2_loop_to_java.practice;

import java.util.Scanner;

public class interest_rate {
    public static void main(String[] args) {
        double money = 0;
        int month = 1;
        double interest_rate = 1.0;
        Scanner kb = new Scanner(System.in);
        System.out.println("Enter investment a mount: ");
        money = kb.nextDouble();
        System.out.println("Enter number of months: ");
        month = kb.nextInt();
        System.out.println("Enter annual interest rate in percentage: ");
        interest_rate = kb.nextDouble();
        double total_interest = 0;
        for (int i =0;i < month;i++){
            total_interest = money*(interest_rate/100/12)*3;
        }
        System.out.println("Total of interest: "+total_interest);
    }
}
