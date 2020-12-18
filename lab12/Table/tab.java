import java.util.*;
import java.lang.*;
import java.io.*;
class table
{
	synchronized void printable(int n)
	{
		try
		{
			System.out.println("Printing The  Table");
		    for(int i=0;i<=15;i++)
		    {
			    System.out.println(n+"x"+i+"="+n*i);
			    Thread.sleep(2000);
		    }
		}catch(InterruptedException e){
			System.out.println("Interrupted Program");
		}
		System.out.println();
	} 
}
class newthread implements Runnable
{
	int n;
	table target;
	Thread t;
	newthread(table targ,int num)
	{
		target=targ;
		n=num;
		t=new Thread(this,"TABLE");
	}
	public void run()
	{
		target.printable(n);
	}
}
class tab 
{
	public static void main(String[] args)
	{
		int num1,num2;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the First Number ");
		num1=sc.nextInt();
		System.out.println("Enter the Second Number");
		num2=sc.nextInt();
		table tl=new table();
		newthread ob1=new newthread(tl,num1);
		newthread ob2=new newthread(tl,num2);
		ob1.t.start();
		ob2.t.start();
		try
		{
			ob1.t.join();
			ob2.t.join();
		}catch(InterruptedException e){
			System.out.println("Exception Caught");
		}
	}
}