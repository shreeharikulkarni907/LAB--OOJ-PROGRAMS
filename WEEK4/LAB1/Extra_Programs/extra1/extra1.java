import java.lang.*;
import java.util.*;
import java.io.*;
public class extra1
{
    private static int[] a;
    private static int n;
    public static void read()
    {  
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Number Of Elements of array");
        n=sc.nextInt();
        a=new int[n];
        System.out.println("Enter the elements of Array");
        for(int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
    }
    public static void calc()
    {
        read();
        double sum_even=0;
        double sum_odd=0;
        for(int i=0;i<n;i+=2)
        {
            sum_even+=a[i];
        }
        for(int i=1;i<n;i+=2)
        {
            sum_odd+=a[i];
        }
        System.out.println("Sum Of Numbers At Even Position is " + sum_even);
        System.out.println("Sum Of Numbers At Odd Position is " + sum_odd);
    }
    public static void main(String[] args)
    {
        calc();
    }
}