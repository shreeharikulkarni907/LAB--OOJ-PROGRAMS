import java.util.*;
import java.io.*;
import java.lang.*;
public class testbook
{
    public static String[] bookid;
    public static String[] booktitle;
    public static String[] author;
    public static String[] publisher;
    static int n;
    public static void main(String[] args)
    {
        double a=0;
        double b=0;
        Scanner sc=new Scanner(System.in);
    
        System.out.println("Enter the number of books ");
        n=sc.nextInt();
        bookid=new String[n];
        booktitle=new String[n];
        author=new String[n];
        publisher=new String[n];
        for(int i=0;i<n;i++)
        {
            System.out.println("Enter the book id of book " + (i+1));
            bookid[i]=sc.next();
            System.out.println("Enter the book title of the book " + (i+1));
            booktitle[i]=sc.next();
            System.out.println("Enter the author of book " + (i+1));
            author[i]=sc.next();
            System.out.println("Enter the name of the publisher for the book " + (i+1));
            publisher[i]=sc.next();
        }
        extra6 ob=new extra6();
        ob.read();
        extra6 ob1=new extra6(bookid[0],booktitle[0],author[0],publisher[0],n);
        a=ob1.most_exp();
        b=ob1.least();
        if(ob1.price[0]==a)
        {
            System.out.println("*****************Details Of the Costliest Book is ************");
            System.out.println("Price Of the Costliest Book Is " + a);
            ob1.display();
            a=0;
        }
        if(ob1.no_of_pages[0]==b)
        {
            System.out.println("****************Details Of the Book Least Number Of Pages******************");
            System.out.println("Number Pages In the book is " + b);
            ob1.display();
            b=0;
        }
        extra6 ob2=new extra6(bookid[1],booktitle[1],author[1],publisher[1],n);
        a=ob2.most_exp();
        b=ob2.least();
        if(ob2.price[1]==a)
        {
            System.out.println("*****************Details Of the Costliest Book is ************");
            System.out.println("Price Of the Costliest Book Is " + a);
            ob2.display();
            a=0;
        }
        if(ob2.no_of_pages[1]==b)
        {
            System.out.println("*****************Details Of the Book Least Number Of Pages ************");
            System.out.println("Number Pages In the book is " + b);
            ob2.display();
            b=0;
        }

        extra6 ob3=new extra6(bookid[2],booktitle[2],author[2],publisher[2],n);
        a=ob3.most_exp();
        b=ob3.least();
        if(ob3.price[2]==a)
        {
            System.out.println("*****************Details Of the Costliest Book is ************");
            System.out.println("Price Of the Costliest Book Is " + a);
            ob3.display();
            a=0;
        }
        if(ob3.no_of_pages[2]==b)
        {
            System.out.println("*****************Details Of the Book With least Number Of Pages is ************");
            System.out.println("Number of Pages In the book is " + b);
            ob3.display();
            b=0;
        }
        int in_2020=ob.pub_in_2020();
        System.out.println();
        System.out.println("Numnber Of Book Published in 2020 is " + in_2020);

     }
}
           

       
