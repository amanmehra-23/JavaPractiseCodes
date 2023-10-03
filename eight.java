//Write a program that reads two integers from the user and calculates their average. Handle the exception when the user enters non-numeric values.

import java.util.*;
class Main extends Exception
{
	public static void main(String args[])
	{
		Scanner Sc=new Scanner(System.in);
		try
		{
			double num1,num2;
			double avg;
			System.out.println("Enter any two numbers: ");
			num1=Sc.nextDouble();
			num2=Sc.nextDouble();
			avg=(num1+num2)/2;
			System.out.println("The avg of the two numbers is: "+avg);
		}	
		catch(Exception e)
		{
			System.out.println("Wrong input ");
		}
	}
}