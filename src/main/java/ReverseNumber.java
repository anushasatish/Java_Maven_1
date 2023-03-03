import java.util.Scanner;
public class ReverseNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(" Enter a number : ");
        int n = sc.nextInt(); // n is input number from user eg. 9876

        int r = 0 ;// initialising value r to 0  - r will hold the reverse number
        int mod; // mod initialization
        while (n != 0) //run these statements until n not equal to 0
        {
            mod = n % 10;        // mod = 9876 % 10 = 6 ; next 987 % 10 = 7 and so on

            r = r * 10 + mod;     //  r = 0 * 10 + 6 = 0 + 6 so r = 6 ; next r = 6 * 10 + 7 = 60+7 = 67
                                    // and so on till r is 6789

            n=n/10;                     // n = 9876/10 so n = 987  ; next n = 987/10 = 98 and so on till n= 0
        }

        System.out.println(" Reverse number is " +r);

    }
}
