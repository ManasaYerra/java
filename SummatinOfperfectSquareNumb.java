import java.util.Scanner;
class SummatinOfperfectSquareNumb
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
			boolean status=false;
			for(int x=1;x<=i;x++)
			{
				if(x*x==i)
				{
					status = true;
					break;
				}
				if (status==true)
					sum+=i;
			}
		}
		System.out.println(sum);
	}
}