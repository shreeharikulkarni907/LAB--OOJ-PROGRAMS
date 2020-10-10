import java.util.*;
import java.lang.*;
public class testplayer
{
    static String[] id;
    static String[] name;
    static int[] no;
    static int n;
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        id=new String[2];
        name=new String[2];
        no=new int[2];

        for(int i=0;i<2;i++)
        {
            System.out.println("Enter the Id Of The Player " + (i+1));
            id[i]=sc.next();
            System.out.println("Enter the name Of Player " + (i+1));
            name[i]=sc.next();
            System.out.println("Enter the Number of matches Played By The Player" + (i+1));
            no[i]=sc.nextInt();
        }
        extra5 ob1=new extra5(id[0],name[0],no[0]);
        ob1.read();
        double av1=ob1.calc();
        
       //System.out.println(av1);

        extra5 ob2=new extra5(id[1],name[1],no[1]);
        ob2.read();
        double av2=ob2.calc();
        System.out.println("Average of the player 1 is" + av1);
        System.out.println("Average Of the player 2 is " + av2);
        System.out.println("Details Of the Player With Highest Average is");
        System.out.println();

        if(av1>av2)
        {
            extra5 ob=new extra5(id[0],name[0],no[0]);
            ob.display();
            System.out.println("Avearge Score of the player is " + av1);
        }
        else if(av1<av2)
        {
            extra5 ob=new extra5(id[1],name[1],no[1]);
            ob.display();
            System.out.println("Avearge Score of the player is " + av2);
        }
        else{
            System.out.println("BOTH THE PLAYERS HAVE SAME AVERAGE");
            System.out.println("Their Details Are ");
            extra5 obj1=new extra5(id[0],name[0],no[0]);
            ob1.display();

            extra5 obj2=new extra5(id[1],name[1],no[1]);
            ob2.display();

        }

        //System.out.println(av2);
       


        

    }
}
  