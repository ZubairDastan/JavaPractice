package C3;

import java.util.HashMap;
import java.util.Random;
import java.util.Scanner;

// A program to generate random number from 1 to 10 but print by its alphabetical version
public class Numeric2Alphabet {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        HashMap<Integer,String> alphabeticNumber = new HashMap<>();

        alphabeticNumber.put(1,"One");
        alphabeticNumber.put(2,"Two");
        alphabeticNumber.put(3,"Three");
        alphabeticNumber.put(4,"Four");
        alphabeticNumber.put(5,"Five");
        alphabeticNumber.put(6,"Six");
        alphabeticNumber.put(7,"Seven");
        alphabeticNumber.put(8,"Eight");
        alphabeticNumber.put(9,"Nine");
        alphabeticNumber.put(10,"Ten");

        System.out.println("Press 'Enter' to continue generate random numbers. Press ant key to quit.");
        String i = "";
        Generator generator = new Generator();
        generator.randomGenerator(alphabeticNumber);
    }
}

class Generator{
    public void randomGenerator(HashMap<Integer, String> alphabeticNumber){
        while (true){
            Scanner scanner = new Scanner(System.in);
            String i = scanner.nextLine();
            if (!i.equals("")) {
                break;
            }
            else {
                Random random = new Random();
                int a = random.nextInt(10 - 1) + 1;
                System.out.println(alphabeticNumber.get(a));
            }
        }
    }
}