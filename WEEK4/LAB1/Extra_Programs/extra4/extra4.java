import java.util.*;
import java.io.*;
public class extra4
{
    private static int[] a;
    private static int[] b;
    private static int[] c;
    private static int n;
    public static void read()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of elements in an array");
        n=sc.nextInt();
        a=new int[n];
        System.out.println("Enter the elements of array");
        for(int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
    }
    public static int count_even()
    {
        int count=0;
        for(int i=0;i<n;i++)
        {
            if(a[i]%2==0)
            {
                count++;
            }
        }
        return count;
    }
    public static int count_odd()
    {
        int count=0;
        for(int i=0;i<n;i++)
        {
            if(a[i]%2!=0)
            {
                count++;
            }
        }
        return count;
    }


    public static int[] diff()
    {
        int k1=0;
        int k2=0;
        read();
        int c1=count_even();
        int c2=count_odd();
        b=new int[c2];
        c=new int[c1];
        System.out.println(c1);
        System.out.println(c2);
        for(int i=0;i<n;i++)
        {
            if((a[i]%2)==0)
            {
                c[k1]=a[i];
                k1++;
            }
            if(a[i]%2!=0)
            {
                b[k2]=a[i];
                k2++;
            }
        }
        System.out.println("Contents Of Array With All Odd numbers is ");
        for(int i=0;i<b.length;i++)
        {
            if(b[i]!=0)
            System.out.println(b[i]);
            else
            break;
        }
        System.out.println("Contents Of Array With All Even Numbers is ");
        for(int i=0;i<c.length;i++)
        {
            if(c[i]!=0)
            System.out.println(c[i]);
            else
            break;
        }
        return c;
    }
    public static void calc()
    {
        int[] array=diff();
        double sum=0;
        double average;
        int max=array[0];
        int min=array[0];
        for(int i=0;i<array.length;i++)
        {
            if(array[i]>max)
            {
                max=array[i];
            }
            if(array[i]<min)
            {
                min=array[i];
            }
            sum+=array[i];
        }
        average=(((sum))/(array.length));
        System.out.println("***************Displaying the contents Of Array With Even Numbers*****************");

        System.out.println("Sum Of All Numbers Of An Array is " + sum);
        System.out.println("Average Of " + " " + array.length + " Numbers is " + average);
        System.out.println("Maximum Element in the array is " + max);
        System.out.println("Minimum Element in the array is " + min);
    }
    public static void main(String[] args)
    {
        calc();
    }

}