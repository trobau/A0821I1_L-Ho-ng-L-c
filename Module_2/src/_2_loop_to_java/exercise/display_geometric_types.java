package _2_loop_to_java.exercise;

import java.util.Scanner;

public class display_geometric_types {
    public static void main(String[] args) {
        int choice = -1;
        Scanner kb = new Scanner(System.in);
        while(choice != 0) {
            System.out.println("Menu");
            System.out.println("1. Print the rectangle");
            System.out.println("2. Print the square triangle (The corner is square at 4 different angles: top-left, top-right, botton-left, botton-right)");
            System.out.println("3. Print isosceles triangle");
            System.out.println("0. Exit");
            System.out.println("Enter your choice: ");
            choice = kb.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("Enter long");
                    int cd = kb.nextInt();
                    System.out.println("Enter wide");
                    int cr = kb.nextInt();
                    for (int i = 0;i<cd;i++){
                        for (int j =0;j<cr;j++){
                            System.out.print("*");
                        }
                    System.out.println();
                }
                    break;
                case 2:
                    int choice1 = -1;
                    while(choice1 != 0) {
                        System.out.println("Menu");
                        System.out.println("1. Print the square triangle top-left");
                        System.out.println("2. Print the square triangle top-right");
                        System.out.println("3. Print the square triangle botton-left");
                        System.out.println("4. Print the square triangle botton-right");
                        System.out.println("0. Exit");
                        System.out.println("Enter your choice: ");
                        choice1 = kb.nextInt();
                        switch (choice1) {
                            case 1:
                                System.out.println("Print the square triangle top-left");
                                System.out.println("Enter long");
                                int cd1 = kb.nextInt();
                                for(int i=cd1;i>=1;i--){
                                    for(int j=1;j<=i;j++){
                                        System.out.print("*");
                                    }
                                    System.out.println();
                                }

                                break;
                            case 2:
                                System.out.println("Print the square triangle top-right");
                                System.out.println("Enter long");
                                int cd2 = kb.nextInt();
                                for(int i = 1;i<=cd2;i++){
                                    for(int j=1;j<=cd2;j++){
                                        if(i>j)
                                            System.out.print(" ");
                                        else
                                            System.out.print("*");
                                    }
                                    System.out.println();
                                }
                                break;
                            case 3:
                                System.out.println("Print the square triangle botton-left");
                                System.out.println("Enter long");
                                int cd3 = kb.nextInt();
                                for(int i=1;i<=cd3;i++){
                                    for(int j=1;j<=i;j++){
                                        System.out.print("*");
                                    }
                                    System.out.println();
                                }

                                break;
                            case 4:
                                System.out.println("Print the square triangle botton-right");
                                System.out.println("Enter long");
                                int cd4 = kb.nextInt();
                                for(int i = cd4;i>=1;i--){
                                    for(int j=1;j<=cd4;j++){
                                        if(i>j)
                                            System.out.print(" ");
                                        else
                                            System.out.print("*");
                                    }
                                    System.out.println();
                                }
                                break;
                            case 0:
                                choice1 = 0;
                            default:
                                System.out.println("No choice!");
                        }
                    }
                    break;
                case 3:
                    System.out.println("Print isosceles triangle");
                    System.out.println("Enter long");
                    int cd5 = kb.nextInt();
                    for (int i = 1;i <=cd5;i++){
                        for (int j = 1;j<= 2*cd5 -1;j++){
                            if (j<=cd5-i||j>=cd5+i)
                                System.out.print(" ");
                            else
                                System.out.print("*");
                        }
                        System.out.println();
                    }
                    break;
                case 0:
                    System.exit(0);
                default:
                    System.out.println("No choice!");
            }
        }
    }
}
