//Write a program to display the sum of n numbers and product of n numbers using multithreading in Java. The program must print the sum and product values simultaneously (eg. 1 1 3 3 6 6 10 24).

import java.util.*;
class Numbers extends Thread
{
	int num;
	int end;
	Numbers(int num,int end)
	{
		this.num=num;
		this.end=end;
	}
	public  void run()
	{
		int sum=0;
		int product=1;
		for(int i=num;i<end;i++)
		{
			
			sum=sum+i;
			product*=i;
			System.out.print(sum+" ");
			System.out.print(product+ " ");
		}
	}
}


class Main
{
	public static void main(String args[])
	{
		Scanner Sc=new Scanner(System.in);
		System.out.println("enter start nuumber");
		int num=Sc.nextInt();
		int end=5;
		Numbers n=new Numbers(num,end);
		Thread t1=new Thread(n);
		t1.start();
	}
}