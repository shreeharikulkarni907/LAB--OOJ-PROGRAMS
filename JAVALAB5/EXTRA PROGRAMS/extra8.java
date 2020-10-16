import java.util.*;
import java.io.*;
import java.lang.*;
public class extra8
{
    public int years;
    public int months;
    public String name;
}
class age
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        extra8[] ob=new extra8[2];
        ob[0]=new extra8();
        ob[1]=new extra8();
        for(int i=0;i<2;i++)
        {
          System.out.println("Enter the name of the perosn " + (i+1));
          ob[i].name=sc.next();
          System.out.println("Enter the number of years a person is old  " + (i+1));
          ob[i].years=sc.nextInt();
          ob[i].years=ob[i].years*12;
          System.out.println("Enter the Number of months " + (i+1));
          ob[i].months=sc.nextInt();
        }
        double sum1=ob[0].years+ob[0].months;
        System.out.println("Total Age of the Person " + " 1 " + " in Months is " + sum1);
        System.out.println();
        double sum2=ob[1].years+ob[1].months;
        System.out.println("Total Age of the person 2 " + " in months is " + sum2);
        System.out.println();
        System.out.println("Displaying the details of the person with greater age ");
        System.out.println();
         if(sum1>sum2)
        {
            display(ob[0]);
        }
        else
        {
          display(ob[1]);
        }
    }

    public static void display(extra8 ob)
    {
        System.out.println("Name of the person is " + ob.name);
        System.out.println("Age in years is " + ob.years/12);
        System.out.println("Number of months of person is " + ob.months);
    }
}