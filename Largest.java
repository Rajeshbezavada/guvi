import java.util.*;
import java.lang.*;
import java.io.*;
class Largest
{
	public static void main (String[] args) throws java.lang.Exception
	{
		int a,b,c;
        Scanner sc=new Scanner(System.in);
        a=sc.nextInt();
        b=sc.nextInt();
        c=sc.nextInt();

        if(a >= b) {
            if(a >= c)
                System.out.println(a);
            else
                System.out.println(c);
        } else {
            if(b >= c)
                System.out.println(b);
            else
                System.out.println(c);
        }
	}
}
