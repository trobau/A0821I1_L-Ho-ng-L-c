package _1_introduction_to_java.exercise;

import java.util.Scanner;

public class show_greeting {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        System.out.println("Enter your name");
        String name = kb.nextLine();
        System.out.println("Hello : "+name);
    }
}
