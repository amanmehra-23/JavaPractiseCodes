import java.util.*;
class Main
{
	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);

	System.out.println("Enter number in decimal format :");
	int n= s.nextInt();

	int arr[]= new int[10];
	int i=0;


	while(n>0)
	{
		int temp= n%2;
		arr[i]=temp;
		i++;
		n=n/2;
	}

	System.out.println(" number in Binary format :");
	for(i=arr.length-1;i>=0;i--)
	{
		System.out.print(arr[i]);
	}
	}
}