//Write a program that reads a list of numbers from the user and finds the maximum value. Handle the exception when the user enters non-numeric values.

import java.util.*;
class Main extends Exception
{
	public static void main(String args[])
	{
			int max=0;

		try
		{
			Scanner Sc=new Scanner(System.in);
			System.out.println("Enter the length of the string: ");
			int len=Sc.nextInt();
			int [] arr=new int[len];
			System.out.println("Enter "+len+" numbers: ");
			for(int i=0;i<len;i++)
			{
				arr[i]=Sc.nextInt();
			}
			max=arr[0];
			for(int i=0;i<len;i++)
			{
				if(max<arr[i])
				{
					max=arr[i];
				}
			}


		}
		catch(Exception e)
		{
			System.out.println("NON NUMERIC");
		}
		finally
		{
			System.out.println("The max number is: "+max);
		}

	}
}