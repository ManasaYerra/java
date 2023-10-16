class Pattern54
{
	public static void main(String[] args) 
	{
		int rows=4;
		int columns=4;
		int n=2;
		for(int i=1;i<=rows;i++)
		{
			for(int j=1;j<=columns;j++)
			{
				if(i==4 || j==1 || i==j) 
				{
		System.out.print(n + " ");
		n=n+2;
				}
				else
				{
					System.out.print(" " + " ");
				}
				if(n>9)
					n=2;
			}
					System.out.println(" ");
		}
	}
}

