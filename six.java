//Write a program that reads a string from the user and converts it to uppercase. Handle the exception when the user enters a null string.

import java.util.*;
class Main extends Exception
{
	public static void main(String args[])
	{
		Scanner Sc=new Scanner(System.in);
		try
		{
			System.out.println("Enter a String: ");
			String line=Sc.nextLine();
			if(line.length()==0)
			{
				throw new Exception();
			}
			line=line.toUpperCase();
			System.out.println("The line in upper case is: "+line);

		}
		catch(Exception e)
		{
			System.out.println("Null Input");
		}
	}
}