package _1_introduction_to_java.exercise;

import java.util.Scanner;

public class numbers_into_letters {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        System.out.println("Enter number need read");
        int number = kb.nextInt();
        if (number >= 0 && number < 10) {
            if (number == 0){
                System.out.println("zero");
            }else{
                System.out.println(readOnes(number));
            }
        } else if (number < 20) {
            switch (number) {
                case 10:
                    System.out.println("ten");
                    break;
                case 11:
                    System.out.println("eleven");
                    break;
                case 12:
                    System.out.println("twelve");
                    break;
                case 13:
                    System.out.println("thirteen");
                    break;
                case 14:
                    System.out.println("fourteen");
                    break;
                case 15:
                    System.out.println("fifteen");
                    break;
                case 16:
                    System.out.println("sixteen");
                    break;
                case 17:
                    System.out.println("seventeen");
                    break;
                case 18:
                    System.out.println("eightteen");
                    break;
                case 19:
                    System.out.println("nineteen");
                    break;
                default:
                    System.out.println("out of ability");
            }
        } else if (number < 100) {
            String tens = readTens(number/10);
            String ones = readOnes(number%10);
            System.out.println(tens+" "+ones);
        }else if (number<1000){
            String hundred = readOnes(number/100)+" hundred";
            String tens = readTens((number%100)/10);
            String ones = readOnes(number%10);
            if(tens.equals("") && ones.equals("")){
                System.out.println(hundred);
            }else
                System.out.println(hundred+" and "+tens+" "+ones);
        }else System.out.println("out of scope of request");
    }

    public static String readOnes(int number) {
        String ones;
        switch (number) {
            case 0:
                ones = "";
                break;
            case 1:
                ones = "one";
                break;
            case 2:
                ones = "two";
                break;
            case 3:
                ones = "three";
                break;
            case 4:
                ones = "four";
                break;
            case 5:
                ones = "five";
                break;
            case 6:
                ones = "six";
                break;
            case 7:
                ones = "seven";
                break;
            case 8:
                ones = "eight";
                break;
            case 9:
                ones = "nine";
                break;
            default:
                ones = " ";
        }
        return ones;
    }

    public static String readTens(int number) {
        String tens;
        switch (number) {
            case 2:
                tens = "twenty";
                break;
            case 3:
                tens = "thirty";
                break;
            case 4:
                tens = "forty";
                break;
            case 5:
                tens = "fifty";
                break;
            case 6:
                tens = "sixty";
                break;
            case 7:
                tens = "seventy";
                break;
            case 8:
                tens = "eighty";
                break;
            case 9:
                tens = "ninety";
                break;
            default:
                tens = "";
        }
        return tens;
    }
}
