import java.util.Scanner;
class my2
{
	public static void main(String[]args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your num");
		int n1=sc.nextInt();
		test2(n1);
	}
	public static void test2(int num)
	{
		int sum=0;
		while(num>0)
		{
			int rem=num%10;
			if(rem%2==0)
				sum=sum+rem;
			num=sum/10;
		}
		System.out.println(sum);
	}
}