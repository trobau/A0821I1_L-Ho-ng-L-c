package _3_Array_to_java.exercise;

import java.util.Scanner;

public class diagonal_Of_Square_Matrix {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int x, y;
        do {
            System.out.println("Enter row : ");
            x = kb.nextInt();
        } while (x < 2);
        int[][] arr = new int[x][x];
        for (int i = 0; i < arr.length; i++)
            for (int j = 0; j < arr[0].length; j++) {
                System.out.println("Enter arr[" + i + "][" + j + "] : ");
                arr[i][j] = kb.nextInt();
            }
        int sum1 =0,sum2 = 0;
        for(int i = 0;i<arr.length;i++){
            sum1 += arr[i][i];
        }
        for (int i = arr.length-1;i>=0;i--){
            sum2+=arr[i][arr.length-i-1];
        }
        System.out.println("Sum diagonals : "+"Sum1 = "+sum1+"\t"+"Sum2 = "+sum2);
    }
}
