import java.util.*;
class Main
{
	public static void main(String args[])
	{
		Vector<String> v=new Vector<>();
		v.add(args[0]);
		v.add(args[1]);
		Scanner Sc=new Scanner(System.in);
		v.add(Sc.nextLine());
		System.out.println(v);
		if(v.contains("Aman"))
		{
			v.removeElement("Aman");
		}
			System.out.println(v);
	}
}