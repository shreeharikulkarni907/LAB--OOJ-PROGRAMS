import java.io.*;
import java.lang.*;
import java.util.*;
abstract class shape{
	int len,wid;

	shape(int l,int w)
	{
		len=l;
		wid=w;
	}
	abstract void printArea();
}


class rectangle extends shape
{
	rectangle(int a,int b)
	{
		super(a,b);
	}

	void printArea()
	{
		System.out.println("Area Of Rectangle is " + (len*wid));
	}

}

class triangle extends shape
{
	triangle(int a,int b)
	{
		super(a,b);
	}

	void printArea()
	{
		System.out.println("Area Of The Traingle Is " + ((len*wid)/2));
	}
}

class circle extends shape
{
	circle(int r1,int r2)
	{
		super(r1,r2);
	}
	void printArea()
	{
	    System.out.println("Area Of the Circle is " + (3.142*len*len));
	}
}

class test
{
	public static void main(String[] args)
	{
		int l,b,rad;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the length/base of the rectangle/Traingle respectively ");
		l=sc.nextInt();
		System.out.println("Enter the breadth/height of the rectangle/Triangle respectively ");
		b=sc.nextInt();
		System.out.println("Enter the radius of the circle ");
		rad=sc.nextInt();
		shape s;
		rectangle r=new rectangle(l,b);
		triangle t=new triangle(l,b);
		circle c=new circle(rad,rad);
		s=r;
    	s.printArea(); //prints the area of the rectangle
		s=t;
		s.printArea(); //prints the area of the triangle 
		s=c;
		s.printArea(); //prints the area of the circle
	}
}