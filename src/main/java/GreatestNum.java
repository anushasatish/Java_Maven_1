import java.util.Scanner;
public class GreatestNum {
    public static void main(String[] args) {
        int a,b,c;
       //Input 3 numbers from user
        System.out.println(" Enter 3 numbers ");
        Scanner sc = new Scanner(System.in);
        a=sc.nextInt();
        b=sc.nextInt();
        c=sc.nextInt();

        //condition checking
        if (a>b && a>c){
            System.out.println("The greatest of these numbers is " +a);
        }
        else if (b>c && b>a) {
            System.out.println( "The greatest of these numbers is " +b);
        }
        else
            System.out.println( "The greatest of these numbers is " +c);
    }
}
