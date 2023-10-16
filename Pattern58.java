class Pattern58
{
	public static void main(String[] args) 
	{
		int rows=4;
		int columns=4;
		int n=1;
		for(int i=1;i<=rows;i++)
		{
			for(int j=1;j<=columns;j++)
			{
				if(i==1 || j==4 || i==j) 
				{
		System.out.print(n++ + " ");
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


