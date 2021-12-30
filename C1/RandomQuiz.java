package C1;

import java.util.Random;
import java.util.Scanner;

public class RandomQuiz {
    public static void main(String[] args) {
        int b,c,d,e;
        Scanner input = new Scanner(System.in);

        Random a = new Random();
        b = a.nextInt(9);
        c = a.nextInt(9);

        d = b + c;

        System.out.println("Take the quiz \n\n");
        System.out.println("Enter the correct summation of given number "+b+", "+c);
        e = input.nextInt();
        if (e == d) {
            System.out.println("You are correct!");
        }
        else {
            System.out.println("Sorry! Wrong answer.");
        }
    }
}