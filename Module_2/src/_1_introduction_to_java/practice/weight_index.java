package _1_introduction_to_java.practice;

import java.util.Scanner;

public class weight_index {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        double weight, height, bmi;
        System.out.print("Your weight (in kilogram):");
        weight = kb.nextDouble();

        System.out.print("Your height (in meter):");
        height = kb.nextDouble();
        bmi = weight / Math.pow(height, 2);
        System.out.printf("%-20s%s", "bmi", "Interpretation\n");

        if (bmi < 18)
            System.out.printf("%-20.2f%s", bmi, "Underweight");
        else if (bmi < 25.0)
            System.out.printf("%-20.2f%s", bmi, "Normal");
        else if (bmi < 30.0)
            System.out.printf("%-20.2f%s", bmi, "Overweight");
        else
            System.out.printf("%-20.2f%s", bmi, "Obese");
    }
}
