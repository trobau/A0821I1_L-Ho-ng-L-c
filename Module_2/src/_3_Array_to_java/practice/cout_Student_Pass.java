package _3_Array_to_java.practice;

import java.util.Scanner;

public class cout_Student_Pass {
    public static void main(String[] args) {
        int size;
        int[] array;
        Scanner kb = new Scanner(System.in);
        do {
            System.out.print("Enter a size:");
            size = kb.nextInt();
            if (size > 30)
                System.out.println("Size should not exceed 30");
        } while (size > 30);
        array = new int[size];
        int i = 0;
        while (i < array.length) {
            System.out.print("Enter a mark for student " + (i + 1) + ": ");
            array[i] = kb.nextInt();
            i++;
        }
        int count = 0;
        System.out.print("List of mark: ");
        for (int k : array) {
            System.out.print(k + "\t");
            if (k >= 5 && k <= 10)
                count++;
        }
        System.out.print("\n The number of students passing the exam is " + count);
    }

}
