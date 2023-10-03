//Write a program to create two threads in Java. Each thread will generate numbers (from 1 to 25) divisible by 3 and 5 respectively. Change the default name and priority of the threads. Display the name of the thread and its priority.


import java.util.*;
class Div extends Thread
{
	int num;
	Div(int num)
	{
		this.num=num;
	}
	public void run()
	{
		System.out.println("divisible by: "+num);
		for(int i=1;i<=25;i++)
		{
			if(i%num==0)
			{
				System.out.println(i);
			}
		}
	}
}

class Main
{
	public static void main(String agrs[])
	{
		Div three=new Div(3);
		Div five=new Div(5);
		Thread t1=new Thread(three);
		Thread t2=new Thread(five);
		t1.setName("ThreadThree");
		t2.setName("ThreadFive");
		t1.setPriority(Thread.MAX_PRIORITY);
		t2.setPriority(Thread.MIN_PRIORITY);
		System.out.println("Thread name: "+t1.getName()+" Priorirty: "+t1.getPriority());
		System.out.println("Thread name: "+t2.getName()+" Priorirty: "+t2.getPriority());
		t1.start();
		t2.start();
	}
}