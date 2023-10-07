import java.util.Scanner;
class SpyNumb2
{
	public static int countSpy(int m,int n) 
		{
			int count=0;
			for(int i=m;i<=n;i++)
			{
				int temp=i;
				int sum=0;
				int product=1;
				while(temp>0)
				{
					int rem=temp%10;
					sum=sum+rem;
					product=product*rem;
					temp=temp/10;
				}
				if(sum==product)
				{
					count++;
				}
			}
			return count;
	}
			public static void main(String[]args)
				{
					Scanner sc=new Scanner(System.in);
					System.out.println("Enter first number");
					int firstnumber=sc.nextInt();
					System.out.println("Enter last number");
					int lastnumber=sc.nextInt();
					System.out.println(countSpy(firstnumber,lastnumber));
	}
}