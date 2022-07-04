
import java.util.Scanner;

public class perfectNumber {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter your number: ");
        int number = scan.nextInt();
        if(checkForPerfect(number)){
            System.out.println(number + " is perfect number");
        }
        else{
            System.out.println(number + " is not perfect number");
        }

    }

    static boolean checkForPerfect(Integer s) {

        int temp = 0;
        for (int i = 1; i < s; i++) {
            if (s % i == 0)
                temp += i;
        }

        if (temp == s) {
            return true;
        } else {
            return false;
        }
    }
}