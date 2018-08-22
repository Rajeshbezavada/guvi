import java.util.*;
import java.lang.*;
import java.io.*;
class Fib
{
	public static void main (String[] args) throws java.lang.Exception
	{
		int c;
		int a=0,b=1;
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		System.out.print(b);
		System.out.print(" ");
		for(int i=1;i<n;i++)
		{
			c=a+b;
			System.out.print(c);
			System.out.print(" ");
			a=b;
			b=c;
		}
	}
}
