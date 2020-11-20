package m1;
import java.util.*;
import java.io.*;
import java.lang.*;
public class marks
{
	public double m1,m2,m3;
	public marks(double m1,double m2,double m3)
	{
		this.m1=m1;
		this.m2=m2;
		this.m3=m3;
	}
	public double avg()
	{
		double avg=(m1+m2+m3)/3;
		return avg;
	}
}
