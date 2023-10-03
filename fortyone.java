// Write a multithreaded program to print table of Five, Seven, thirteen using Multithreading (Use Thread class for the implementation).



import java.util.*;
class Table extends Thread
{
	int num, max;
	Table(int num,int max)
	{
		this.num=num;
		this.max=max;
	}
	public void run()
	{
		for(int i=1;i<max;i++)
		{
			System.out.println(i+" X "+num+" = "+(i*num));
		}
	}
}


class Main
{
	public static void main(String agrs[])
	{
		Scanner Sc=new Scanner(System.in);
		System.out.println("Enter last number of the table: ");
		int max=Sc.nextInt();
		Table five=new Table(5,max);
		Table seven=new Table(7,max);
		Table thirteen=new Table(13,max);
		Thread t1=new Thread(five);
		Thread t2=new Thread(seven);
		Thread t3=new Thread(thirteen);
		try
		{
			t1.start();
			t2.start();
			t3.start();
			
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
	}
}