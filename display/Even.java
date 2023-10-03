//Write a program to create a package , import it in another program and call the method in the package which displays all the even numbers from 1 to 10.

package display;

public class Even
{
	public Even()
	{
		for(int i=1;i<=10;i++)
		{
			if(i%2==0)
			{
				System.out.println(i);
			}
		}
	}
}