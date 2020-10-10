import java.io.*;
import java.util.*;
public class extra3
{
    private static double[] r_item;
    private static int[] quan;
    private static int item;
    public static void read()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of item");
        item=sc.nextInt();
        r_item=new double[item];
        quan=new int[item];
        System.out.println("Enter the Rate Per Item of "+ item +"items ");
        for(int i=0;i<item;i++)
        {
            System.out.println("Enter the per item cost of item: " + (i+1));
            r_item[i]=sc.nextDouble();
        }
        System.out.println("Enter the Number Of Item purchased ");
        for(int i=0;i<item;i++)
        {
            System.out.println("Enter The Quantity Of item: " + (i+1) + " Purchased ");
            quan[i]=sc.nextInt();
        }
    }
    public static double calc()
    {
        read();
        double bill=0;
        double disc;
        for(int i=0;i<item;i++)
        {
            System.out.println(quan[i]);
            bill+=r_item[i]*quan[i];
        }
        System.out.println("Total Bill Without Discount is " + bill);
        if(bill>=10000)
        {
            disc=((5*bill)/(100));
            System.out.println("Discount Given is " + disc);
            bill=bill-disc;
            return bill;
        }
         if(bill>=7500&&bill<10000)
        {
            disc=((3*bill)/(100));
            System.out.println("Discount given is " + disc);
            bill=bill-disc;
            return bill;
        }
        if(bill>=5000&&bill<7500)
        {
            disc=((2*bill)/(100));
            System.out.println("Discount given  is " + disc);
            bill=bill-disc;
            return bill;
        }
        System.out.println("Sorry No Discount Can Be Given");
        return bill;

    }
    public static void main(String[] args)
    {
        double bill=calc();
        System.out.println("Final Bill Amount After Discount is " + bill);
    }

}