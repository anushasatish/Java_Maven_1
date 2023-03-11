package Java.Automation.Assignment3;

/*2. Write a program to demonstrate constructor.
Create a class ‘Calculation’ with 3 integer variables.
Create a constructor for assign the values into variables.
Then create another method ‘sum’ to calculate sum of 3 numbers.
Now, create object and call constructor by passing 3 integer values then call sum method.*/

public class Calculation
{
    int a;
    int b;
    int c;

    public static void main(String[] args)
    {
        Calculation a1 = new Calculation(5,10,15); //create obj and assign values through constructor
        int i = sum (5,10,15); // calling sum method to add values

        System.out.println("Sum of 3 numbers is : " +i);
    }


    // Constructor to assign values
    Calculation (int num1, int num2, int num3)
    {
    a = num1;
    b = num2;
    c = num3;
        System.out.println(num1);
        System.out.println(num2);
        System.out.println(num3);
    }

    //method to add 3 values
    static int sum (int a, int b, int c)
    {
        int s = a+b+c;
        return s;
    }

}
