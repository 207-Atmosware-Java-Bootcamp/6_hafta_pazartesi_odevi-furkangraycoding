

import java.util.Scanner;

public class palindorme {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter word: ");
        String word = scanner.next();
        String revWord = "";
        for (int i = word.length() - 1; i >= 0; i--) {
            revWord += word.charAt(i);
        }
        boolean palindrome = revWord.equals(word);
        if (palindrome){
            System.out.println("It is palindorme ");
        }
        else {
            System.out.println("It is not palindorme" );
        }

    }

}