//Write a program to create threads using Runnable in Java to count the occurrence of alphabets in a string provided by user.

import java.util.*;

class Count implements Runnable
{
	String sentence;
	char alp;
	Count(String sentence,char alp)
	{
		this.sentence=sentence;
		this.alp=alp;
	}

	public void run()
	{
		int count=0;
		sentence=sentence.toLowerCase();
		char[] a= sentence.toCharArray();
		for(int i=0 ; i<sentence.length();i++)
		{
				if(a[i]==alp)
				{
					count++;
				}		
		}
		System.out.println(count);
	}
}



class  Main
{
	public static void main(String agrs[])
	{
		Scanner Sc=new Scanner(System.in);
		System.out.println("Enter a string: ");
		String sentence=Sc.nextLine();
		System.out.println("Enetr char to count occurence: ");
		char alp=Sc.next().charAt(0);
		Count c=new Count(sentence,alp);
		Thread t1=new Thread(c);
		t1.start();
	}
}