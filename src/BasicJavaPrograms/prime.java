package BasicJavaPrograms;
import java.util.Scanner;
public class prime
{
	public static void main(String[]args)


	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a value");
		int n=sc.nextInt();
		int count=0;
		for(int i=1;i<n;i++)
		{
			if(n%i==0)
			{
				count++;
			}
		}
		if(count==1)
		{
			System.out.println(n +" is prime");
		}
		else
		{
			System.out.println(n +" is not prime");
		}
		sc.close();
	}
}