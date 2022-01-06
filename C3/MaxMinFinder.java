package C3;

import java.util.Scanner;

// A program to find the max and min number from an array
public class MaxMinFinder {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n, i;

        System.out.println("Enter the length of the array:");
        n = input.nextInt();
        int[] arr = new int[n];
        //input.nextInt();

        System.out.println("Enter " + n + " elements of the array:");
        for (i = 0; i < n; i++) {
            arr[i] = input.nextInt();
        }

        System.out.println("Your given array elements are:");
        for (i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
            ;
        }

        FindMax findMax = new FindMax();
        FindMin findMin = new FindMin();

        System.out.println("\nMax valued element is ");
        findMax.max(arr);

        System.out.println("\nMin valued element is ");
        findMin.min(arr);
    }
}

class FindMin {
    public void min(int[] arr) {
        int minValue = arr[0];
        for (int j : arr) {
            if (j < minValue) {
                minValue = j;
            }
        }
        System.out.println(minValue);
    }
}

class FindMax {
    public void max(int[] arr) {
        int maxValue = arr[0];
        for (int j : arr) {
            if (j > maxValue) {
                maxValue = j;
            }
        }
        System.out.println(maxValue);
    }
}
