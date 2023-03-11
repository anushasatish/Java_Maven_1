package Java.Automation.Assignment1;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
        System.out.println( " Enter a number : ");
        int n = sc.nextInt();
        int r = 0;
        int s = n;
        int mod;

        // Reversing number n ; Reversed number stored in r
        while (n!=0)
        {
            mod = n % 10;
            r = r * 10 + mod;
            n = n / 10;
        }

        // checking if given number is the same as reversed number or checking for palindrome number
        if (s==r)
        {
            System.out.println(" The number is a org.example.Assignment1.Palindrome !");
        }
        else
        {
            System.out.println(" The number is not a org.example.Assignment1.Palindrome");

        }
    }

}
