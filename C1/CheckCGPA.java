package C1;

import java.util.Scanner;

// A program to calculate CGPA
public class CheckCGPA {
    public static void main(String[] args) {
        float cse101,eee102,mth101,ged102, cgpa;
        String grade;
        Scanner input =new Scanner(System.in);

        System.out.println("Enter your GPA in scale of 4.00");

        System.out.println("Enter GPA of course CSE101:");
        cse101 = input.nextFloat();

        System.out.println("Enter GPA of course EEE102:");
        eee102 = input.nextFloat();

        System.out.println("Enter GPA of course MTH101:");
        mth101 = input.nextFloat();

        System.out.println("Enter GPA of course GED102:");
        ged102 = input.nextFloat();



        cgpa = (cse101+eee102+mth101+ged102)/4;
        System.out.println("Your CGPA is: "+cgpa);

        if (cgpa == 4){
            System.out.println("Your Grade is A+");
        }
        else if (cgpa <4 && cgpa >= 3.75) {
            System.out.println("Your Grade is A");
        }
        else if (cgpa < 3.75 && cgpa >= 3.5) {
            System.out.println("Your Grade is A-");
        }
        else if (cgpa < 3.5 && cgpa >= 3.25) {
            System.out.println("Your Grade is B+");
        }
        else  if (cgpa <3.25 && cgpa >= 3) {
            System.out.println("Your Grade is B");
        }
        else if (cgpa <3 && cgpa >= 2.75) {
            System.out.println("Your Grade is B-");
        }
        else if (cgpa <2.75 && cgpa >=2.5) {
            System.out.println("Your Grade is C+");
        }
        else if (cgpa < 2.5 && cgpa >=2.25) {
            System.out.println("Your Grade is C");
        }
        else if (cgpa < 2.25 && cgpa >= 2) {
            System.out.println("Your Grade is D");
        }
        else {
            System.out.println("Your Grade is F. Try harder next time.");
        }
    }
}
