package C1;

import java.util.Scanner;

public class CheckLetterCase {
    public static void main(String[] args) {
        char letter;
        Scanner input = new Scanner(System.in);

        System.out.println("Please, enter a letter:");
        letter = input.next().charAt(0);

        if (Character.isUpperCase(letter)) {
            System.out.println(letter+" is upper case.");
        }
        else {
            System.out.println(letter+" is lower case.");
        }

    }
}
