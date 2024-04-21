package guess2;

import java.util.Scanner;

public class Guess2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int number, guess, tries = 0;

        number = (int) (Math.random() * 10) + 1;

        System.out.println("Welcome The Guess Number Game");

        do {
            System.out.println("Enter a guess between 1 and 10 : ");
            guess = sc.nextInt();
            tries++;

            if (guess > number) {
                System.out.println("Guessed number high..!  Try Again");
            } else if (guess < number) {
                System.out.println("Guessed number low..!  Try Again");
            } else {
                System.out.println("Correct! You got it in " + tries + " guesses!");
            }

        } while (guess != number);
    }
}
