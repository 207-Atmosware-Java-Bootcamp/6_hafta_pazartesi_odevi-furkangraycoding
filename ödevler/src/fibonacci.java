
import java.util.Scanner;

public class fibonacci {

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Step number : ");
        int inputNum = scan.nextInt();
        System.out.println("Iteration method");
        fibonacci(inputNum);
        System.out.println("\nRecursive method");
        for (int i = 0; i < inputNum; i++) {
            System.out.print(recFib(i) + "-");} }



    static void fibonacci(int number) {
        int a1 = 0, a2 = 1;
        int counter = 0;
        while (counter < number) {
            System.out.print(a1 + "-");
            int a3 = a2 + a1;
            a1 = a2;
            a2=a3;
            counter = counter + 1;
        }
    }

    static int recFib(int a) {
        if (a <= 1)
            return a;
        return recFib(a - 1) + recFib(a - 2);
    }

}