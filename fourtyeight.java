/*. Write a multithreaded program that calculates various statistical values for a list of numbers. This program should read values in an array and will then create three separate worker threads. One thread will determine the average of the numbers, the second will determine the maximum value, and the third will determine the minimum value. For example, suppose your program is passed the integers
90 81 78 95 79 72 85
The program will report The average value is 82 The minimum value is 72 The maximum value is 95
*/
import java.util.*;
class Avg extends Thread
{
	private int arr[],len;
	Avg(int[] arr,int len)
	{
		this.arr=arr;
		this.len=len;
	}
	public void run()
	{
		int avg,sum=0;
		for(int i=0;i<len;i++)
		{
			sum=arr[i]+sum;
		}
		avg=sum/len;
		System.out.println("The average value is "+avg);
	}
}

class Mini extends Thread
{
	private int arr[],len;
	Mini(int []arr,int len)
	{
		this.arr=arr;
		this.len=len;
	}
	public void run()
	{
		int mini=arr[0];
		for(int i=0;i<len;i++)
		{
			if(mini>arr[i])
			{
				mini=arr[i];
			}
		}
		System.out.println("The minimum value is "+mini);
	}

}

class Max extends Thread
{
	private int arr[],len;
	Max(int []arr,int len)
	{
		this.arr=arr;
		this.len=len;
	}
	public void run()
	{
		int max=arr[0];
		for(int i=0;i<len;i++)
		{
			if(max<arr[i])
			{
				max=arr[i];
			}
		}
		System.out.println("The maximum value is "+max);
	}
}

class Main
{
	public static void main(String args[])
	{
		Scanner Sc=new Scanner(System.in);
		System.out.println("Enter the length of an array: ");
		int len=Sc.nextInt();
		int arr[]=new int[len];
		System.out.println("Enter "+len+" numbers: ");
		for(int i=0;i<len;i++)
		{
			arr[i]=Sc.nextInt();
		}
		Avg a=new Avg(arr,len);
		Mini min=new Mini(arr,len);
		Max  max=new Max(arr,len);
		a.start();
		try
		{
			a.join();
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
		min.start();
		try
		{
			min.join();
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
		max.start();
		try
		{
			max.join();
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}

	}
}