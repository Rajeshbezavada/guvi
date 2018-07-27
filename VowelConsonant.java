import java.util.*;
import java.lang.*;
import java.io.*;
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc=new Scanner(System.in);
		char n=sc.next().charAt(0);
		if(n=='a'||n=='e'||n=='i'||n=='o'||n=='u')
		{
			System.out.println("Vowel");
		}
		else if(n=='b'||n=='c'||n=='d'||n=='f'||n=='g'||n=='h'||n=='j'||n=='k'||n=='l'||n=='m'||n=='n'||n=='p'||n=='q'||n=='r'||n=='s'||n=='t'||n=='v'||n=='w'||n=='x'||n=='y'||n=='z')
		{
			System.out.println("Consonant");
		}
		else
		{
			System.out.println("invalid");
		}
	}
}
