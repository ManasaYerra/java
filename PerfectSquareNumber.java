import java.util.Scanner;
class PerfectSquareNumber
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int n=sc.nextInt();
		boolean status=true;
		for(int i=1;i<n;i++)
		{
			if(i*i==n)
			{
				status=true;
				break;
			}
		}
		if(status==true)
		{
			System.out.println(n+ "is a perfect square number");
		}
		else
		{
			System.out.println(n+ "is not a perfect square number");
		}
	}
}
