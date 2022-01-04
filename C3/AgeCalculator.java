package C3;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

// A program to calculate difference between today and birthday
public class AgeCalculator {
    public static void main(String[] args) throws ParseException {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter you birthday in dd/mm/yyyy format:");
        String b_date = input.nextLine();

        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
        Date bDateFormat = dateFormat.parse(b_date);
        Date tDateFormat = new Date();
        System.out.println(tDateFormat);

        long date = tDateFormat.getTime()-bDateFormat.getTime();
        long year = date/(1000L *60*60*24*365);
        long month = date/(1000*60*60*24)%12;
        long day = date/((1000*60*60*24)%365);

        System.out.println("Your current age is "+year+" years, "+month+" months and "+day+" day");
    }


}
