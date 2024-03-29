package _3_Array_to_java.exercise;

import java.util.Scanner;

public class find_maxElement_In_Array2 {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int x, y;
        do {
            System.out.println("Enter row : ");
            x = kb.nextInt();
            System.out.println("Enter column : ");
            y = kb.nextInt();
        } while (x < 2 || y < 2);
        int[][] arr = new int[x][y];
        for (int i = 0; i < arr.length; i++)
            for (int j = 0; j < arr[0].length; j++) {
                System.out.println("Enter arr[" + i + "][" + j + "] : ");
                arr[i][j] = kb.nextInt();
            }
        int max = arr[0][0];
        for (int i = 0; i < arr.length; i++)
            for (int j = 0; j < arr[0].length; j++) {
                max = max2nb(arr[i][j], max);
            }
        System.out.println("Max element of arr is : " + max);
    }

    public static int max2nb(int a, int b) {
        int max;
        if (a > b) {
            max = a;
        } else max = b;
        return max;
    }
}
