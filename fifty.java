//. Write a Java program showing the actions from the three threads. Use runnable interface to create the threads. Make sure that the main thread always executes last.


import java.util.*;
class Show  implements Runnable 
{
	 String tname;
	Show(String tname)
	{
		this.tname=tname;
	}
	public void run()
	{
		System.out.println(tname);
	}
}


class Main
{
	public static void main(String args[])
	{
		Show s=new Show("THREADS: ");

		Thread t1=new Thread(s);
		Thread t2=new Thread(s);
		Thread t3=new Thread(s);
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

		try 
		{
			t2.join();
		}
		catch(Exception e)
		{
			e.getMessage();
		}
		System.out.println(t3.getName());
		t3.start();
		
		try 
		{
			t3.join();
		}
		catch(Exception e)
		{
			e.getMessage();
		}
		   try {
            t1.join();
            t2.join();
            t3.join();
        } catch (Exception e) {
            e.getMessage();
        }

        System.out.println("Main Thread");
		
	}
}