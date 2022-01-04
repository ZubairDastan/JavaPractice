package C3;

import java.util.Scanner;

// A program to check duplicate elements in an array
public class ElementChecker {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n,i;

        System.out.println("Enter the length of the array");
        n=input.nextInt();
        String[] arr = new String[n];
        input.nextLine();

        for (i=0; i<n; i++) {
            arr[i] = input.nextLine();
        }

        System.out.println("Your given array elements are:");
        for (i=0; i<n; i++) {
            System.out.print(arr[i]+" ");;
        }

        FindDuplicate duplicate = new FindDuplicate();
        System.out.println("\nThe duplicate element is:");
        duplicate.isDuplicate(arr);
    }
}

class FindDuplicate {
    public void isDuplicate(String[] arr) {
        int j;
        for (int i = 0; i < arr.length; i++) {
            for (j = i + 1; j < arr.length; j++) {
                if (arr[i].equals(arr[j]))
                    System.out.println(arr[j]);
            }
        }
    }
}