import java.util.*;
import java.lang.*;
import java.io.*;
class Maxelement
{
	public static void main (String[] args) throws java.lang.Exception
	{
	int max;
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	int a[]=new int[n];
	for(int i=0;i<n;i++)
	{
		a[i]=sc.nextInt();
	}
	max=a[0];
	for(int i=0;i<n;i++)
	{
		if(max<a[i])
		{
			max=a[i];
		}
	}
	System.out.println(max);
	}
}
