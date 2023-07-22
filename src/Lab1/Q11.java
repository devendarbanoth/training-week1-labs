package Lab1;

import java.time.LocalDate;
import java.time.Period;
import java.util.Date;
import java.util.Scanner;

public class Q11 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("\nEnter date in format yyyy-mm-dd:");
        String date1String = scanner.nextLine();

        LocalDate date1 = LocalDate.parse(date1String);
        LocalDate date2 = LocalDate.now();
        scanner.close();

        Period period = Period.between(date1, date2);
        System.out.println("Time difference:");
        System.out.println("Years: " + period.getYears());
        System.out.println("Months: " + period.getMonths());
        System.out.println("Days: " + period.getDays());
    }
}
