import java.util.Scanner;
class EvenPerfectNumb 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter first and last number");
		int m=sc.nextInt();
		int n=sc.nextInt();
		for(int i=m;i<=n;i++)
		{
			int sum=0;
			for(int j=1;j<=i/2;j++)
			{
				if(i%j==0)
					sum+=j;
			}
			if((sum==i)&&(i%2==0))
			System.out.println(i);
		}
	}
}

