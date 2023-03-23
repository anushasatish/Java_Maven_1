package Java.Automation.Assignment5;

//3. Create user defined exception and use throw in it.

import java.util.Scanner;
public class UserException
{
    private static int score;

   public static void checkscore() throws InvalidScoreException
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your score : ");

        score = sc.nextInt();

        if ((score >= 90) && (score <=100))
        {
            System.out.println("Pass");
        }
        else if (score < 90)
        {
                throw new InvalidScoreException ("Low Score !");
        }
    }

    public static void main(String[] args)
    {
        try
        {
            checkscore();
        }
        catch (InvalidScoreException e)
        {
            System.out.println("User defined Exception !! " +e);
        }
    }
}


