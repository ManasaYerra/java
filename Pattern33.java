class Pattern33 
{
	public static void main(String[] args) 
	{
		int n=1;
		char c='a';
		for(int i=1;i<=4;i++)
		{
			for(int j=1;j<=4;j++)
			{
			int temp=i;
			if(j==1 || j==3)
			{
		System.out.print(n++ + " ");
		temp=temp+4;
			}
			else
			{
				System.out.print(c++ + " ");
			}
				System.out.println(" ");
		}
	}
}
