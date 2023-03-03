import java.util.Scanner;

public class DaysInMonth {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);

        int numberofdays = 0;
        String monthname = "none";
        int year=0;

        System.out.println("Enter a month number : ");
        int month= sc.nextInt();

        switch (month) {
            case 1:
                monthname = "January";
                numberofdays = 31;
                break;

            case 2:
                monthname = "February";

                // Since Feb has chances of leap year, we need to find if the year is a leap year,
                // to calculate the days

                System.out.println ("Enter the year : ");
                year = sc.nextInt();

                if (((year % 4 == 0) && (year % 100 != 0) || (year % 400 == 0)))
                {
                    numberofdays = 29;
                }
                else
                {
                    numberofdays = 28;
                }
                System.out.println (" Number of days in " +monthname+ " " +year+ " is :"  +numberofdays );
                break;

            case 3:
                monthname = "March";
                numberofdays = 31;
                break;

            case 4:
                monthname = "April";
                numberofdays = 30;
                break;

            case 5:
                monthname = "May";
                numberofdays = 31;
                break;

            case 6:
                monthname = "June";
                numberofdays = 30;
                break;

            case 7:
                monthname = "July";
                numberofdays = 31;
                break;

            case 8:
                monthname = "August";
                numberofdays = 31;
                break;

            case 9:
                monthname = "September";
                numberofdays = 30;
                break;

            case 10:
                monthname = "October";
                numberofdays = 31;
                break;

            case 11:
                monthname = "November";
                numberofdays = 30;
                break;

            case 12:
                monthname = "December";
                numberofdays = 31;
                break;

            default:
                System.out.println("Enter valid number for the month !");
                break;

        }
        System.out.println(" Number of days in " +monthname+ " is : "  +numberofdays );
    }
}