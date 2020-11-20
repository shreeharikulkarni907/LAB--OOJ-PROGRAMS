package s1;
import java.util.*;
import java.io.*;
import java.lang.*;
public class student
{
	public String name;
	public String usn;
	public student(String name,String usn)
	{
		this.name=name;
		this.usn=usn;
	}

	public void display()
	{
		System.out.println("Name of the student is " + name);
		System.out.println("USN of the student is " + usn);
		
	}
}