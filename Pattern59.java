class Pattern59
{
	public static void main(String[] args) 
	{
		int rows=4;
		int columns=4;
		char c='a';
		for(int i=1;i<=rows;i++)
		{
			for(int j=1;j<=columns;j++)
			{
				if(i==1 || j==4 || i==j) 
				{
		System.out.print(c++ + " ");
				}
				else
				{
					System.out.print(" " + " ");
				}
			}
					System.out.println(" ");
		}
	}
}


