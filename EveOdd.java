import java.util.Scanner;
class EveOdd
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter m value");
		int m=sc.nextInt();
		System.out.println("Enter n value");
		int n=sc.nextInt();
		System.out.println("The even numbers between "+m+" and "+n+" are");
		for(int i=m;i<=n;i++)
		{
			if(i%2==0)
			System.out.println(i);
		}
		System.out.println("The odd numbers between "+m+" and "+n+" are");
		for(int i=m;i<=n;i++)
		{
		if(i%2!=0)
			System.out.println(i);
		}
	}
}
