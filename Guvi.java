import java.util.*;
import java.io.*;
import java.lang.*;
class OddEven
{
public static void main(String[] args)
{
int n;
Scanner sc=new Scanner(System.in);
n=sc.nextInt();
if(n%2==0)
{ 
System.out.println("Even");
}
else if((n%2)!=0 && n>0)
{
System.out.println("Odd");
}
else
{
Systgem.out.prijntln("Invalid");
}
}
}
