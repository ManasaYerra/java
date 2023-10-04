import java.util.Scanner;
class my3 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your number");
		int n1=-sc.nextInt();
		test3(n1);
	}
	public static void test3(int num)
	{
		int prod=1;
		while(num>0)
		{
			int rem=num%10;
			if(rem%2==0)
				prod=prod*rem;
			num=num/10;
		}
		System.out.println(prod);
	}
}
