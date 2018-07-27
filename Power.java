import java.util.*;
import java.lang.*;
import java.io.*;
class Power
{
	public static void main (String[] args) throws java.lang.Exception
	{
		int a,n,R;
		Scanner sc=new Scanner(System.in);
		a=sc.nextInt();
		n=sc.nextInt();
		R=1;
		for(int i=1;i<=n;i++)
		{
			R=R*a;
		}
		System.out.println(R);
	}
}
