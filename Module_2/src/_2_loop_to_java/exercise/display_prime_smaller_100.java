package _2_loop_to_java.exercise;

public class display_prime_smaller_100 {
    public static void main(String[] args) {
        for (int i = 2;i<=100;i++){
            if(isPrime(i))
                System.out.println(i);
        }
    }
    public static boolean isPrime(int number){
        boolean check = true;
        if (number < 2)
            check = false;
        else {
            int i = 2;
            while (i <= Math.sqrt(number)){
                if (number%i == 0){
                    check = false;
                    break;
                }
                i++;
            }
        }
        return check;
    }
}
