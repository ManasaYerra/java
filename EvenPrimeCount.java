import java.util.Scanner;
class EvenPrimeCount
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter m : ");
		int m=sc.nextInt();
		System.out.println("Enter n : ");
		int n=sc.nextInt();
		int count=0;
		for(int i=m;i<=n;i++)
		{
			int count1=0;
			if(i>1)
			{
				for(int x=2;x<=i/2;x++)
				{
					if(i%x==0)
						count++;
				}
				if(count1==0 && i%2==0)
					count++;
			}
		}
			System.out.println(count);
	}
}
