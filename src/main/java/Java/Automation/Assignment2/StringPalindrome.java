package Java.Automation.Assignment2;
import java.util.Scanner;
public class StringPalindrome {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println (" Enter a string to reverse : "); //mom
        String s1 = sc.nextLine();
        String r1 = "";
        int l = s1.length();
        System.out.print(l); //3

        for (int i = l-1; i >=0 ; i--) // reverse order of string --> i = 2 next i =1 next i=0
        {
            char s2 = s1.charAt(i); //s2 = char(2) = m next s2 = o next  s2 = m
            r1 = r1 + s2;           //r1 = " " + m = m ; r1 = m+o = mo; mom
            System.out.println();
        }

        System.out.println("Reversed string is : " +r1);

        //check for palindrome
        if (s1.equalsIgnoreCase(r1))
        {
            System.out.println("The given string is a palindrome.");
        }
        else
            System.out.println("The string is not a palindrome.");

    }
}
