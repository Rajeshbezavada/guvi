import java.util.*;
import java.lang.*;
import java.io.*;
class Palindrome
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int rev=0,remainder=0;
		while(n!=0)
		{
			n=n%10;
			rev=rev*10+remainder;
			n=n/10;
		}
		if(n==rev)
		System.out.println("yes");
		else
		System.out.println("not");
	
}
}
