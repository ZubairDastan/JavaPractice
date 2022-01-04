package C2;

import java.util.Random;
import java.util.Scanner;

// A program of a simple math related quiz
public class MathQuiz {
    public static void main(String[] args) {
        int b,c,d,e,score=0;
        Scanner input = new Scanner(System.in);

        Random a = new Random();

        System.out.println("Take the quiz \n\n");
        for (int i=0; i<5; i++) {
            b = a.nextInt(9);
            c = a.nextInt(9);
            d = b + c;
            System.out.println("Enter the correct summation of given number "+b+", "+c);
            e = input.nextInt();
            if (e == d) {
                System.out.println("Answer is correct");
                score++;
            } else {
                System.out.println("Sorry! Wrong answer.");
            }
        }
        System.out.println("Quiz finished. You score is: "+score);
    }
}
