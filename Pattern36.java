class Pattern36
{
	public static void main(String[] args) 
	{
		int n=1;
		char c='A';
		for(int i=1;i<=4;i++)
		{
			for(int j=1;j<=4;j++)
			{
				if(j==1)
				{
		System.out.print(n++ + " ");
				}
				else if(j==3)
				{
					System.out.print(c++ + " ");
				}
			else if(j==2)
			{
				System.out.print("!" + " ");
			}
			else
			{
				System.out.print("#" + " ");
			}
			}
				System.out.println(" ");
		}
	}
}
