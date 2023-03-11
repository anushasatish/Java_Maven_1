package Java.Automation.Assignment2;
import java.util.Scanner;
public class AverageScoreStudent {
    public static void main(String[] args)
    {
        int r = 2;                  //2 rows/students
        int c = 3;                  //3 columns / papers
        float sum[] = new float[2]; //total score or sum
        sum [0] = 0; //initialising to 0
        sum [1] = 0;
        float avg[] = new float[2];
        int[][] a = new int[r][c];

        Scanner sc = new Scanner(System.in);

        //Input scores of students
        System.out.println("Enter the values of 2 students : ");
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                a[i][j] = sc.nextInt();
            }
        }

        //Print scores table
        for (int i = 0; i < r; i++)
        {
            for (int j = 0; j < c; j++)
            {
                System.out.print(a[i][j] + " ");
            }
            System.out.println(" ");
        }

        //sum of scores
        for (int i = 0; i < r; i++)     //till i<2
        {
            for (int j = 0; j < c; j++)   // till j<3
            {
                sum[i] = sum[i] + a[i][j];
            }

        }

        //Average of scores
        avg[0] = sum[0]/3;
        avg[1] = sum[1]/3;
        System.out.println("Total score of student 1 : " +sum[0]);
        System.out.println("Total score of student 1 : " +sum[1]);

        System.out.println("Average of student 1 : " +avg[0]);
        System.out.println("Average of student 2 :" +avg[1]);
    }
}
