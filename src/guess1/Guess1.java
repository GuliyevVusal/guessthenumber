package guess1;

import java.util.Scanner;

public class Guess1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome The Guess Number Game");
        int range = 10;
        int number = (int) (Math.random() * range);

        while (true) {
            System.out.println("Guess The Number From 0 to " + range);
            int input_number = sc.nextInt();
            if (input_number == number) {
                System.out.println("You Guessed");
                break;
            } else if (input_number > number) {
                System.out.println("The Hidden Number is Less");
            } else {
                System.out.println("The Hidden Number is Greater");
            }

        }
    }
}


