import java.util.Scanner;
class PerfectNumber
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int n=sc.nextInt();
		int sof=0;
		for(int i=1;i<n;i++)
		{
			if(n%i==0)
			{
				sof=sof+i;
			}
		}
		if(sof==n)
		{
			System.out.println(n+ "is a perfect number");
		}
		else
		{
			System.out.println(n+ "is not a perfect number");
		}
	}
}
