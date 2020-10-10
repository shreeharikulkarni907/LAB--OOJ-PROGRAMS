import java.util.*;
import java.io.*;
import java.lang.*;
public class extra6
{
    public static String bookid;
    public static String booktitle;
    public static int[] no_of_pages;
    public static int[] year_of_pub;
    public static String author;
    public static String publisher;
    public static double[] price;
    public static int n;
    public extra6(String id,String title,String au,String pub,int count)
    {
        bookid=id;
        booktitle=title;   
        author=au;
        publisher=pub;
        n=count;

    }
    public extra6()
    {
        no_of_pages=new int[3];
        price=new double[3];
        year_of_pub=new int[3];
    }
    public static void read()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Number Of books ");
        n=sc.nextInt();
        System.out.println("Enter the price of the book");
        for(int i=0;i<n;i++) 
        {
            System.out.println("Enter the price of book " + (i+1));
            price[i]=sc.nextDouble();
            System.out.println("Enter the no of pages of book " + (i+1));
            no_of_pages[i]=sc.nextInt();
            System.out.println("Enter the year of publication ");
            year_of_pub[i]=sc.nextInt();
        }
    }
    public static double most_exp()
    {
        double max=0;
        for(int i=0;i<n;i++)
        {
            if(price[i]>max)
            {
                max=price[i];
            }

        }
        return max;
    }
    public static int pub_in_2020()
    {
        int count=0;
        for(int i=0;i<n;i++)
        {
            if(year_of_pub[i]==2020)
            count++;
        }
        return count;
    }
    public static int least()
    {
        int min=no_of_pages[0];
        for(int i=0;i<n;i++)
        {
            if(no_of_pages[i]<min)
            {
                min=no_of_pages[i];
            }
        }
        return min;
    }
    public static void display()
    {
        System.out.println("Book Name is " + booktitle);
        System.out.println("BookiD is " + bookid);
        System.out.println("Author of book is " + author);
        System.out.println("Publisher of book is " + publisher);
    }

}