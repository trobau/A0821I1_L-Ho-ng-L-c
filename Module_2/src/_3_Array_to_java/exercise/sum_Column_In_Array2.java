package _3_Array_to_java.exercise;

import java.util.Scanner;

public class sum_Column_In_Array2 {
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
        int column;
        int sum = 0;
        do {
            System.out.println("Enter a number column : ");
            column = kb.nextInt();
        } while (column > arr[0].length - 1);
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i][column];
        }
        System.out.println("Sum of column "+column+"is : " +sum);
    }
}
