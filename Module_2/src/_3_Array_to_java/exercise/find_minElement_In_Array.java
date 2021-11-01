package _3_Array_to_java.exercise;

import java.util.Scanner;

public class find_minElement_In_Array {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int x;
        do {
            System.out.println("Enter length array : ");
            x = kb.nextInt();
        }while (x<2);
        int[] arr = new int[x];
        for (int i = 0;i<arr.length;i++){
            System.out.println("Enter arr["+i+"] : ");
            arr[i] = kb.nextInt();
        }
        int min = arr[0];
        for (int j = 0;j<arr.length;j++){
            min = min2nb(arr[j],min);
        }
        System.out.println("Min element of arr is : "+min);
    }
    public static int min2nb(int a,int b){
        int min;
        if (a<b){
            min = a;
        }else min = b;
        return min;
    }
}
