import java.io.*;
import java.lang.*;
import java.util.*;
public class book3
{
    public String name;
    public String author;
    public double price;
    public int no_of_pages;
    public book3(String n,String a,double pri,int pages)
    {
        name=n;
        author=a;
        price=pri;
        no_of_pages=pages;
    }
    @Override
    public String toString()
    {
        return "Name of the book is: " + name + " Author Of The Book Is: " + author +" Cost of the book is: " + price + " Number Of Pages in the book is " + no_of_pages;
    }
}