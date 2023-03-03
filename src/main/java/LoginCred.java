import java.util.Scanner;
public class LoginCred {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Username : ");
        String usrname = sc.nextLine();
        System.out.println("Enter Password : ");
        String pwd = sc.nextLine();
        int count = 1;

        //Checking for credentials
        while (!(usrname.equals("Anusha") && pwd.equals("pass123")))
        {
            System.out.println(" Incorrect credentials ");
            System.out.println(" Enter Username : ");
            usrname = sc.nextLine();
            System.out.println(" Enter Password : ");
            pwd = sc.nextLine();
            count++;
        }

        System.out.println("Yor are logged in !");
        System.out.println(" Number of iterations to get the right credentials is : " +count);
    }
}


