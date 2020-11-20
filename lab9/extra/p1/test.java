
package p1;
import s1.*;
import m1.*;
import java.util.*;
import java.lang.*;
public class test
{
	public static void main(String[] args)
	{
		String name,usn;
		double m1,m2,m3;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Name of the student ");
		name=sc.next();
		System.out.println("Enter the usn of the student ");
		usn=sc.next();
		student ob1=new student(name,usn);

		System.out.println("Enter the marks of the first subject ");
		m1=sc.nextDouble();
		System.out.println("Enter the marks of the second subject ");
		m2=sc.nextDouble();
		System.out.println("Enter the marks of the subject 3 ");
		m3=sc.nextDouble();

		marks ob2=new marks(m1,m2,m3);
		double ans=ob2.avg();
		System.out.println("Details of the student are ");
		System.out.println();
		ob1.display();
		System.out.println("Average of the student is " + ans);



	}
}