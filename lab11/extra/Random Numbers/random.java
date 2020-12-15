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
class ran
{
	public static void main(String[] args)
	{
		int lim;
		System.out.println("Enter the Limit Upto Which You Want To generate Cube And Square");
		Scanner sc=new Scanner(System.in);
		lim=sc.nextInt();

		try
		{
		   Thread.currentThread().setPriority(10);
		   for(int i=0;i<lim;i++)
		   {
		       int p=(int)((10)*(Math.random()));
		       Thread.sleep(1000);
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
		   }
		}catch(InterruptedException e){
			System.out.println("Program Interrupted");
		}
	}
}