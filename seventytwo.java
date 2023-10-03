/*Rajesh is developing Home Security application. So he has created following class .
Administrator
Properties:username, password Methods:setData(), verifyData()
He wants to prevent other classes to modify this class. How can he achieve this? Write template for tha above class.*/

import java.util.*;
final class Administrator
{
	
	private String username;
	private String password;
	void setData()
	{
		Scanner Sc=new Scanner(System.in);
		System.out.println("Enter Username: ");
		 username=Sc.nextLine();
		System.out.println("Enter Pass Code: ");
		 password=Sc.nextLine();
	
	}
	void verifyData()
	{

		System.out.println("Username: "+username);
		System.out.println("Pass Code: "+password);
	}
}

class Main
{
	public static void main(String args[])
	{
		Administrator a=new Administrator();
		a.setData();
		a.verifyData();
	}
}