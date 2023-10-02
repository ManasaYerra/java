import java.util.Scanner;
class nthnum
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter m value");
		int m=sc.nextInt();
		System.out.println("Enter n value");
		int n=sc.nextInt();
		int nthnum=4;
		int nthnextnum=nthnum+1;
		int count=0;
		for(int i=m;i<=n;i++)
		{
			count++;
			if(count==nthnextnum)
			{
				System.out.println(i);
				break;
			}
		}
	}
}