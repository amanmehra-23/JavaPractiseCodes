
//Write a program to create a package and show the excecution of the same. The program should display the given number is even or odd.
import EO.EvenOdd;
import java.util.*;

class Main
{
	public static void main(String args[])
	{
		Scanner Sc=new Scanner(System.in);
		System.out.println("enetr a number: ");
		int num=Sc.nextInt();
		EvenOdd eo=new EvenOdd(num);
	}
}