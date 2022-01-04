package C2;

import java.util.Scanner;

// A program to calculate the sum of digits
// of a given number
public class SumOfDigits {
    public static void main(String[] args) {
        int num,sum;
        Scanner input = new Scanner(System.in);

        System.out.println("Enter any number: ");
        num = input.nextInt();
        for (sum=0; num!=0; num=num/10) {
            sum = sum + num%10;
        }

        System.out.println("The sum of digits of the given number is "+sum);
    }
}

// See the bellow code too

//public class SumOfDigits {
//    public static void main(String[] args) {
//        String num;
//        int i,sum=0;
//        Scanner input = new Scanner(System.in);
//
//        System.out.println("Enter any number: ");
//        num = input.nextLine();
//
//        for (i=0; i<num.length(); i++) {
//            sum = sum + Character.getNumericValue(num.charAt(i));
//        }
//        System.out.println("The sum of digits of the given number is "+sum);
//    }
//}
