package _3_Array_to_java.exercise;

import java.util.Arrays;
import java.util.Scanner;

public class insert_Element_In_Array {
    public static void main(String[] args) {
        int N;
        int[] array;
        Scanner kb = new Scanner(System.in);
        do {
            System.out.print("Enter a size:");
            N = kb.nextInt();
            if (N < 2)
                System.out.println("Size is illegal");
        } while (N < 2);
        array = new int[N];
        int i = 0;
        while (i < array.length) {
            System.out.print("Enter element" + (i + 1) + " : ");
            array[i] = kb.nextInt();
            i++;
        }
        int[] array1 = new int[array.length+1];
        System.arraycopy(array,0,array1,0,array.length);
        System.out.println("Enter a number need to insert");
        int X = kb.nextInt();
        System.out.println("Enter a index need to insert");
        int index = kb.nextInt();
        for (int j = array1.length-1;j>index;j-- ){
            array1[j] = array1[j-1];
        }
        array1[index] = X;
        System.out.println(Arrays.toString(array1));
    }
}
