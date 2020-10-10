import java.util.*;
import java.lang.*;
import java.io.*;
public class extra5
{
    public static String id;
    public static String name;
    public static int[] scores;
    public static int no_of_matches_played;
    static double sum=0;
    static double average;
    public extra5(String i,String n,int mat)
    {
        id=i;
        name=n;
        no_of_matches_played=mat;
        scores=new int[no_of_matches_played];
    }
    public static void read()
    {  
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Scores Of The Player In The matches");
        for(int i=0;i<no_of_matches_played;i++)
        {
            System.out.println("enter the Score Scored By The Player in the match " + (i+1));
            scores[i]=sc.nextInt();
        }  

    }
    public static double calc()
    {
        
        for(int i=0;i<no_of_matches_played;i++)
        {
            sum+=scores[i];
        }

        average=sum/no_of_matches_played;
        //System.out.println("Sum Of His Scores In All Matches " + sum);
        sum=0; 
        return average;
    }

    public static void display()
    {
        System.out.println("ID of the player is " + id);
        System.out.println("Name Of The Player is " + name);
       // System.out.println("Total Score scored by the player is " + sum);
        //System.out.println("Average Score Of The Player is " + calc());

    }
}