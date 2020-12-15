import java.util.*;
import java.io.*;
import java.lang.*;
class newthread implements Runnable
{
	Thread t;
	newthread()
	{
		t=new Thread(this,"oddsum");
		System.out.println(t);
	}
	public void run()
	{
		int sum_o=0;
		for(int i=1;i<=100;i+=2)
		{
			sum_o+=i;
		}
		System.out.println("Sum of Odd Numbers Is  " + sum_o);

	}

}
class sum_of_even_and_odd 
{
	public static void main(String[] args)
	{
		newthread nt=new newthread();
		Thread.currentThread().setPriority(10);
		nt.t.start();
		int sum_e=0;
		for(int i=2;i<=100;i+=2)
		{
			sum_e+=i;
		}
		System.out.println("SUM OF EVEN NUMBERS IS " + sum_e);
	}
}
