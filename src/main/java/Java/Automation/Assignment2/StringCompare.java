package Java.Automation.Assignment2;
import java.util.Scanner;

public class StringCompare {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter String 1 : ");
        String string1 = sc.nextLine();
        System.out.println("Enter String 2 : ");
        String string2 = sc.nextLine();

        if (string1.equalsIgnoreCase(string2))
        {
            System.out.println("The given strings are the same");
        }
        else
            System.out.println("The given strings are not the same");

    }
}
