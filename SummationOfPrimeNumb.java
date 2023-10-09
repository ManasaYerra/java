import java.util.Scanner;
class SummationOfPrimeNumb
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter m : ");
		int m=sc.nextInt();
		System.out.println("Enter n : ");
		int n=sc.nextInt();
		int sum=0;
		for(int i=m;i<=n;i++)
		{
			int count=0;
			if(i>1)
			{
				for(int x=1;x<=i;i++)
				{
					if(i%x==0)
						count++;
				}
				if(count==2)
					sum=sum+i;
			}
		}
		System.out.println(sum);
	}
}