package C2;

import java.util.Scanner;

public class Tasbih {
    public static void main(String[] args) {
        int count=0;
        Scanner input = new Scanner(System.in);

        System.out.println(" Please press 'Enter' to continue the count. Press 0 to quit.");
        String d = "";

        while (d.isEmpty()){
            d = input.nextLine();
            if (!d.equals("")) {
                System.out.println("Total count "+count);
            }
            else {
                count++;
                System.out.println("Total count "+count);
            }
        }
    }
}
