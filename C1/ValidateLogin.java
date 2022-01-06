package C1;

import java.util.Scanner;

// A program to check valid login credentials
public class ValidateLogin {
    public static void main(String[] args) {
        String c_userName = "Zubair";
        String c_pass = "123456789";
        String i_userName, i_pass;
        Scanner input = new Scanner(System.in);

        System.out.println("Enter you username: ");
        i_userName = input.nextLine();

        System.out.println("Enter your password: ");
        i_pass = input.nextLine();

        if (c_userName.equals(i_userName) && c_pass.equals(i_pass)) {
            System.out.println("Successfully logged in");
        } else if (!c_userName.equals(i_userName) && c_pass.equals(i_pass)) {
            System.out.println("Please enter correct username");
        } else if (c_userName.equals(i_userName) && !c_pass.equals(i_pass)) {
            System.out.println("Please enter correct password");
        } else {
            System.out.println("Login credentials are invalid. Try again");
        }
    }
}