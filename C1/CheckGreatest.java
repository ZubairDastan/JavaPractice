package C1;

import java.util.Scanner;

public class CheckGreatest {
    public static void main(String[] args) {
        int a, b, c;
        Scanner input = new Scanner(System.in);

        System.out.println("Please, enter 1st number: ");
        a = input.nextInt();

        System.out.println("Please, enter 2nd number: ");
        b = input.nextInt();

        System.out.println("Please, enter 3rd number: ");
        c = input.nextInt();

        if(a>b && a>c) {
            System.out.println(a+" is the greatest number.");
        }
        else if(b>a && b>c) {
            System.out.println(b+" is the greatest number.");
        }
        else {
            System.out.println(c+" is the greatest number.");
        }
    }
}
