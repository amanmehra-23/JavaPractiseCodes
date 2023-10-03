// Write a Java program using thread interface, take two threads t1 and t2 and fetch the names of the thread.

import java.util.*;
class Aman implements Runnable 
{
	public void run()
	{
		System.out.println("AMAN");
	}
}

class Main
{
	public static void main (String [] args)
	{
		Aman a=new Aman();
		Thread t1=new Thread(a);
		Thread t2=new Thread(a);
		t1.setName("Thread 1");
		t2.setName("Thread 2");
		System.out.println(t1.getName());
		t1.start();
		try 
		{

			t1.join();
		}
		catch(Exception e)
		{
			e.getMessage();
		}
		System.out.println(t2.getName());
		t2.start();
	}
}