//Write a program to display multiplication table of 4 and 8 using two threads in Java. First thread must display multiplication table of 4. Second thread must display multiplication table of 8. Ensure that the table of 8 is given more importance and executed first. Stop the execution of table 8 in the 5th iteration and complete execution of table 4.


import java.util.*;
class Table extends Thread
{ 
	int n,l;
	Table(int n,int l)
	{
		this.n=n;
		this.l=l;
	}
	public void run()
	{
		System.out.println("Table of "+n);
		for(int i=1;i<=l;i++)
		{
			System.out.println(n+" X "+i+" = "+(n*i));
		}
	}
}



class Main
{
	public static void main(String agrs[])
	{
		Scanner Sc=new Scanner(System.in);
		System.out.println("Enetr the last number of th table: ");
		int l=Sc.nextInt();
		Table five = new Table(5,l);
		Table eight =new Table(8,l);
		Thread t1=new Thread(five);
		Thread t2=new Thread(eight);
		t1.start();
		t2.start();
		try
		{
			t2.setPriority(Thread.MAX_PRIORITY);
			t1.setPriority(Thread.MIN_PRIORITY);
			t1.join();
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}

	}
}