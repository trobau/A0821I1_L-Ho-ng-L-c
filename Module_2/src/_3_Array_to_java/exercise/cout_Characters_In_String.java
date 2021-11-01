package _3_Array_to_java.exercise;

import java.util.Scanner;

public class cout_Characters_In_String {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        String string;
        char characters = 'a';
        int count = 0;
        System.out.println("Enter a string: ");
        string = kb.nextLine();
        for (int i = 0; i < string.length(); i++) {
            if (string.charAt(i) == characters) {
                count++;
            }
        }

        System.out.println("The number of occurrences  " +characters +
                " in chain " + string + " = " + count);
    }
}
