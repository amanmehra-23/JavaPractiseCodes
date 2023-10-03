/*Consider a simplified representation of the Retail industry and implement it using dynamic method dispatch .:
1. Product (Superclass):
• Properties: productId, name, price
• Methods: calculateDiscount(), displayDetails()
2. Clothing (Subclass):
• Properties: size, color
• Methods: calculateDiscount() (overrides the superclass method)
3. Electronics (Subclass):
• Properties: brand, warrantyPeriod
• Methods: calculateDiscount() (overrides the superclass
method)
Create objects of both the Clothing and Electronics classes and refer to them using a common Product reference. Invoke overridden methods based on the actual object type, such as calling calculateDiscount() to calculate the discount for a clothing item or an electronic item, depending on the actual object being referred to.*/

class Product
{
	int productid;
	String name;
	int price;
	Product(int productid,String name,int price)
	{
		this.productid=productid;
		this.name=name;
		this.price=price;
	}
	void calculateDiscount()
	{
		int discount=price*10/100;
		System.out.println("Discount: "+discount);
	}
	void displayDetails()
	{
		System.out.println("Name: "+name);
		System.out.println("Price: "+price);
		System.out.println("Product Id: "+productid);
	}

}
class Clothing extends Product
{
	int y;
	Clothing(int y,int productid,String name,int price)
	{
		super(productid,name,price);
		this.y=y;//checking how if the subclass can have different length of paramter than the parent class
	}
	void calculateDiscount()
	{
		char size='m';
		String colour="Blue";
		int discount=size*10/100*price;
		System.out.println("disocount on clothes: "+discount);
		System.out.println("Size: "+size);
		System.out.println("colour: "+colour);
		super.displayDetails();
	}
}

class Electronics extends Product
{
	
	Electronics(int productid,String name,int price)
	{
		
		super(productid,name,price);
	}
	void calculateDiscount()
	{
		String brand="apple";
		int warrantyperiod=5;
		double discount=warrantyperiod*price*10/100;
		System.out.println("disocount on electronics: "+discount);
		System.out.println("brand: "+brand);
		System.out.println("warranty period: "+warrantyperiod);
		super.displayDetails();
	}
}

class Main
{
	public static void main(String args[])
	{
	
		Product p1=new Clothing(5,216,"Shirt",5000);
		Product p2=new Electronics(20,"phone",50000);
		p1.calculateDiscount();
		p2.calculateDiscount();
	}
}