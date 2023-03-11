package Java.Automation.Assignment1;

import java.util.Scanner;
public class FactorialNum {
    public static void main(String[] args) {
       Scanner sc = new Scanner (System.in);
       System.out.println(" Enter a number to find factorial : ");
        int num = sc.nextInt();
        long fact = 1;
        int i;

        for (i = num; i>=1; i--)
        {
            fact = fact * i;
        }

        System.out.println(" Factorial of the number is : " +fact);
    }
}
