import java.util.Scanner;
class my4 
{
	public static void main(String[] args) 
	{
		int count=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your number");
		int n=sc.nextInt();
		while(n>0)
		{
			int rem=n%10;
			if(rem%2==0)
			count=count+1;
		n=n/10;
		}
		System.out.println(count);
	}
}