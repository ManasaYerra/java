import java.util.Scanner;
class C9
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter first value ");
		int num1=sc.nextInt();
		System.out.println("Enter last value ");
		int num2=sc.nextInt();
		test1(num1,num2);
	}
	public static void test1(int m,int n)
	{
		int count=0;
		int nthnum=10;
		for(int i=m;i<=n;i++)
		{
		int sum=0;
		int prod=1;
		int temp=i;
		while(temp>0)
		{
			int rem=temp%10;
			sum=sum+rem;
			prod=prod*rem;
            temp=temp/10;
		}
		if(sum==prod)
			count=count+1;
		if(count==nthnum-1)
			{
		System.out.println(i);
		break;
			}
		}
	}
}