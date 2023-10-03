//Write a program that reads a list of strings from the user and counts the number of vowels in each string. Handle the exception when the user enters null strings.

import java.util.*;
class  Main extends Exception
{
	public static void main(String args[])
	{
		Scanner Sc=new Scanner(System.in);
		System.out.println("Enter the number of Strings: ");
		int num=Sc.nextInt();
		Sc.nextLine();
	
		for(int i=0;i<num;i++)
		{
			try
			{

				System.out.println("Enter  number "+(1+i)+" String");
				String s=Sc.nextLine();
				if(s.equals(""))
				{
					throw new Exception();
				}
				
				else
				{
					int count=0;
					s=s.toLowerCase();
					for(int j=0;j<s.length();j++)
					{
						if(s.charAt(j)=='a' || s.charAt(j)=='e' || s.charAt(j)=='i' || s.charAt(j)=='o' || s.charAt(j)=='u')
						{
							count++;
						}
					}
					System.out.println("The number of vowels is: "+count);
				}

			}
			catch(Exception e)
			{
				System.out.println(e.getMessage());
			}
		}
	}

}