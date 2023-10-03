//Create a package named Convert that contains two classes: TemperatureConverter and CurrencyConverter. The TemperatureConverter class should have methods to convert Celsius to Fahrenheit. The CurrencyConverter class should have methods to convert USD to INR. Write a program in the main class to demonstrate the usage of these converters.


package Convert;
public class TemperatureConvertor
{
	int cel;
	public TemperatureConvertor(int cel)
	{
		this.cel=cel;
	}
	public void temperature()
	{
		double far;
		far=1.8*cel+32;
		System.out.println("Temp in Faranheight: "+ far);
	}

}

