import java.util.Scanner;
class C7
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter m : ");
		int m=sc.nextInt();
		System.out.println("Enter n : ");
		int n=sc.nextInt();
		int count=0;
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
		if((sum==prod)&&(i%2!=0))
			count++;
		System.out.println(count);
		}
	}
}
