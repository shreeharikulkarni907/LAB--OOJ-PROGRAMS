import java.io.*;
import java.util.*;
import java.lang.*;
public class testbook3
{
    public static String name;
    public static String author;
    public static double price;
    public static int no_of_page;
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n;  
        System.out.println("Enter the number of books");
        n=sc.nextInt();
        book3[] ob=new book3[n];
        for(int i=0;i<n;i++)
        {
            System.out.println("Enter the name of the book " + (i+1));
            name=sc.next();
            System.out.println("Enter the author of the book " + (i+1));
            author=sc.next();
            System.out.println("Enter the price of the book " + (i+1));
            price=sc.nextDouble();
            System.out.println("Enter the number of pages of book " + (i+1));
            no_of_page=sc.nextInt();
            ob[i]= new book3(name,author,price,no_of_page);
            //ob[i]=new lab_program3(name,author,price,)
        }
        for(int i=0;i<n;i++)
        {
            System.out.println("Displaying the details of the book " + (i+1));
            //System.out.println();
            System.out.println(ob[i]);
        }  
    }
}