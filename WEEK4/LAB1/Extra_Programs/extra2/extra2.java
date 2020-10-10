import java.io.*;
import java.util.*;
public class extra2
{
    private static int[] n;
    private static  int c_pos=0;
    private static  int c_neg=0;
    private static int c_zer=0;
    public static void main(String[] args)
    {
        int size;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter The Number Elements Of Array");
        size=sc.nextInt();
        n=new int[size];
        System.out.println("Enter The Elements Of Array");
        for(int i=0;i<size;i++)
        {
            n[i]=sc.nextInt();
        }
        for(int i=0;i<size;i++)
        {
            if(n[i]>0)
            c_pos++;
            else if(n[i]<0)
            c_neg++;
            else
            c_zer++;
        }
        System.out.println("Number Of Positive Number in the array " + c_pos);
        System.out.println("Number Of Negative Number in the neagtive array " + c_neg);
        System.out.println("Number of Zeroes In The Array " + c_zer);
    }
}