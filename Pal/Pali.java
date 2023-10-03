//Write a program to create a package , import it in another program and call the method in the package. The program should display if the entered string is palindrome or not.

package Pal;
public class Pali
{
	StringBuffer s;
	public Pali(StringBuffer  s)
	{
		this.s=s;
		StringBuffer r=s.reverse();
		if(s.equals(r))
		{
			System.out.println("Pallindrome");
		}
		else
		{
			System.out.println("not palindrome.");
		}
	}
}