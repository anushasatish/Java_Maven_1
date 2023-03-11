package Java.Automation.Assignment2;

public class MatrixAddition {
    public static void main(String[] args) {
        int x[][] = {{0,2,3},{4,5,6},{7,8,9}};
        int y[][] = {{3,7,2},{1,3,0},{2,0,0}};

        int z[][] = new int [3][3];

        System.out.println("Sum of 2 matrices is : ");
        for (int i =0; i < 3; i++)
        {
            for ( int j=0; j< 3; j++)
            {
                z[i][j] = x[i][j] + y[i][j];
                System.out.print (z[i][j]+ " ");
            }
            System.out.println(" ");
        }
    }
}
