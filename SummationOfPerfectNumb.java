import java.util.Scanner;
class SummationOfPerfectNumb 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter first and last number");
		int m=sc.nextInt();
		int n=sc.nextInt();
		int sum1=0;
		for(int i=m;i<=n;i++)
		{
			int sum2=0;
			for(int j=1;j<=i/2;j++)
			{
				if(i%i==0)
					sum2+=j;
			}
			if(sum2==i)
				sum1+=i;	
			}
			System.out.println(sum1);
	}
}
