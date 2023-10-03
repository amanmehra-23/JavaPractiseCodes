//Write a program that reads a number from the user and checks if it is a prime number. Handle the exception when the user enters a negative number.

import java.util.*;
class Main extends Exception
{
	public static void main(String args[])
	{
		boolean prime=false;
		try
		{
			Scanner Sc=new Scanner(System.in);
			System.out.println("Enter any number: ");
			int num=Sc.nextInt();
			if(num<0)
			{
			 	throw new Exception();
			}
			else
			{
				for(int i=2;i<num;i++)
				{
					if(num%i==0)
					{
						prime=true;
					}

				}
				if(prime==false)
				{
					System.out.println("The number is prime");
				}
				else 
				{
					System.out.println("The number is NOT prime");
				}
			}
		}
		catch(Exception e)
		{
			System.out.println("Error: The number is negative");
		}
	}
}