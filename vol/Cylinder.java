//WAP to create a package called vol having Cylinder class and volume (). WAP that imports this package to calculate volume of a Cylinder.

package vol;

public class Cylinder
{
	int rad;
	int height;
	public Cylinder(int rad,int height)
	{
		this.rad=rad;
		this.height=height;
	}
	public void volume()
	{
		double volume;
		double pie=3.14;
		volume=pie*rad*rad*height;
		System.out.println("Volume of the Cyclinder is: "+volume);
	}
}