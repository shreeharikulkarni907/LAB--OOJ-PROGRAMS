import java.util.*;
import java.io.*;
import java.lang.*;
class square implements Runnable
{
	String name;
	Thread t;
    int num;
	square(int n,String nam)
	{
		name=nam;
		num=n;
		t=new Thread(this,name);
	}
	public void run()
	{
		System.out.println("Square of the numbeer is " + num*num);
	}
}
class cube implements Runnable
{
	String name;
	Thread t;
	int num;
	cube(int n,String nam)
	{
		name=nam;
		num=n;
		t=new Thread(this,name);
	}
	public void run()
	{
		System.out.println("Cube Of The Numeber is " + num*num*num);
	}
}
class ran implements Runnable
{
	String name;
	Thread t;
	int p;
	int lim;
	ran(String name)
	{
		this .name=name;
		t=new Thread(this,name);
	}
	public void run()
	{
		Scanner sc=new Scanner(System.in);
        try
	    {
	    	System.out.println("Enter the Limit Upto Which You Want To Generate  The Random Number ");
	    	lim=sc.nextInt();
	    	for(int i=0;i<lim;i++)
	    	{

		       int p=(int)((10)*(Math.random()));
		       System.out.println("Random Number Generated is " + p);
		       if(p%2==0)
		       {
			      square s=new square(p,"even");
			      s.t.start();
		       }
		       else
		       {
		          cube c=new cube(p,"odd");
		          c.t.start();
		         //c.t.join();
	           } 
	            Thread.sleep(1000);
 
	       }
		}catch(InterruptedException e){
			System.out.println("Program Interrupted");
		}
    }
}
class random
{
	public static void main(String[] args)
	{
		ran r=new ran("RANDOM");
		r.t.start(); 

	}
}
