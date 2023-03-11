package Java.Automation.Assignment1;

import java.util.Scanner;

public class CountDigitsNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(" Enter a number");
        long n = sc.nextLong();

        //first initialise count to 0
        int c = 0;

        // divide number by 10 and extract the last digit till the 1st digit is divided,
        // then increase count each time when extracting a digit
        while (n > 0)
        {
            n = n / 10;
            c = c + 1;
        }
        System.out.println(" Number of digits in the number is " +c);
        }

    }
