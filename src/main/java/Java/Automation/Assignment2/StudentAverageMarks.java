package Java.Automation.Assignment2;

public class StudentAverageMarks
{
    public static void main(String[] args)
    {
        float mark[][] = {{90,90,80}, {100,70,80}};
        float sum[] = new float[2];
        sum [0] = 0;
        sum [1] = 0;
        float avg[] = new float[2];

        for (int i =0; i <2; i++)
        {
            for (int j = 0; j < 3; j++)
            {
                sum[i] = sum[i] + mark[i][j];
            }
        }
        avg[0] = sum[0]/3;
        avg[1] = sum[1]/3;
        System.out.println("Average of student 1 : " +avg[0]);
        System.out.println("Average of student 2 :" +avg[1]);
    }
}
