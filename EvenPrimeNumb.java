import java.util.Scanner;
class EvenPrimeNumb
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter m : ");
		int m=sc.nextInt();
		System.out.println("Enter n : ");
		int n=sc.nextInt();
		for(int i=m;i<=n;i++)
		{
			int count=0;
			if(i>1)
			{
				for(int x=2;x<=i/2;x++)
				{
					if(i%x==0)
						count++;
				}
				if(count==0 && i%2==0)
					System.out.println(i);
			}
		}
	}
}