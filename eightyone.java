//print pattern

class Main
{
	public static void main(String args[])
	{
	
		int n=4;
		char a='a';
		for(int i=1;i<=n;i++)
		{
			/*if(i%2!=0)
			{
				for(int j=1; j<=i;j++)
				{
					
							System.out.print(j+" ");
				}
			}
			else 
			{
				for(int k=i;k>=1;k--)
				{
					System.out.print(k+" ");
				}
			}
			System.out.println();*/
			int count=1;
			for(int j=n-i;j>0;j--)
			{
				System.out.print(" ");
			}
			for(int k=1;k<=i;k++)
			{
				a=(char)(a+count-1);
				System.out.print(a);
				a++;
			}
			
			System.out.println();
		}
	}
}
