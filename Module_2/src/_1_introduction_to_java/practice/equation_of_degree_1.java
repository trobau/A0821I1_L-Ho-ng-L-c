package _1_introduction_to_java.practice;

import java.util.Scanner;

public class equation_of_degree_1 {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        double a,b,c;
        System.out.println("Enter a : ");
        a = kb.nextDouble();
        System.out.println("Enter b : ");
        b = kb.nextDouble();
        System.out.println("Enter c : ");
        c = kb.nextDouble();
        if (a != 0) {
            double answer = (c - b) / a;
            System.out.printf("Equation pass with x = %f!\n", answer);
        } else {
            if (b == c) {
                System.out.print("The solution is all x!");
            } else {
                System.out.print("No solution!");
            }
        }
    }
}
