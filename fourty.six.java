// WAP to declare an array in Java. Create two child threads. One thread must prompt user to enter element in the array (provide appropriate msg is array is full). Another thread must display the elements of the array (provide appropriate msg is array is empty).

import java.util.*;

class A
{
	int len;
	A(int len)
	{
		this.len=len;
		int arr1 [] =new arr1[len];
	}

	public void run()
	{
		System.out.println("Enetr numbers: ");
		for(int i=0; i<len;i++)
		{
			arr1[i]=Sc.nextInt();
		}
	}

	public void run(int len)
	{
		System.out.println("The array elemets are: ");
		for(int i=0;i<len;i++)
		{
			System.out.println(arr1[i]);
		}
	}
}



class Main
{
	public static void main(String args[])
	{
		Scanner Sc=new Scanner(System.in);
		System.out.pritnln("Enetr the length of the array; ");
		int len=Sc.nextInt();
		A a=new A(len);
		Thread t1=new Thread();
		Thread t2=new Thread();
		t1.start();
		t2.start(len);

	}
}