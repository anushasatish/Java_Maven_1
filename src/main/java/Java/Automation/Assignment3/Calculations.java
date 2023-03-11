package Java.Automation.Assignment3;


/*1) Create a class Calculation with the following methods.
Class Name: Calculation
int sum(int x, int y) : Should accept two integer parameters and returns sum of two numbers.
int sum(int x, int y, int z) : Should accept three integer parameters and returns sum of three
numbers.
double sum(double x, double y) : Should accept two double type parameters and returns sum
of two numbers.
double sum(double x, double y, double z) : Should accept three double type parameters and
returns sum of three numbers.
Now, create object for Calculations class ‘cal’ then call different methods by passing different
inputs.*/

public class Calculations {

    public static void main(String[] args) {
    double x, y, z;
      /*  int total1 = sum(2,3);
        System.out.println(total1);

        int total2 = sum(2,3,4);
        System.out.println(total2);

        double total3 = sum(2.5,1.5);
        System.out.println(total3);

        double total4 = sum(2.5,3.5,4.5);
        System.out.println(total4);*/

        Calculations cal = new Calculations();
        int total1 = cal.sum(2,5);
        System.out.println(total1);

        Calculations cal1 = new Calculations();
        int total2 = cal1.sum(2,5,3);
        System.out.println(total2);

        Calculations cal2 = new Calculations();
        double total3 = cal2.sum(2.5,5.5);
        System.out.println(total3);

        Calculations cal3 = new Calculations();
        double total4 = cal3.sum(2.5,5.5,10.5);
        System.out.println(total4);

    }
    static int sum (int x, int y)
    {
        int a = x+y;
        return a;
    }
    static int sum (int x, int y, int z)
    {
      int a = x+y+z;
        return a;
    }

    static double sum (double x, double y)
    {
        double a = x+y;
        return a;
    }
    static double sum (double x, double y, double z)
    {
        double a = x+y+z;
        return a;
    }


}