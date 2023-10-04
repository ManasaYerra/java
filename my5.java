import java.util.Scanner;
class my5 
{
	public static void main(String[] args) 
	{
		int count=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter n value");
		int n=sc.nextInt();
		while(n>0)
		{
			int rem=n%10;
			if(rem%2==0)
				count++;
			n=n/10;
		}
		System.out.println(count);
	}
}
