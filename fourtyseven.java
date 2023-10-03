//Write a multithreaded program that outputs prime numbers. This program should work as follows: The user will run the program and will enter a number on the command line. The program will then create a separate thread that outputs all the prime numbers less than or equal to the number entered by the user.


import java.util.*;

class Prime extends Thread
{
	int limit;
	Prime(int limit)
	{
		this.limit=limit;
	}
	public void run()
	{
		for(int i=1;i<=limit;i++)
		{
			for(int j=2;j<i-1;j++)
			{
				if(i%j==0)
				{
					break;
				}
				else 
				{
					System.out.println(i);
					break;
				}
			}

		}
	}
}


class Main
{
	public static void main(String args[])
	{
		Scanner Sc=new Scanner(System.in);
		System.out.println("Enter a number: ");
		int num=Sc.nextInt();
		Prime p=new Prime(num);
		p.start();
	}
}