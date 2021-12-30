package C1;

import java.util.Scanner;

public class CheckPositivity {
    public static void main(String[] args) {
        int a;
        Scanner input = new Scanner(System.in);

        System.out.println("Please, enter a number: ");
        a = input.nextInt();

        if (a >= 0){
            System.out.println("This is a positive number.");
        }
        else {
            System.out.println("This is a negative number.");
        }
    }
}
