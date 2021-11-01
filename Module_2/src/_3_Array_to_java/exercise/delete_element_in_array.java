package _3_Array_to_java.exercise;

import java.util.Scanner;

public class delete_element_in_array {
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
        System.out.print("Enter a number need to find:");
        int X = kb.nextInt();
        int index = findElement(array,X);
        if (index == -1){
            System.out.println("not find value");
        }else
        {
            int[] z = deleteIndexInArray(array,index);
            for (int y : z){
                System.out.println(y);
            }
        }
    }
    public static int findElement(int[] arr,int X){
        int isExist = -1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]==X) {
                isExist = i;
                break;
            }
        }
        return isExist;
    }
    public static int[] deleteIndexInArray(int[] arr,int index){
        int[] arr1 = new int[arr.length-1];
        for (int i=0;i<index;i++){
            arr1[i]=arr[i];
        }
        for (int i=index;i<arr.length-1;i++){
            arr1[i]=arr[i+1];
        }
        return arr1;
    }
}
