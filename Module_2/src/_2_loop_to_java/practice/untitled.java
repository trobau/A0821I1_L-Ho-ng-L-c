package _2_loop_to_java.practice;

import java.util.Scanner;

public class untitled {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        System.out.println("Enter a number");
        int number = kb.nextInt();
        if (number < 2)
            System.out.println(number + " is not a prime");
        else {
            int i = 2;
            boolean check = true;
            while (i <= Math.sqrt(number)){
                if (number%i == 0){
                    check = false;
                    break;
                }
                i++;
            }
            if(check)
                System.out.println(number + " is a prime");
            else
                System.out.println(number + " is not a prime");

        }
    }
}
