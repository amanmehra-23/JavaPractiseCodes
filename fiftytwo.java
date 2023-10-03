//Create a package named Convert that contains two classes: TemperatureConverter and CurrencyConverter. The TemperatureConverter class should have methods to convert Celsius to Fahrenheit. The CurrencyConverter class should have methods to convert USD to INR. Write a program in the main class to demonstrate the usage of these converters.

import Convert.TemperatureConvertor;
import Convert.CurrencyConvertor;
import java.util.*;

class Main
{
	public static void main(String args[])
	{
		Scanner Sc=new Scanner(System.in);
		System.out.println("enetre the tempreature in degree celcius: ");
		int cel=Sc.nextInt();
		System.out.println("Enter the money in usd: ");
		int usd=Sc.nextInt();
		TemperatureConvertor tc=new TemperatureConvertor(cel);
		tc.temperature();
		CurrencyConvertor cc=new CurrencyConvertor(usd);
		cc.currency();
	}
}
