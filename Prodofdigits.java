import java.util.Scanner;
class Prodofdigits 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your number");
		int n1=sc.nextInt();
		test1(n1);
	}
	public static void test1(int num)
		int prod=1;
	{
		while(num>0)
		{
			int rem=num%10;
			prod=prod*rem;
			num=num/10;
		}
		System.out.println(prod);
	}
}
