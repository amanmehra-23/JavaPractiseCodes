//Write a program to create a package , import it in another program and call the method in the package. The program should display if the entered string is palindrome or not.
import java.util.*;
import Pal.Pali;
class Main
{
	public static void main(String args[])
	{
		Scanner Sc=new Scanner(System.in);
		System.out.println("enter a String to see if its palindrome ");
		String str=Sc.nextLine();
		StringBuffer s=new StringBuffer(str);
		Pali p =new Pali(s);
	}
}