import java.io.*;
import java.lang.*;
import java.util.*;
class Q
{
	int n;
	boolean valueset=false;
	synchronized int get()
	{
	    try
	    {
		    while(!valueset)
		   {
			  wait();
		   } 
	    }catch(InterruptedException e)
	    {
		   System.out.println("Exception Caught");
	    }
	    System.out.println("Got " + n);
	    valueset=false;
	    notify();
	    return n;
	}
	synchronized void put(int n)
	{
		try
		{
			while(valueset)
			{
				wait();
			}
		}catch(InterruptedException e){
			System.out.println("Exception Caught");
		}
		this.n=n;
		valueset=true;
		System.out.println("PUT " + n);
		notify();
	}
}
class producer implements Runnable
{
	Thread t;
	Q q;
	producer(Q q)
	{
		this.q=q;
		t=new Thread(this,"Producer");
	}
	public void run()
	{
		int i=0;
		while(true)
		{
			q.put(i++);
		}
	}
}
class consumer implements Runnable
{
	Q q;
	Thread t;
	int o;
	consumer(Q q)
	{
		this.q=q;
		t=new Thread(this,"Consumer");
	}
	public void run()
	{
		while(true)
		o=q.get();
	}

}
class test
{
	public static void main(String[] args)
	{
		Q q=new Q();
		producer p=new producer(q);
		consumer c=new consumer(q);
		p.t.start();
		c.t.start();

		System.out.println("Press Ctrl + c to exit ");
	}
}