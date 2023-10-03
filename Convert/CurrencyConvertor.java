package Convert;
public class CurrencyConvertor
{
	int usd;
	public CurrencyConvertor(int usd)
	{
		this.usd=usd;
	}
	public void currency()
	{
		double inr;
		inr=82.29*usd;
		System.out.println("Rupees: "+inr);
	}
}