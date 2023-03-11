package Java.Automation.Assignment2;
import java.util.Scanner;
public class stringCharacterRepeat {
    public static void main(String[] args) {
       // String s1 = "elephant";
       // char ch = 'e';

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string");
        String s1 = sc.nextLine();

        System.out.println("Enter character");
        char ch = sc.next().charAt(0);

        int count = 0;
        for (int i = 0; i < s1.length(); i ++) //checking condition
        {
            if (s1.charAt(i) == ch)
                count ++;
        }

        System.out.println("The character " +ch+ " appears " +count+ " times in " +s1) ;
        }
}