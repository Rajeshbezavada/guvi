import java.util.*;
import java.lang.*;
import java.io.*;
class Evennumber
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		for(int i=a+1;i<b;i++)
		{
			if(i%2==0)
			System.out.println(i);
		}
	}
}
