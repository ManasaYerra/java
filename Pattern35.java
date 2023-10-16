class Pattern35
{
	public static void main(String[] args) 
	{
		int n=1;
		char c='a';
		for(int i=1;i<=4;i++)
		{
			int temp=i+96;
			for(int j=1;j<=4;j++)
			{
				if(j==1||j==4)
				{
		System.out.print(n + " ");
		n=n+2;
		if(n>9)
			n=1;
				}
				else
				{
					System.out.print(c++ + " ");
					c++;
				}
			}
				System.out.println(" ");
		}
	}
}
