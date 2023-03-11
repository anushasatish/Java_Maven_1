package Java.Automation.Assignment2;
import java.util.Scanner;

public class StringConcat {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter String 1 : ");
        String string1 = sc.nextLine();
        System.out.println("Enter String 2 : ");
        String string2 = sc.nextLine();

        String string3 = string1.concat(string2);
        System.out.println(string3);
    }
}
