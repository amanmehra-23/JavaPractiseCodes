/*WAP to inherit a class into another class. Here, superclass and subclass contain a method with the same name. Use the super keyword to access the superclass method from the child class.*/

import java.util.*;
class Parent
{
	void shout()
	{
		System.out.println("AMAN STOP TALKING");
	}
}

class Child extends Parent
{
	void shout()
	{
		super.shout();
		System.out.println("NO I WILL TALK");
	}
}

class Main
{
	public static void main(String args[])
	{
		Parent p=new Parent();
		Child c=new Child();
		c.shout();

	}
}