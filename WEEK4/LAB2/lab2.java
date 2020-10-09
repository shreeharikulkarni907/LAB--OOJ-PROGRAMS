import java.io.*;
import java.lang.*;
import java.util.*;
public class lab2
{
    private static int n;
    private static String usn;
    private static String name;
    private static  int credit[];
    private static double mark[];
    public static void read()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Number Of Subjects");
        n=sc.nextInt();
        credit=new int[n];
        mark=new double[n];
        System.out.println("Enter the name of the Student");
        name=sc.next();
        
        System.out.println("Enter the USN of The Student");
        usn=sc.next();

        System.out.println("Enter the Credits Of The Subject");
        for(int i=0;i<n;i++)
        {
            credit[i]=sc.nextInt();
        }
        System.out.println("Enter the Marks Of The Student In Corresponding Subjects");
        for(int i=0;i<n;i++)
        {
            mark[i]=sc.nextDouble();
        }
    }

    public static int grade(double marks)
    {
        if(marks>=90&&marks<=100)
        {
            return 10;
        }
        else if(marks>=80&&marks<90)
        {
            return 9;
        }
        else if(marks>=70&&marks<80)
        {
            return 8;
        }
        else if(marks>=60&&marks<70)
        {
            return 7;
        }
        else if(marks>=50&&marks<60)
        {
            return 6;
        }
        else if(marks>=40&&marks<50)
        {
            return 5;

        }
        else
        {
            System.out.println("You Have Failed In This Subject");
            return 0;
        }
    }

    public static double caclculate()
    {
        read();
        double sgpa;
        double sum_credits=0;
        double sum=0;
        int c;
        for(int i=0;i<n;i++)
        {
            c=grade(mark[i]);
            sum_credits+=credit[i];
            sum=sum+c*credit[i];
        }
        sgpa=(double)(sum/sum_credits);
        return sgpa;  
    }
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);

        double sgpa=caclculate();
        System.out.println("Name Of The Student is " + name);
        System.out.println("SGPA OF THE STUDENT IS " + sgpa);
    }
}