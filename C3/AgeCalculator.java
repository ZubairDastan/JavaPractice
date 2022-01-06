package C3;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.Period;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

// A program to calculate difference between today and birthday
public class AgeCalculator {
    public static void main(String[] args) throws ParseException {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter you birthday in dd/mm/yyyy format:");
        String b_date = input.nextLine();

        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
        Date d = dateFormat.parse(b_date);

        Calculator calculator = new Calculator();
        calculator.calculateAge(d);
    }
}


class Calculator {
    public void calculateAge(Date d) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(d);
        int year = calendar.get(Calendar.YEAR);
        int month = calendar.get(Calendar.MONTH) + 1;
        int date = calendar.get(Calendar.DATE);
        LocalDate localDate = LocalDate.of(year, month, date);
        LocalDate currentDate = LocalDate.now();
        Period calculator = Period.between(localDate, currentDate);

        System.out.println("Your current age is " + calculator.getYears() + " years, " + calculator.getMonths() + " months and " + calculator.getDays() + " day");
    }
}