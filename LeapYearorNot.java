import java.util.*;
import java.lang.*;
import java.io.*;
class LeapYearorNot
{
	public static void main (String[] args) throws java.lang.Exception
	{
		int year;
	Scanner sc=new Scanner(System.in);
	year=sc.nextInt();
	if(year%4==0)
	{
		System.out.println("yes");
	}
		else{
		System.out.println("no");
	}
}
}
