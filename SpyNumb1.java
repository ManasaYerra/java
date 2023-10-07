import java.util.Scanner;
class SpyNumb1 
{
	public static boolean checkSpy(int n) 
	{
		int temp=n;
		int sod=0;
		int pod=1;
		while(temp>0) 
		{
			int rem=temp%10;
			sod=sod+rem;
			pod=pod*rem;
			temp=temp/10;
		}
		if(sod==pod)
		{
			return true;
		}
		else
			return false;
	}
	public static void main(String[]args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the starting number");
		int m=sc.nextInt();
		System.out.println("Enter the last number");
		int n=sc.nextInt();
		for(int i=m;i<=n;i++)
		{
			if(checkSpy(i))
			{
				System.out.println(i);
			}
		}
	}
}
