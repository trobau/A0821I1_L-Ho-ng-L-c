package _3_Array_to_java.exercise;

import java.util.Arrays;
import java.util.Scanner;

public class concat_Array {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        System.out.println("Enter length of arr1");
        int x = kb.nextInt();
        System.out.println("Enter length of arr2");
        int y = kb.nextInt();
        int[] arr1 = new int[x];
        int[] arr2 = new int[y];
        int[] arr3 = new int[x+y];
        System.out.println("Enter arr1:");
        for (int i = 0;i < arr1.length;i++){
            System.out.println("Enter arr1[ "+i+"]");
            arr1[i] = kb.nextInt();
        }
        System.out.println("Enter arr2:");
        for (int j = 0;j < arr2.length;j++){
            System.out.println("Enter arr2[ "+j+"]");
            arr2[j] = kb.nextInt();
        }
        System.arraycopy(arr1,0,arr3,0,arr1.length);
        System.arraycopy(arr2,0,arr3,arr1.length,arr2.length);
        System.out.println(Arrays.toString(arr3));

    }
}
