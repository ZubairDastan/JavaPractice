package C1;

import java.util.Scanner;

public class ATM {
    public static void main(String[] args) {
        int a,b,currentBalance,withdraw;
        Scanner input = new Scanner(System.in);

        currentBalance = 2000;

        System.out.println("Enter 1 to run the program in if condition. Enter 2 to run the program in switch-case condition");
        a = input.nextInt();
        System.out.println();

        switch (a){
            case 1:
                System.out.println("Press 1 to check your balance.\nPress 2 to withdraw money.");
                b = input.nextInt();
                if (b==1){
                    System.out.println("Your current balance is "+currentBalance);
                }
                else if (b==2){
                    System.out.println("Enter the amount you want to withdraw: ");
                    withdraw = input.nextInt();
                    if (currentBalance < withdraw) {
                        System.out.println("Insufficient balance.");
                    }
                    else {
                        currentBalance = currentBalance - withdraw;
                        System.out.println(withdraw+" is credited from your account. You current balance is "+currentBalance);
                    }
                }
                break;

            case 2:
                System.out.println("Press 1 to check your balance.\nPress 2 to withdraw money.");
                b = input.nextInt();
                switch (b){
                    case 1:
                        System.out.println("Your current balance is "+currentBalance);
                        break;
                    case 2:
                        System.out.println("Enter the amount you want to withdraw: ");
                        withdraw = input.nextInt();
                        if (currentBalance < withdraw) {
                            System.out.println("Insufficient balance.");
                        }
                        else {
                            currentBalance = currentBalance - withdraw;
                            System.out.println(withdraw+" is credited from your account. You current balance is "+currentBalance);
                        }
                        break;

                    default:
                        System.out.println("Please select either 1 or 2.");
                }
                break;
        }
    }
}