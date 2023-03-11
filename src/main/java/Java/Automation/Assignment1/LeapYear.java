package Java.Automation.Assignment1;

import java.util.Scanner;
public class LeapYear {
    public static void main(String[] args) {
    int year;
        System.out.println(" Enter the year ");
        Scanner sc= new Scanner(System.in);
        year = sc.nextInt();

        //Checking condition for Leap Year
        //non-century leap year where the end-of-century year divisible by 100 but not divisible by 400,
        // leap year is skipped.. eg,1700, 1800, 1900, 2100
        if ((( year % 4==0 ) && (year % 100 != 0) || ( year % 400 == 0)))
        {
            System.out.println( " It is a Leap Year !");
        }
        else
        {
            System.out.println("It is not a Leap Year.");
        }
    }
}
