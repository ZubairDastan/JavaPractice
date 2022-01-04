package C2;

import java.util.Scanner;

// A program to find prime numbers to a given range
public class PrimeToNth {
    public static void main(String[] args) {
        int num, count;
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the range you want to see prime number: ");
        num = input.nextInt();

        System.out.println("Prime number between 2 to "+num+" is:");
        for (int i=2; i<=num; i++){
            count = 1;

            for (int j =2; j<=i/2; j++) {
                if (i%j==0) {
                    count = 0;
                }
            }
            if (count==1){
                System.out.println(i);
            }
        }
    }
}
