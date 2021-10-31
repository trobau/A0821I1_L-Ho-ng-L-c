package _1_introduction_to_java.exercise;

import java.util.Scanner;

public class currency_conversion_app {
    public static void main(String[] args) {
        double vnd = 23000;
        double usd;
        Scanner kb = new Scanner(System.in);
        System.out.println("Enter USD : ");
        usd = kb.nextDouble();
        double conversion = usd*vnd;
        System.out.println("VND : "+conversion);
    }
}
