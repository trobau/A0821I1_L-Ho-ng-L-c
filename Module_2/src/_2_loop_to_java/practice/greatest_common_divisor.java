package _2_loop_to_java.practice;

import java.util.Scanner;

public class greatest_common_divisor {
    public static void main(String[] args) {
            int a,b;
            Scanner kb = new Scanner(System.in);
        System.out.println("Enter a: ");
        a = kb.nextInt();
        System.out.println("Enter b: ");
        b = kb.nextInt();
        a = Math.abs(a);
        b = Math.abs(b);
        if (a == 0 || b == 0) {
            System.out.println("No greatest common factor");
        }
        while (a != b) {
            if (a > b)
                a = a - b;
            else
                b = b - a;
        }
        System.out.println("Greatest common factor: " + a);
    }
}
