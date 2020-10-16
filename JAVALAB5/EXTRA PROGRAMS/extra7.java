import java.io.*;
import java.lang.*;
import java.util.*;
public class extra7
{
    public static String empid;
    public static String empname;
    public static double emphrs;
    public static double empbas;
    public static double emphra;
    public static double empda;
    public static double empit;
    public static double empgross;
    public static void read()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the id of the employee");
        empid=sc.next();
        System.out.println("Enter the name of the employee");
        empname=sc.next();
        System.out.println("Enter the number of hours an employee works in minutes");
        emphrs=sc.nextDouble();
        System.out.println("Enter the basic salary of the employee");
        empbas=sc.nextDouble();
        System.out.println("Enter the hra of the employee in percent");
        emphra=sc.nextDouble();
        System.out.println("Enter the da of the employee in percent");
        empda=sc.nextDouble();
        System.out.println("Enter the it of the employee");
        empit=sc.nextDouble();
    }
    public static double calc()
    {
        read();
        double time=0;
        double i_d=0;
        empgross=empbas+(empbas*emphra)/(100);
        if(emphrs>200)
        {
            time=emphrs-200;
            time=time/60;
            System.out.println("Employee is elgible for Additional Payment");
            i_d=time*100;
            System.out.println("ADDITIONAL SALARY IS: " + i_d);
            empgross=empgross+i_d;   
        }
        else
        {
            time=200-emphrs;
            time=time/60;
            System.out.println("Your Salary Will Be Cut If You Don't Perform Atleast 200 Minutes of work");
            i_d=time*100;
            System.out.println("DECREASED SALARY IS: " + i_d);
            empgross=empgross-i_d;
        }
        return empgross; 
    }
    public static void main(String[] args)
    {
        double salary=calc();
        System.out.println("Name of the employee is " + empname);
        System.out.println("Id of the employee is  " + empid);
        System.out.println("Basic Salary of the employee is  " + empbas);
        System.out.println("Final Salary of the employee is " + salary);
    }

}