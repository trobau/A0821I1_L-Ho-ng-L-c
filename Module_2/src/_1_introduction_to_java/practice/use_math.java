package _1_introduction_to_java.practice;

import java.util.Scanner;

public class use_math {
    public static void main(String[] args) {
            Scanner kb = new Scanner(System.in);
        float width;
        float height;
        System.out.println("Enter width");
        width = kb.nextFloat();
        System.out.println("Enter height");
        height = kb.nextFloat();
        float area = width*height;
        System.out.println("Area is: "+area);
    }
}
