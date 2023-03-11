package Java.Automation.Assignment2;
import java.util.Scanner;
public class StringUppercase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string : ");
        String s1 = sc.nextLine();
        String s2 = s1.toUpperCase();

        System.out.println(s2);
    }
}
