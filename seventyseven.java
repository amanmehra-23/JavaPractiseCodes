//Write a Java program that reads a positive integer from command line and count the number
//of digits the number (less than ten billion) has.
import java.util.*;
class Main
{
	public static void main(String args[])
	{
		Scanner Sc=new Scanner(System.in);
		int num=Integer.parseInt(args[0]);
		int dig=0;
		while (num>0)
		{
			
			num=num/10;
			dig++;
		}
		System.out.println("Digits: "+dig);
	}
}