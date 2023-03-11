package Java.Automation.Assignment3;
    /*Create a Student class contains the following variables and methods.
       Class Name: Student
        Variables: SID, Sname, Sub1, Sub2, Sub3
        Methods:
        getStuData() Takes student details SID and Sname as parameters and assign them to variables.
        getStuMarks() Takes student marks as parameters and assign them to Sub1, Sub2, Sub3.
        totalMarks() Calculate total marks and print the student details with total marks.
        Now, create objects from Student class stu1, stu2 etc. Then call Student class methods.*/

public class Student
{
    int SID;
    String sname;
    int sub1;
    int sub2;
    int sub3;

    public static void main(String[] args)
    {
        Student stu1 = new Student();
        stu1.getStudata(101, "Amy");
        stu1.getStumarks(90, 80, 70);
        int result1  = stu1.totalmarks(90,80, 70 );


        Student stu2 = new Student();
        stu2.getStudata(102, "Ben");
        stu2.getStumarks(100, 70, 90);
        int result2 = stu2.totalmarks(100, 70, 90);


        System.out.println(stu1.SID + " " + stu1.sname);
        System.out.println("Total Marks : " + result1);

        System.out.println(stu1.SID + " " + stu2.sname);
        System.out.println("Total Marks : " + result2);
    }

    //Get student id and name
    void getStudata(int id, String name)
    {
        SID = id;
        sname = name;
    }

    //get student marks
   void getStumarks(int s1, int s2, int s3)
    {
        sub1 = s1;
        sub2 = s2;
        sub3 = s3;
    }

//Sum of marks
  static int totalmarks(int a, int b, int c)
    {
        int total = a+b+c;
        return total;
    }

}